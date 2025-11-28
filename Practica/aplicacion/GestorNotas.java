package Practica.aplicacion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.File;


import Practica.dominio.Alumno;
import Practica.excepcion.ErrorFicheroNotasException;
import Practica.excepcion.NotaInvalidaRuntimeException;

public class GestorNotas {

    public void guardarAlumnos(List<Alumno> alumnos, String nombreFichero)
            throws ErrorFicheroNotasException {

        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreFichero))) {

            for (Alumno a : alumnos) {
                pw.println(a.getNombre() + "," + a.getNota());
            }

        } catch (IOException e) {
            throw new ErrorFicheroNotasException(
                    "Error de I/O al guardar el fichero: " + nombreFichero, e);
        }
    }

    // ... Implementación del Método B a continuación ...

    public List<Alumno> cargarAlumnos(String nombreFichero)
        throws ErrorFicheroNotasException {

        List<Alumno> alumnos = new ArrayList<>();
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {

            while ((linea = br.readLine()) != null) {

                try {
                    String[] partes = linea.split(",");
                    if (partes.length < 2) {
                        throw new IllegalArgumentException("Línea sin separador de datos (',').");
                    }

                    String nombre = partes[0].trim();
                    double nota = Double.parseDouble(partes[1].trim());

                    // === Validación de rango ===
                    if (nota < 0.0 || nota > 10.0) {
                        throw new NotaInvalidaRuntimeException(nota);
                    }

                    alumnos.add(new Alumno(nombre, nota));

                } catch (IllegalArgumentException | NotaInvalidaRuntimeException e) {
                    System.err.println("ERROR en la línea: '" + linea +
                                    "'. Se ignorará. Causa: " + e.getMessage());
                }
            }

            if (alumnos.isEmpty()) {
                throw new ErrorFicheroNotasException(
                "El fichero '" + nombreFichero + "' está vacío o no contiene alumnos válidos.");
            }

            return alumnos;

        } catch (IOException e) {
            throw new ErrorFicheroNotasException("Error de I/O al cargar el fichero: " + nombreFichero, e);
        }
    }
    
    public void eliminarFichero(String nombreFichero) throws ErrorFicheroNotasException {
    File f = new File(nombreFichero);

        // Intento de borrado
        if (!f.delete()) {
            throw new ErrorFicheroNotasException(
                "No se pudo eliminar el fichero: " + nombreFichero +
                ". Puede que no exista o no se tengan permisos.");
        }
    }

}


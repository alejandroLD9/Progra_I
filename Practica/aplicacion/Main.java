package Practica.aplicacion;

import Practica.dominio.Alumno;
import Practica.excepcion.ErrorFicheroNotasException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String FICHERO_PRUEBA = "notas_test.txt";
        GestorNotas gestor = new GestorNotas();

        //Prueba de Rango: incluye nota fuera de [0-10]
        List<Alumno> listaInicial = Arrays.asList(
                new Alumno("Juan", 7.5),
                new Alumno("Ana", 9.25),
                new Alumno("Roberto", 3.0),
                new Alumno("Pepe", 12.0)   //nota inválida 
        );

        //Escritura e Inserción de un Error de Formato
        try {
            gestor.guardarAlumnos(listaInicial, FICHERO_PRUEBA);
            System.out.println("Datos iniciales escritos.");

            // Simulación de un error de formato añadido al fichero
            try (PrintWriter pw = new PrintWriter(new FileWriter(FICHERO_PRUEBA, true))) {
                pw.println("Maria Lopez,nota_mala_aqui");
            }

        } catch (ErrorFicheroNotasException | IOException e) {
            System.err.println("\n*** ERROR CRÍTICO AL INICIALIZAR DATOS. ***");
            System.err.println(e.getMessage());
            return;
        }

        //Lectura y Captura Final 
        try {
            System.out.println("\n--- Intentando cargar los alumnos ---");
            List<Alumno> listaCargada = gestor.cargarAlumnos(FICHERO_PRUEBA);

            System.out.println("\n--- Alumnos cargados correctamente: ---");
            listaCargada.forEach(System.out::println);

        } catch (ErrorFicheroNotasException e) {
            System.err.println("\n*** ERROR EN EL PROCESO DE CARGA DE DATOS. ***");
            System.err.println("Causa principal: " + e.getMessage());
            return;
        }

        //Prueba de Eliminación del Fichero
        System.out.println("\n--- Intentando eliminar el fichero ---");
        try {
            gestor.eliminarFichero(FICHERO_PRUEBA);
            System.out.println("Fichero eliminado correctamente.");

        } catch (ErrorFicheroNotasException e) {
            System.err.println("No se pudo eliminar el fichero.");
            System.err.println(e.getMessage());
        }
    }
}


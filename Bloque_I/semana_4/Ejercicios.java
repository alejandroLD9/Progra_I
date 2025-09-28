package semana_4;

import java.util.ArrayList;

public class Ejercicios {
    public static void main(String[] args) {
        /*1. */int[] numeros = {6, 7, 2, 9, 5};
        imprimirArray(numeros);
        System.out.println("Suma total: " + calcularSuma(numeros));
        System.out.println("Suma de impares: " + sumarImpares(numeros));
        /*2. */int[] n = {5, 1, 3, 4};
        System.out.println(estaNumero(n, 3));
        System.out.println(estaNumero(n, 7));
        /*3. */ArrayList<String> nombres = new ArrayList <>();
        nombres.add("Alejandro");
        nombres.add("Carlos");
        nombres.add("Paloma");
        nombres.add("Alberto");
        nombres.add("Ana");
        mostrarLista(nombres);
        nombres.remove("Ana");
        mostrarLista(nombres);
        mostrarNombresQueEmpiezanPorA(nombres);
        eliminarNombresQueEmpiezanPorA(nombres);
        mostrarLista(nombres);
        

    }

    //Ejercicio 1
     public static void imprimirArray(int[] numeros) {
        System.out.println("Elementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static int calcularSuma(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    public static int sumarImpares(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                suma += numeros[i];
            }
        }
        return suma;
    }

    //Ejercicio 2 
    public static String estaNumero (int[] n, int numero){
       for (int i = 0; i < n.length; i++) {
            if (n[i] == numero) {
                return "El numero " + numero + " pertenece al array";
            }
        }
        return "El numero " + numero + " NO pertenece al array";
    }

    //Ejercicio 3 
    public static void mostrarNombresQueEmpiezanPorA(ArrayList<String> lista) {
        System.out.println("\nNombres que comienzan por 'A':");
        for (String nombre : lista) {
            if (nombre.startsWith("A")) {
                System.out.println(nombre);
            }
        }
    }

    public static void eliminarNombresQueEmpiezanPorA(ArrayList<String> lista) {
        lista.removeIf(nombre -> nombre.startsWith("A"));
    }

    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("\nLista:");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }

}


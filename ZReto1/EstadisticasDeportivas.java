package ZReto1;

import java.util.Scanner;

public class EstadisticasDeportivas {

    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Jorge", "Alejandro"};
        int[][] puntuaciones = {
            {10, 4, 6},
            {9, 8, 9},
            {7, 7, 9}
            
        };
        mostrarTodasLasPuntuaciones(nombres, puntuaciones);
        System.out.println(jugadorConMejorMedia(nombres, puntuaciones));
        System.out.println(buscarPuntuacionAlta(puntuaciones[2], 8));
        int[] nuevasPuntuaciones = leerPuntuacionesJugador();

    }
    public static double calcularMedia(int[]puntuaciones){
        int suma = 0;
        for (int i = 0; i < puntuaciones.length; i++ ){
           suma += puntuaciones[i]; 
        }
        return 1.0 * suma/puntuaciones.length;
    }

    public static void mostrarTodasLasPuntuaciones(String[] nombres, int[][] puntuaciones) {
        for (int j = 0; j < puntuaciones.length; j++) {
            System.out.print(nombres[j] + ": ");
            for (int i = 0; i < puntuaciones[j].length; i++) {
                System.out.print(puntuaciones[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static String jugadorConMejorMedia(String[] nombres, int[][] puntuaciones) {
        double mejorMedia = 0;
        String mejorJugador = "No hay ningun jugador con buena media";

        for (int i = 0; i < puntuaciones.length; i++) {
            double media = calcularMedia(puntuaciones[i]);
            if (media > mejorMedia) {
                mejorMedia = media;
                mejorJugador = nombres[i];
            }
        }

        return mejorJugador + " con una media de " + mejorMedia;
    }

/*     public static boolean buscarPuntuacionAlta(int[] puntuaciones, int umbral){
        for(int i = 0; i < puntuaciones.length; i++){
            if(puntuaciones[i] > umbral){
                return true;
            }
        }
        return false; 
    } */

    public static boolean buscarPuntuacionAlta(int[] puntuaciones, int umbral) {
        double media = calcularMedia(puntuaciones);
        return media > umbral;
    }

    public static int[] leerPuntuacionesJugador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas puntuaciones quieres introducir? ");
        int cantidad = sc.nextInt();

        int[] nuevasPuntuaciones = new int[cantidad];
        System.out.println("Introduce tus puntuaciones:");

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Puntuación " + (i + 1) + ": ");
            nuevasPuntuaciones[i] = sc.nextInt();
        }

        sc.close();
        return nuevasPuntuaciones;
    }
}

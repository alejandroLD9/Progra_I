package semana_2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String tuNombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Hola, " + tuNombre + ". Tienes " + edad + " años.");

        int diasVividos = edad * 365;
        System.out.println("Has vivido aproximadamente " + diasVividos + " días.");
        sc.close();
    }
}

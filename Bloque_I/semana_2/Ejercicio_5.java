package semana_2;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        sc.close();
        if(n < 0){
            if (n % 2 == 0) {
                System.out.println("El número es negativo y par.");
            } else {
                System.out.println("El número es negativo e impar.");
            }
        }else if (n > 0){
             if (n % 2 == 0) {
                System.out.println("El número es positivo y par.");
            } else {
                System.out.println("El número es positivo e impar.");
            }
        }else{
            System.out.println("El número es 0, es par.");
        }
    }
}

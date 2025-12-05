package ZReto2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ ORA ---");
            System.out.println("1. Registrar ticket");
            System.out.println("2. Ver vencidos por zona");
            System.out.println("3. Ver activos por zona");
            System.out.println("4. Ver todo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                
                System.out.print("Matrícula: ");
                String sc = scanner.nextLine();
                System.out.print("Zona (nº): ");
                int zona = Integer.parseInt(scanner.nextLine());
                System.out.print("Minutos: ");
                int min = Integer.parseInt(scanner.nextLine());

                agenda.add(new Ticket(sc, zona, LocalDateTime.now(), min));
                System.out.println("Ticket guardado.");

            } else if (opcion == 2) {
                
                System.out.print("Zona a consultar: ");
                int i = Integer.parseInt(scanner.nextLine());
                System.out.println(agenda.filtrarVencidos(i));

            } else if (opcion == 3) {
                
                System.out.print("Zona a consultar: ");
                int i = Integer.parseInt(scanner.nextLine());
                System.out.println(agenda.filtrarActivos(i));

            } else if (opcion == 4) {
                
                System.out.println(agenda); 

            } else if (opcion == 0) {
                
                continuar = false;
                System.out.println("Adiós.");

            } else {
                System.out.println("Opción incorrecta.");
            }
        }
        
        scanner.close();
    }
}

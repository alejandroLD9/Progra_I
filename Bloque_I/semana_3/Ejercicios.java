package semana_3;

public class Ejercicios {

    public static void main(String[] args) {
        /*1. */saludar("Alejandro");
        saludar("Ceci");
        /*2. */System.out.println("el cuadrado de 5 es: " + cuadrado(5));
        /*3. */int a = 8;
        int b = 4; 
        System.out.println(a + " + " + b + " = " + sumar(a, b));
        System.out.println(a + " - " + b + " = " + restar(a, b));
        System.out.println(a + " * " + b + " = " + multiplicar(a, b));
        System.out.println(a + " / " + b + " = " + dividir(a, b));
        /*4. */generarPatron(3);
        generarPatron(5);
        /*5. */int[] numeros = {10, 20, 30, 40, 50};
        mostrarEstadisticas(numeros);
        int[] vacio = {};
        mostrarEstadisticas(vacio);
    }

    // Ejercicio 1
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }
    /*La variable nombre es un parámetro del método saludar. Su ámbito está limitado al bloque de código 
    del método. Solo existe y se puede usar dentro de ese método. Fuera de ahí, no es accesible.*/
    
    //Ejercicio 2 
    public static int cuadrado(int x) {
        /*
        * Calcula y devuelve el cuadrado de un número entero.
        * @param x El número que se va a elevar al cuadrado.
        * @return El resultado de x multiplicado por sí mismo.
        */
        return x * x;
    }

    //Ejercicio 3
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return 0; // Devuelve 0 en caso de error
        }
        return a / b;
    }

    //Ejercicio 4
    public static void generarPatron(int n) {
        for (int i = 1; i <= n; i++) {           // filas
            for (int j = 1; j <= i; j++) {       // columnas
                System.out.print("*");
            }
            System.out.println();                 // salto de línea
        }
    }
    //Ejercicio 5 
    public static double calcularPromedio(int[] numeros) {
        if (numeros.length == 0) {
            System.out.println("Error: el array está vacío.");
            return 0;
        }

        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }

        return (double) suma / numeros.length;
    }

    public static void mostrarEstadisticas(int[] numeros) {
        double promedio = calcularPromedio(numeros);
        if (numeros.length != 0) {
            System.out.println("El promedio es: " + promedio);
        }
    }
}

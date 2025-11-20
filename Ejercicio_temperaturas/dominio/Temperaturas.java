package Ejercicio_temperaturas.dominio;

public class Temperaturas {

        public static void main(String[] args) {
            //Mostrar temperaturas de cada dia
        int[] temperaturas = {22, 24, 19, 21, 25, 20, 23};
        mostrarTemperaturas(temperaturas);
            //Mostrar media
        double media = calcularMedia(temperaturas);
        System.out.println("Temperatura media: " + media + "°C");
            //Mostar dia mas caluroso y mas frio
        System.out.println(mayorTemp(temperaturas));
        System.out.println(menorTemp(temperaturas));
    }

    public static void mostrarTemperaturas(int[] temperaturas){
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + "°C");
        }
    }

    public static double calcularMedia(int[] temperaturas){
        int suma = 0;
        for (int t : temperaturas) {
            suma += t;
        }
        return (double) suma / temperaturas.length;
    }

    public static String mayorTemp (int[] temperaturas){
        int mayor = temperaturas[0];
        int dia = 0;
        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] > mayor){
                mayor = temperaturas [i];
                dia = i + 1;
            }
        }
        return "El dia mas caluroso fue el dia "+ dia + " con " + mayor + " °C";
    }
    
    public static String menorTemp (int[] temperaturas){
        int menor = temperaturas[0];
        int dia = 0;
        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] < menor){
                menor = temperaturas [i];
                dia = i + 1;
            }
        }
        return "El dia mas frio fue el dia "+ dia + " con " + menor + " °C";
    }
     
    public static int contarDiasPorEncimaDeMedia(int[] temperaturas, double media) {
        int contador = 0;
        for (int t : temperaturas) {
            if (t > media) {
                contador++;
            }
        }
        return contador;
    }

    public static double[] convertirAFahrenheit(int[] temperaturas) {
        double[] fahrenheit = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            fahrenheit[i] = temperaturas[i] * 9.0 / 5 + 32;
        }
        return fahrenheit;
    }


}

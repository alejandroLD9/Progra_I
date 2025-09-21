package semana_2;

public class Ejercicio_3 {
    public static void main (String[]args){
        
        int convertirInt = 9;
        double convertidoDouble = convertirInt;
        System.out.println("int a double: " + convertidoDouble);
        double convertirDouble = 5.7;
        int convertidoInt = (int)convertirDouble; 
        System.out.println("double a int: " + convertidoInt);
        String numeroEnteroTexto = "743";
        String numeroDecimalTexto = "32.27";
        // Conversión a int
        int numeroEntero = Integer.parseInt(numeroEnteroTexto);
        System.out.println("String a int: " + numeroEntero);
        // Conversión a double
        double numeroDecimal = Double.parseDouble(numeroDecimalTexto);
        System.out.println("String a double: " + numeroDecimal + "\n");
        /*¿Qué ocurre si intentas convertir "abc" a int? 
        Que el compilador lanza una excepcion ya que abc no es un numero entero.*/
    }
}

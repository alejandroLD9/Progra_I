package semana_2;

public class Ejercicio_1 {
    public static void main (String[]args){
        
        int i = 7;
        double d = 3.14;
        boolean b = true;
        char c = 'a';
        String nombre = "Alejandro";
        System.out.println("String: "+ nombre +"\nChar: "+ c +"\nBoolean: "
                            + b +"\nDouble: "+ d +"\nInt: "+ i+ "\n");
        /*¿Qué ocurre si intentas asignar un valor decimal a una variable int?
        Que el compilador dara error ya que el valor que espera una variable int
        es un entero sin decimales.*/
    }
}
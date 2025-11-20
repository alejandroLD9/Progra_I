package semana_5;

public class Ejercicios {
    
    public static void main(String[] args){
        /*1. */int[] numeros = {5, 12, 3, 20, 8}; 
        int mayor = encontrarMayor(numeros);
        int menor = encontrarMenor(numeros);

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        /*2. */ String contraseña = "Programacion123";
        System.out.println(contraseñaValida(contraseña));
    }

    //Ejercicio 1
     public static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }

    //Ejercicio 2
    public static String contraseñaValida (String contraseña){
        if(contraseña.length() >= 8){
            for (char c : contraseña.toCharArray()){
                if (c >= '0' && c <= '9'){
                    return "La contraseña es valida";
                }
            }
            return "Contraseña invalida";
        }
        return "Contraseña invalida";
   
    }
    //Ejercicio 3
}

package Practica.excepcion;

public class NotaInvalidaRuntimeException extends RuntimeException {

    private double nota;

    public double getNota (){
        return nota;
    }
    public NotaInvalidaRuntimeException(Double nota) {
        super("Nota fuera de rango [0-10]: " + nota);
    }
}

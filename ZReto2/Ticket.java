package ZReto2;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    
    private String matricula;
    private int zona;
    private LocalDateTime inicio;
    private LocalDateTime fin;

    
    public Ticket(String matricula, int zona, LocalDateTime inicio, int duracion) {
        this.matricula = matricula;
        this.zona = zona;
        this.inicio = inicio;
        
        this.fin = inicio.plusMinutes(duracion);
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getZona() {
        return zona;
    }
    public void setZona(int zona) {
        this.zona = zona;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }
    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }
    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public long getDuracion() {
        return Duration.between(inicio, fin).toMinutes();
    }

    public boolean vencido() {
        return LocalDateTime.now().isAfter(fin);
    }

    // Método toString
    @Override
    public String toString() {

        return "El ticket con Matrícula " + matricula + " que esta en la zona " + zona +
                " con una duración de " + getDuracion() + " ¿esta vencido? " + vencido();
    }
}

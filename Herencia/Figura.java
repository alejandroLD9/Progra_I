package Herencia;

import java.awt.*;


abstract class Figura implements Dibujable {
    protected int x, y; // posición
    protected Color colorFondo;
    protected Color colorTrazo;

    public Figura(int x, int y, Color colorFondo, Color colorTrazo) {
        this.x = x;
        this.y = y;
        this.colorFondo = colorFondo;
        this.colorTrazo = colorTrazo;
    }

    protected Punto2D centro;
    public Figura(Punto2D centro) {
        this.centro = centro;
    }

    public abstract double area();
    public abstract double perimetro();
}



  
    


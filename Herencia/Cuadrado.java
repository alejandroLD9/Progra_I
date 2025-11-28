package Herencia;

import java.awt.*;

class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int x, int y, int lado, Color colorFondo, Color colorTrazo) {
        super(x, y, colorFondo, colorTrazo);
        this.lado = lado;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(colorFondo);
        g.fillRect(x, y, lado, lado);
        g.setColor(colorTrazo);
        g.drawRect(x, y, lado, lado);
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return 4 * lado;
    }
}


package Herencia;

import java.awt.*;

public class Circulo extends Figura {
    private int radio;

    public Circulo(int x, int y, int radio, Color colorFondo, Color colorTrazo) {
        super(x, y, colorFondo, colorTrazo);
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(colorFondo);
        g.fillOval(x, y, radio * 2, radio * 2);
        g.setColor(colorTrazo);
        g.drawOval(x, y, radio * 2, radio * 2);
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}

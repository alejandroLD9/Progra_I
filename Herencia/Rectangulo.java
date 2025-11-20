package Herencia;

import java.awt.*;

class Rectangulo extends Figura {
    private int ancho, alto;

    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    public Rectangulo(int x, int y, int ancho, int alto, Color colorFondo, Color colorTrazo) {
        super(x, y, colorFondo, colorTrazo);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(colorFondo);
        g.fillRect(x, y, ancho, alto); // relleno
        g.setColor(colorTrazo);
        g.drawRect(x, y, ancho, alto); // borde
    }

}


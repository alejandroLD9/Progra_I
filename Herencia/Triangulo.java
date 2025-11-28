package Herencia;

import java.awt.*;

class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(int x, int y, int base, int altura, Color colorFondo, Color colorTrazo) {
        super(x, y, colorFondo, colorTrazo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar(Graphics g) {
        int[] xs = { 
            x,               // vértice izquierdo de la base
            x + base,        // vértice derecho de la base
            x + base / 2     // vértice superior
        };

        int[] ys = {
            y + altura,      // vértice izquierdo base
            y + altura,      // vértice derecho base
            y                // vértice superior
        };

        g.setColor(colorFondo);
        g.fillPolygon(xs, ys, 3);

        g.setColor(colorTrazo);
        g.drawPolygon(xs, ys, 3);
    }

    public double area() {
        return base * altura / 2.0;
    }

    public double perimetro() {
        // lados iguales del triángulo isósceles
        double lado = Math.sqrt(Math.pow(base / 2.0, 2) + Math.pow(altura, 2));
        return lado * 2 + base;
    }
}


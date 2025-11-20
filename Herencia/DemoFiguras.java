package Herencia;

import javax.swing.*;
import java.awt.*;


public class DemoFiguras {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujar Figuras con Colores");
        PanelFiguras panel = new PanelFiguras();

        // Añadimos algunas figuras con colores
        panel.agregarFigura(new Circulo(50, 50, 40, Color.YELLOW, Color.RED));
        panel.agregarFigura(new Rectangulo(150, 100, 80, 50, Color.GREEN, Color.BLUE));

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

package Herencia;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class PanelFiguras extends JPanel {
    private List<Figura> figuras = new ArrayList<>();

    public void agregarFigura(Figura f) {
        figuras.add(f);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Figura f : figuras) {
            f.dibujar(g);
        }
    }
}
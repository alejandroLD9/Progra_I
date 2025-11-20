package Herencia;

public class Punto2D {
    private int coorX;
    private int coorY;
    
    public Punto2D(int x, int y){
        coorX = x;
        coorY = y;
        }
    
    public Punto2D() {
        coorX = coorY = 0;
    }
    
    public int getX() {
        return coorX;
    }
    
    public void setX(int x) {
        coorX = x;
    }
    
    public int getY() {
        return coorY;
    }
    
    public void setY(int y) {
        coorY = y;
    }
    
    public String toString() {
        return "(" + coorX + "," + coorY + ")";
    }
    
    public double distancia(Punto2D otro) {
        return Math.sqrt(Math.pow(coorX - otro.coorX, 2) + Math.pow(coorY - otro.coorY, 2));
    }
    
    
}
 


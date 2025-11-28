package E2G;

public class RaicesImaginarias extends Exception{
    double real, imag;
    public RaicesImaginarias (double r, double i){
        real=r; imag=i;
    }
    public double getReal(){
        return real;
    }
    public double getImag(){
        return imag;
    }
}
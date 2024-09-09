package ejercicios;

public class Multiplicar {
    private int n;
    public Multiplicar(){
        this.n = (n > 0) ? n : 1; 
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = (n > 0) ? n : 1; 
    }
    
    public double calcularMulti(){
        double producto =0.0;
        for(int i =1; i<=10;i++){
             producto = n *i;
        }
        return producto;
    }
}

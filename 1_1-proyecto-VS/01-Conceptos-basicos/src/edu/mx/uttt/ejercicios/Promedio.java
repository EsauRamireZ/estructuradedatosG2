package ejercicios;

public class Promedio {
    private int n;
    public Promedio(){
        this.n = (n > 0) ? n : 1;   
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }
   
    public double calcularPromedio(){
        double prom =1.0;
        for(int i=1;i<=n;i++){
        prom +=prom;
        prom= prom/n;
        }
        return prom;
    }
}

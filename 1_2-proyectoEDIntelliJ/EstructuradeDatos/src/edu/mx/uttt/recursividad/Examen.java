package edu.mx.uttt.recursividad;

public class Examen {
    private int n;
    public Examen(){
        this.n = (n > 0) ? n : 1;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = (n > 0) ? n : 1;
    }
    public double ejercicio2(double n){
        if(n==1){
        return n;
    }else{
        return ejercicio2 (1)/(n+1)*(n) ;
    }

    }
}



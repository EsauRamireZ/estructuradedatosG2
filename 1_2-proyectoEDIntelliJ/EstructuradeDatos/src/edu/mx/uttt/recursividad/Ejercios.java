package edu.mx.uttt.recursividad;

public class Ejercios {

    private double n=0.0;
    public Ejercios(){
        this.n= 1.0;
    }
    
    public double getN() {
        return n;
    }
     
    public void setN(double n) {
        this.n = (n > 0) ? n : 1;
    }

 public double divisionPositivoFor(){
     double d = 0.0;
    for(int i=3;i<=this.n;i++){
    d/=i;
    }
  return d;
 }
 public double divisionPositivoWhile(){
    double d= 0.0;
    int i= 3;
    while (i <= this.n) {
        d /= i;
        i++;
    }
    return d;
   }
   public double divisionPositivoDoWhile(){
    double d= 0.0;
    int i= 3;
    do{
     d/=i;
     i++;
    }while(i<=this.n);
    return d;
   }



  
}

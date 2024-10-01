package edu.mx.uttt.recursividad;

public class Operaciones {
 private int n;
 public Operaciones(){
  this.n = 1;
 }
public int getN(int n) {
    return n;
}
public void setN() {
    this.n = (n<=0)?n:1;
}
 //Metodo Iterativo
 public void imprimir(){
    int i = 1;
    while(i<=n){
        System.out.println("Hola Mundo");
        i++;
    }
 }
  public void imprimir(int n){
    //Caso Base
    if(n==1){
        System.out.println("Hola mundo");
    }else{
        System.out.println("Hola Mundo");
        imprimir(n-1);
    }
  }
  public void imprimir2(){
    if(n==1){
       
    }

  }
}

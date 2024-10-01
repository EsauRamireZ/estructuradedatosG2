package edu.mx.uttt.recursividad;

 public class MultiplicacioSuma {
private int n ;
private int x;
public MultiplicacioSuma(){
    this.n = (n > 0) ? n : 1;  
    this.x = (x > 0) ? x : 1;

}
public int getN() {
    return n;
}
public void setN(int n) {
    this.n = (n > 0) ? n : 1;    
}

public int getX() {
    return x;
}
public void setX(int x) {
    this.x = (x > 0) ? x : 1; 
}
public int calcularMul(int n, int x){
     if(x==1){
        return n;
     }else{
        return n + calcularMul(n,x-1);
     }
}
public void tablaMultiplicar(int n, int x){
    if(x>10)
    return;
    tablaMultiplicar(n, x+1);
}
// public int MCD (int n){
//     if(n==1){
//         return n;
//     }
public static int calcularMCD(int n, int x) {
    if (x == 0) {
        return n; // Caso base
    } else {
        //Caso General
        // Imprimir cociente y residuo
        System.out.println("Cociente de " + n + " / " + x + " : " + (n / x));
        System.out.println("Residuo de " + n + " % " + x + " : " + (n % x));
        return calcularMCD(x, n % x); // Llamada recursiva
    }
}

}



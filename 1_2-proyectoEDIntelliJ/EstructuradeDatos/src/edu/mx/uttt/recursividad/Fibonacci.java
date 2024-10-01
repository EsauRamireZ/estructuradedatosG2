package edu.mx.uttt.recursividad;

public class Fibonacci {
 private int n;

public int getN() {
    return n;
}

public void setN(int n) {
    if(n>=0){
        this.n=n;
    }
}
public int calFib(int n){
    //caso base
 //return (n<=1)?n:calFib(n-1)+calFib(n-2);
 if(n<=1){
    return n;
 }else{
    return calFib(n-1)+calFib(n-2);
 }
}
public int calSuma(int n){
    return (n==1)?n:calSuma(n-1)+n;
}

public int calPot(int n){
   //caso base 
   if(n==0){
    return n;
   }else{
    return calPot(n-1)*2; 
   }
}
public int calR(int n){
    if(n<=1){
    return n;
}else{
return calR(n-1)/n;
}  
}
// public int calRR(int n){
//     if()
// }

}

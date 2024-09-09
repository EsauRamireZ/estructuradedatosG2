package iterativos;
// ::: PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO ENTERO :::
// 1. Realizar la calidacion para que la variable de estancia nunca sea cero
// 2. Realizar un metodo que calcle el factorial, utilizando el ciclo factorial

// Ejemplo : Factorial

// f(1) = 1
// f(2) = 1 * 2
// f(3) = 1 * 2 * 3
// f(n) = 1 * 2 ....n

// f(1) = 1
// f(2) = 2 * 1
// f(3) = 3 * 2 * 1
// f(n) = n *  ... 1
public class Factorial {
    private int n;
    public Factorial(){
        this.n =1;
    }
    public Factorial (int n){
        this.n=(n<=0)?1:n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n=(n<=0)?1:n;
    }
    public long calcular(){
        long fact =1;
        for(int i =1; i<=n;i++){
        fact*=i;
        }
        return fact;
    }

    public long calcularReverse(){
        long fact = 1;
        int i = 1;
        while (i>=1) {
        fact*=1;
        i--;
        }
        return fact;
    }
    @Override
    public String toString(){
        return "El factorila de " + this.n+ " es: " + this.calcular();
       
    }

}

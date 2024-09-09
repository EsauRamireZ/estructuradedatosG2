package iterativos;

public class Serie3 {
// r = 1^1/1! + 2^2/2!
private double n;

 public Serie3 (){
    this.n = (n > 0) ? n : 1;
 }

public double getN() {
    return n;
}

public void setN(double n) {
    this.n = (n > 0) ? n : 1;
}
 public double calcularSeriePo(){
    double res = 1.0;
    for (int i =1; i<=n;i++){
        res *=this.n;
    }
    return res;
 }
 public double calcularSerieFac(){
    double facto = 1.0;
    for(int i = 1; i<=n;i++){
    facto*=i;
    }
    return facto;
 }
 public double calcularSerie3(){
    double facto = 1.0;
    double res = 1.0;
    double cs3 = 1.0;
    for (int i =1; i<=n;i++){
        res *=this.n;
        facto*=i;
    }
    return cs3=res/facto;

 }
}

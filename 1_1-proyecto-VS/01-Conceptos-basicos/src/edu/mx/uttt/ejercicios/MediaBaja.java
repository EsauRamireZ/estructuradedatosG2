package ejercicios;

public class MediaBaja {
  private int n;
  public MediaBaja(){
    this.n = (n > 0) ? n : 1; 
  }
public int getN() {
    return n;
}
public void setN(int n) {
    this.n = (n > 0) ? n : 1; 
}
  public double calcularMedia(){
    double media =0.0;
    for(int i=1;i<=n;i++){
    media+=media;
    media=media/n;
    }
    return media;
  }
  public double calcularBaja(){
    double baja=0.0;
    double min=0.0;
    for(int i = 1;i<=n;i++){
     n+=baja;
     if(baja<n){
        min = baja;
     }
    }
    return min;
  }
}

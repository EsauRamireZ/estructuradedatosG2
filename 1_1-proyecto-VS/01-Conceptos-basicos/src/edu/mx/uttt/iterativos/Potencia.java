package iterativos;

public class Potencia {

    private double n;
    private double p;

    public Potencia() {
        this.n = (n > 0) ? n : 1;
        this.n = (p > 0) ? p : 1;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = (n > 0) ? n : 1;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.n = (p > 0) ? p : 1;
    }

    public double calcularPotenciaFor() {
        double poten = 1.0;
        for (int i = 1; i <= this.p; i++) {
            poten *= this.n;
        }
        return poten;
    }

    public double calcularPotenciaWhile() {
        int i = 1;
        double poten = 1.0;
        while (i <= this.p) {
            poten *= this.n;
            i++;
        }
        return poten;
    }

    public double calcularPotenciaDoWhile() {
        double poten = 1.0;
        int i = 1;
        do {
            poten *= this.n;
            i++;
        } while (i <= this.p);
        return poten;

    }

}

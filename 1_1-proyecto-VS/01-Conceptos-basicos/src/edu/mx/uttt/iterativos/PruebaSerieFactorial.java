package iterativos;
import javax.swing.JOptionPane;
public class PruebaSerieFactorial {

    public static void main (String[]args){
        // SerieFactorial sf1 = new SerieFactorial();
        // sf1.setN(3);
        // JOptionPane.showMessageDialog(null,sf1.calcular());

        // Serie2 serie2 = new Serie2();
        // serie2.setN(3);
        // System.out.println(serie2.calcular());

        Potencia pot1= new Potencia();
        pot1.setN(3);
        pot1.setP(3);
        JOptionPane.showMessageDialog(null,pot1.calcularPotenciaFor());
    }
}

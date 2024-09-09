package iterativos;
import javax.swing.JOptionPane;
public class Principal {
 public static void main(String[] args) {
    double resultado = gestionarOperaciones(menu());

    if(resultado ==0.0){
        JOptionPane.showMessageDialog(null, "Opcion no valida");
    }else{
        JOptionPane.showMessageDialog(null, resultado);
    }
    
 }
 public static String menu (){
    String menu = "MENU PRINCIPAL \n"+
                "1)Serie1\n"+
                "2)Serie2\n"+
                "3)Factorial\n"+
                "4)Potencia\n"+
                "5)Serie3\n"+
                "Elige una Opcion";
                return JOptionPane.showInputDialog(menu);
 }
 public static double gestionarOperaciones (String opcion){
    double resultado = 0.0;
    int valor  = 0;
    switch (opcion) {
        case "1":
            Serie serie =new Serie();
           valor= Integer.parseInt(JOptionPane.showInputDialog("ingresa el valor de la serie")); 
           serie.setN(valor);
           resultado = serie.calcularSerie();
        break;
        case "2":
        Serie2 serie2 = new Serie2();
       valor= Integer.parseInt(JOptionPane.showInputDialog("ingresa el valor de la serie")); 
        serie2.setN(valor);
        resultado = serie2.calcular();
        break;
        case "3":
         Factorial fact = new Factorial();
        valor= Integer.parseInt(JOptionPane.showInputDialog("ingresa el valor de la serie")); 
        resultado = fact.calcular();
        break;
        case "4":
        Potencia pote = new Potencia();
        valor= Integer.parseInt(JOptionPane.showInputDialog("ingresa el valor de la Potencia")); 
        resultado = pote.calcularPotenciaFor();
        break;
        case "5":
        Serie3 S3 = new Serie3();
        valor= Integer.parseInt(JOptionPane.showInputDialog("ingresa el valor de la serie3")); 
        resultado= S3.calcularSerie3();
        break;
         case "6":
            
        break;
        default:
        System.out.println("No existe esa opcion");
            break;
    }
    return resultado;
 }
}

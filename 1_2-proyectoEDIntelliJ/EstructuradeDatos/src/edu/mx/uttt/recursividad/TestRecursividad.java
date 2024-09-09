package edu.mx.uttt.recursividad;

import javax.swing.JOptionPane;

public class TestRecursividad {
    public static void main(String[] args) {
        ejecutar();
    }

    public static String menu() {
        String menu = "Menu principal:\n"
                + "1)Metodo Iterativo\n" +
                "2)Metodo Recursivo\n" +
                "3)Salir\n" + "Elige la opcion";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar() {
        boolean sentinel = true;
        String opcion;
        Operaciones op= new Operaciones();
        int n =0;
        do{
         opcion = menu();

        switch (opcion) {
            case "1":
            n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
            op.setN();
            op.imprimir(n);    
            break;
            case "2":
            n= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
            op.setN();
            op.imprimir(op.getN(n));
                break;
            case "3":
               sentinel= false;
                break;
            default:
            JOptionPane.showMessageDialog(null, "Valor no valido");
                break;
        }
    }while(sentinel);
    
    }
}

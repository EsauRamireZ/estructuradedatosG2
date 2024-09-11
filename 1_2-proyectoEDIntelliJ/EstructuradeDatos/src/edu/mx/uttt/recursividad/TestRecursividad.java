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
                "3)Factorial Iterativo\n" +
                "4)Factorial Recursivo\n" +
                "5)salir\n" +
                "Elige la opcion";
        return JOptionPane.showInputDialog(menu);
    }

    public static void ejecutar() {
        boolean sentinel = true;
        long r = 0;
        String opcion;
        Operaciones op = new Operaciones();
        Factorial f = null;
        int n = 0;
        do {
            opcion = menu();

            switch (opcion) {
                case "1":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
                    op.setN();
                    op.imprimir(n);
                    break;
                case "2":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
                    op.setN();
                    op.imprimir(op.getN(n));
                    break;
                case "3":
                    // Factorial
                    opcion = JOptionPane.showInputDialog(Menus.menuFactotial());
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce le valor de factorial a calcular"));
                    f.setN(n);
                    r = f.factoriall(opcion);
                    JOptionPane.showMessageDialog(null, "f(" + f.getN() + ")=" + r);
                    break;
                case "4":
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce le valor de factorial a calcular"));
                    f.setN(n);
                    r = f.factR(f.getN());
                    JOptionPane.showMessageDialog(null, "f(" + f.getN() + ")=" + r);
                    break;
                case "5":
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    break;
            }
        } while (sentinel);

    }
}

package edu.mx.uttt.arreglos.Evaluacion4;

public class TestEstudiantes {
    public static void main(String[] args) {
        int cantidad;
        Estudiantes clasificacion = new Estudiantes(20);
        clasificacion.mostrarPuntajes();
        clasificacion.clasificarEstudiantes();
        if (args.length == 0) {
             System.out.println("Introduce el número de estudiantes ");
            return;
        }     
        try {
            cantidad = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Introduce un número valido");
            return;
        }

    }
}

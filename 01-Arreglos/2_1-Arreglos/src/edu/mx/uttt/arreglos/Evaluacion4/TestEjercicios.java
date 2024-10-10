package edu.mx.uttt.arreglos.Evaluacion4;



public class TestEjercicios {
    public static void main(String[] args) {
        EjerciciosVectores estadisticas = new EjerciciosVectores(30, 1, 30);
        estadisticas.mostrarNumerosGenerados();
        System.out.println("Número más grande: " + estadisticas.obtenerMaximo());
        System.out.println("Número más pequeño: " + estadisticas.obtenerMinimo());
        System.out.println("Media: " + estadisticas.calcularMedia());
        System.out.println("Moda: " + estadisticas.calcularModa());
        System.out.println("Mediana: " + estadisticas.calcularMediana());
        estadisticas.contarYMostrarPorcentajes();    
    }
}


package edu.mx.uttt.arreglos.Evaluacion4;

public class Estudiantes {
    private int[] puntajes;

    public Estudiantes(int cantidad) {
        puntajes = new int[cantidad];
        generarPuntajes();
    }

    private void generarPuntajes() {
        for (int i = 0; i < puntajes.length; i++) {
            puntajes[i] = (int) (Math.random() * 21); // Puntajes entre 0 y 20
        }
    }

    public void clasificarEstudiantes() {
        int deficientes = 0;
        int regulares = 0;
        int buenos = 0;
        int excelentes = 0;

        for (int puntaje : puntajes) {
            if (puntaje >= 0 && puntaje <= 5) {
                deficientes++;
            } else if (puntaje >= 6 && puntaje <= 10) {
                regulares++;
            } else if (puntaje >= 11 && puntaje <= 15) {
                buenos++;
            } else if (puntaje >= 16 && puntaje <= 20) {
                excelentes++;
            }
        }

        System.out.println("Clasificación de estudiantes:");
        System.out.println("Deficientes (0-5): " + deficientes);
        System.out.println("Regulares (6-10): " + regulares);
        System.out.println("Buenos (11-15): " + buenos);
        System.out.println("Excelentes (16-20): " + excelentes);
    }

    public void mostrarPuntajes() {
        System.out.print("Puntajes generados: ");
        for (int puntaje : puntajes) {
            System.out.print(puntaje + " ");
        }
        System.out.println();
    }

}

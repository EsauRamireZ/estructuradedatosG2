package edu.mx.uttt.arreglos.Evaluacion4;



public class EjerciciosVectores {
    private int[] numeros;

    public EjerciciosVectores(int cantidad, int rangoMin, int rangoMax) {
        numeros = new int[cantidad];
        generarNumerosAleatorios(rangoMin, rangoMax);
    }

    private void generarNumerosAleatorios(int rangoMin, int rangoMax) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (rangoMax - rangoMin + 1)) + rangoMin;
        }
    }

    public int obtenerMaximo() {
        int max = numeros[0];
        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int obtenerMinimo() {
        int min = numeros[0];
        for (int num : numeros) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public double calcularMedia() {
        double suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public int calcularModa() {
        int[] frecuencia = new int[31]; // Para números del 1 al 30
        for (int num : numeros) {
            frecuencia[num]++;
        }

        int moda = 1;
        for (int i = 2; i < frecuencia.length; i++) {
            if (frecuencia[i] > frecuencia[moda]) {
                moda = i;
            }
        }

        return moda;
    }

    public double calcularMediana() {
        int[] copia = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[i];
        }

        // Ordenar el array (ordenamiento burbuja)
        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - 1 - i; j++) {
                if (copia[j] > copia[j + 1]) {
                    int temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }

        if (copia.length % 2 == 0) {
            return (copia[copia.length / 2 - 1] + copia[copia.length / 2]) / 2.0;
        } else {
            return copia[copia.length / 2];
        }
    }

    public void contarYMostrarPorcentajes() {
        int[] conteo = new int[10];

        for (int num : numeros) {
            if (num >= 1 && num <= 10) {
                conteo[num - 1]++;
            }
        }

        System.out.println("Cantidad y porcentaje de números del 1 al 10:");
        for (int i = 0; i < conteo.length; i++) {
            double porcentaje = (conteo[i] / (double) numeros.length) * 100;
            System.out.printf("%d: Cantidad = %d, Porcentaje = %.2f%%\n", (i + 1), conteo[i], porcentaje);
        }
    }

    public void mostrarNumerosGenerados() {
        System.out.print("Números generados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
    
}

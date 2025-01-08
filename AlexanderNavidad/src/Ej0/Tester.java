package Ej0;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        System.out.println("VERSIÓN 1:");
        OperacionesArray operaciones = new OperacionesArray(5);

        operaciones.cargarArray();
        operaciones.listarArray();
        operaciones.ordenarArray();
        System.out.println("Media del array: " + operaciones.calcularMedia());
        System.out.println("Array invertido: " + Arrays.toString(operaciones.invertirArray()));

        System.out.println("\nVERSIÓN 2:");
        int[] array = OperacionesArrayEstatico.cargarArray(5);
        OperacionesArrayEstatico.listarArray(array);
        OperacionesArrayEstatico.ordenarArray(array);
        System.out.println("Media del array: " + OperacionesArrayEstatico.calcularMedia(array));
        System.out.println("Array invertido: " + Arrays.toString(OperacionesArrayEstatico.invertirArray(array)));
    }
}

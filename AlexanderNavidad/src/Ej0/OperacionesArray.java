package Ej0;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArray {
    private int[] array;

    public OperacionesArray(int size) {
        array = new int[size];
    }

    public void cargarArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce " + array.length + " números:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    public void listarArray() {
        System.out.println("Contenido del array: " + Arrays.toString(array));
    }

    public void ordenarArray() {
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public double calcularMedia() {
        double suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma / array.length;
    }

    public int[] invertirArray() {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }
}

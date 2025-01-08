package Ej0;

import java.util.Arrays;
import java.util.Scanner;

public class OperacionesArrayEstatico {
    public static int[] cargarArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Introduce " + size + " números:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void listarArray(int[] array) {
        System.out.println("Contenido del array: " + Arrays.toString(array));
    }

    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    public static double calcularMedia(int[] array) {
        double suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma / array.length;
    }

    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }
}


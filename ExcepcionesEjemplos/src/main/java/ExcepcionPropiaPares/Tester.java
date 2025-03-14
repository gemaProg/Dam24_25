package ExcepcionPropiaPares;

import java.util.Scanner;


public class Tester {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce número");
        int numero = lector.nextInt();
        Comprobaciones.comprobarNumero(numero);
    }
}

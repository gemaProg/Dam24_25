package Ej3;

public class Tester {
    public static void main(String[] args) {
        Cuadrado cua1 = new Cuadrado();
        cua1.imprimirInformacion();

        Cuadrado cua2 = new Cuadrado(4.5);
        cua2.imprimirInformacion();

        cua2.setLado(3.0);
        System.out.println("\nDespués de cambiar el lado:");
        cua2.imprimirInformacion();

        // Intentar asignar un lado negativo
        cua2.setLado(-2.0);
    }
}

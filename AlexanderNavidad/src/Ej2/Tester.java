package Ej2;

public class Tester {
    public static void main(String[] args) {
        Circulo cir1 = new Circulo();
        cir1.imprimirInformacion();

        Circulo cir2 = new Circulo(5.5);
        cir2.imprimirInformacion();

        cir2.setRadio(3.0);
        System.out.println("\nDespués de cambiar el radio:");
        cir2.imprimirInformacion();

        // Intentar asignar un lado negativo
        cir2.setRadio(-2.0);
    }
}

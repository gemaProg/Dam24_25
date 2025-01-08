package Ej1;

public class Tester {
    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo();
        System.out.println("Perímetro (triángulo por defecto): " + tri1.calcularPerimetro());
        tri1.imprimirArea();

        Triangulo tri2 = new Triangulo(3, 4, 5);
        System.out.println("Perímetro (triángulo específico): " + tri2.calcularPerimetro());
        tri2.imprimirArea();
    }
}

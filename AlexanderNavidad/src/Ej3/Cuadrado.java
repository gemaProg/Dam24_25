package Ej3;

public class Cuadrado {
    private double lado;

    public Cuadrado() {
        this.lado = 1.0;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        } else {
            System.out.println("El lado debe ser mayor que 0.");
        }
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public void imprimirInformacion() {
        System.out.printf("Cuadrado de lado: %.2f%n", lado);
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
    }
}

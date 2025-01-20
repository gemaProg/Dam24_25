package org.example;

public class Cuadrado extends Figura {

    public Cuadrado() {
        super();
    }
    public Cuadrado(double lado) {
        super(lado);
    }
    public double calcularArea() {
        return dimension * dimension;
    }
    public double calcularPerimetro() {
        return 4 * dimension;
    }

}

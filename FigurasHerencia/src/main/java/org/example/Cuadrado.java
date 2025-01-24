package org.example;

public class Cuadrado extends Figura {

    public Cuadrado() {
        super();
    }

    /**
     *
     * @param lado que tendrá el cuadrado construido
     */
    public Cuadrado(double lado) {
        super(lado);
    }

    /**
     *Método que permite calcular el área del Cuadrado
     * @return el área
     */
    public double calcularArea() {
        return dimension * dimension;
    }
    public double calcularPerimetro() {
        return 4 * dimension;
    }

}

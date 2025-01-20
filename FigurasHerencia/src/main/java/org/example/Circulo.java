package org.example;

public class Circulo extends Figura {

    public Circulo(){
        super(1);

    }
    public Circulo(double radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(dimension, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * dimension;
    }
    public String termino(){
        return "Radio";
    }

}

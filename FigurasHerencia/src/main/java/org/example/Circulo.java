package org.example;

public class Circulo extends Figura {
    private String color;
    public Circulo(){
        super(1);

    }
    public Circulo(double radio) {
        super(radio);
    }
    public Circulo(String color, double radio) {
        super(radio);
        color= "verde";
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

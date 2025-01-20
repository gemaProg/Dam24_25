package org.example;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    public Triangulo() {
        this.lado1 = 3;
        this.lado2 = 3;
        this.lado3 = 5;
    }
    public Triangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    public double calcularPerimetro(){
        return lado1+lado2+lado3;

    }
    public void calcularArea(){
        double semiPerimetro = calcularPerimetro() /2;
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
        System.out.println("Área del triángulo: " + area);
    }
}
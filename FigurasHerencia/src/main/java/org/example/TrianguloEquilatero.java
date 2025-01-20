package org.example;

public class TrianguloEquilatero extends Figura{

    public TrianguloEquilatero() {
        //super(2);
        this(2);
    }
    public TrianguloEquilatero(double lado){
        super(lado);
    }


    public double calcularPerimetro(){
        return dimension*3;

    }
    public double calcularArea(){
        double semiPerimetro = calcularPerimetro() /2;
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-dimension)*(semiPerimetro-dimension)*(semiPerimetro-dimension));
        return area;
    }


}
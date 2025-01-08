package POO1;

public class Circulo {
    private Punto centro;
    private double radio;


    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }


    public Circulo() {
        this.centro = new Punto();
        this.radio = 1.0;
    }

    public Circulo(double a, double b, double radio) {
        this.centro = new Punto(a, b);
        this.radio = radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularDistanciaDesde(Punto otroPunto) {
        return centro.calcularDistanciaDesde(otroPunto);
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

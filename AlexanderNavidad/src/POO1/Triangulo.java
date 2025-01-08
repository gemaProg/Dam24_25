package POO1;

public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangulo() {
        this.p1 = new Punto(0, 0);
        this.p2 = new Punto(1, 0);
        this.p3 = new Punto(0, 1);
    }

    public Triangulo(double a1, double b1, double a2, double b2, double a3, double b3) {
        this.p1 = new Punto(a1, b1);
        this.p2 = new Punto(a2, b2);
        this.p3 = new Punto(a3, b3);
    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    public Punto getP3() {
        return p3;
    }

    public double calcularDistanciaDesde(Punto otro) {
        return p1.calcularDistanciaDesde(otro);
    }

    public double calcularArea() {
        double d12 = p1.calcularDistanciaDesde(p2);
        double d13 = p1.calcularDistanciaDesde(p3);
        double d23 = p2.calcularDistanciaDesde(p3);
        double s = calcularPerimetro()/2;
        return Math.sqrt(s*(s-d12)*(s-d13)*(s-d23));
    }

    public double calcularPerimetro() {
        double lado1 = p1.calcularDistanciaDesde(p2);
        double lado2 = p2.calcularDistanciaDesde(p3);
        double lado3 = p3.calcularDistanciaDesde(p1);
        return lado1 + lado2 + lado3;
    }
}

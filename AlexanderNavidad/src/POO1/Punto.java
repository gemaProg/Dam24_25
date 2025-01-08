package POO1;

public class Punto {
    private double a;
    private double b;
    
    public Punto(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Punto() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    public double calcularDistanciaDesde(Punto otroPunto) {
        double da = otroPunto.getA() - this.a;
        double db = otroPunto.getB() - this.b;
        return Math.sqrt(da * da + db * db);
    }
}

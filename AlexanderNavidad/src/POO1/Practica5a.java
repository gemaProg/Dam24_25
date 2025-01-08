package POO1;

public class Practica5a {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);

        System.out.println("Distancia entre puntos: " + p1.calcularDistanciaDesde(p2));

        Circulo circulo = new Circulo(p1, 5);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("Distancia desde el círculo al punto p2: " + circulo.calcularDistanciaDesde(p2));

        Punto p3 = new Punto(2, 2);
        Triangulo triangulo = new Triangulo(p1, p2, p3);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Distancia desde el triángulo al punto p3: " + triangulo.calcularDistanciaDesde(p3));
    }
}

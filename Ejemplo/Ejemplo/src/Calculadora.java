import java.util.Scanner;

public class Calculadora {
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
    public static void restar() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int a = lector.nextInt();
        int b = lector.nextInt();
        System.out.println(a - b);
    }
    public static void producto(int a, int b) {
        System.out.println(a * b);
    }
    public static int division() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce dos números");
        int a = lector.nextInt();
        int b = lector.nextInt();
        return a / b;
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double sumar(int num1, int num2) {
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
    public static int menu (){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca una opción:\n1. sumar\n2.restar\n3.producto\n4.división\n5.salir\n");
        //int opcion = lector.nextInt();
        return lector.nextInt();
    }
    public static void selector(int opcion){
        Scanner lector = new Scanner(System.in);
        // int opcion = menu();
        switch (opcion) {
            case 1:
                System.out.println("Introduce dos números");
                int a = lector.nextInt();
                int b = lector.nextInt();
                double resultado = sumar(a, b);
                //int resultado = sumar(lector.nextInt(), lector.nextInt());
                System.out.println(resultado);
                break;
            case 2:
                restar();
                break;
            case 3:
                System.out.println("Introduce dos números");
                a = lector.nextInt();
                b = lector.nextInt();
                producto(a, b);
                break;
            case 4:
                System.out.println(division());
        }
    }
    public static void selector(){
        int opcion = menu();
        selector(opcion);
    }



    public static void main(String[] args) {
        /*int opcion = menu();
        selector(opcion);*/
        selector(menu());
    }
}
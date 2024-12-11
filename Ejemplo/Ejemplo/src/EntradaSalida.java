import java.util.Scanner;

public class EntradaSalida {
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
                double resultado = Calculadora.sumar(a, b);
                //int resultado = sumar(lector.nextInt(), lector.nextInt());
                System.out.println(resultado);
                break;
            case 2:
                Calculadora.restar();
                break;
            case 3:
                System.out.println("Introduce dos números");
                a = lector.nextInt();
                b = lector.nextInt();
                Calculadora.producto(a, b);
                break;
            case 4:
                System.out.println(Calculadora.division());
        }
    }
    public static void selector(){
        int opcion = menu();
        selector(opcion);
    }

}

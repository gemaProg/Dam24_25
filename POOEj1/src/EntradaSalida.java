import java.util.Scanner;

public class EntradaSalida {
    public static Mono dameMono(){
        Mono nuevoMono = null;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce: 1. mono estándar 2. mono personalizado");
        int opcion = lector.nextInt();
        lector.nextLine();
        if (opcion==1)
            nuevoMono = new Mono();
        else {
            System.out.println("Introduce nombre, edad, peso, true (hembra) / false (varón), tipo, kilos comida semana y cuidador");
            nuevoMono = new Mono(lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextLine(), lector.nextFloat(), lector.nextLine());
        }
        return nuevoMono;
    }
}

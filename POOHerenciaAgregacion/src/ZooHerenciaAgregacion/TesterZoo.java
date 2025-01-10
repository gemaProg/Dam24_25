package ZooHerenciaAgregacion;

import java.util.Random;
import java.util.Scanner;

public class TesterZoo {
    // Este método muestra el array de animales
    // Este método gestiona el menú y determina la opción elegida
    // llamando a otros métodos que resuelven las opciones
    public static void gestionMenu() {
        Scanner lector = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int opcion;
        int aux;
        String nuevo_cuidador;

        do {
            System.out.println();
            System.out.println("Menú de opciones");
            System.out.println("****************");
            System.out.println("1. Mostrar el array");
            System.out.println("2. Buscar la posición del primer mono");
            System.out.println("3. Contar el número de Elefantes");
            System.out.println("4. Modificar el cuidador del elemento que digamos");
            System.out.println("0. Salir");

            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    // Aquí delego en un método directamente
                    zoo.mostrarArrrayDeAnimales();
                    break;

                case 2:
                    // Aquí delego en un método para obtener la posición
                    // y el resto de la lógica la hago en local
                    aux = zoo.buscarPrimerMono();
                    if (aux > 0)
                        System.out.println("El primero mono está en la posición " + aux);
                    else
                        System.out.println("No hay monos en la lista");
                    break;

                case 3:
                    // Aquí delego en un método para obtener la posición
                    // y el resto de la lógica la hago en local
                    aux = zoo.contarElefantes();
                    System.out.println("En la lista de animales hay " + aux + " elefantes");
                    break;

                case 4:
                    // Este proceso lo voy a hacer "a la antigua", sin
                    // llamar a un procedimiento
                    System.out.println("Indique la posición del animal (0-"+(.length-1)+"): ");
                    aux= lector.nextInt();
                    lector.nextLine();

                    System.out.println("Indique el nombre del nuevo cuidador: ");
                    nuevo_cuidador= lector.nextLine();

                    if ((aux>=0) && (aux <= .length-1)) {
                        [aux].setCuidador(nuevo_cuidador);
                        System.out.println("Cambiado!");
                    }
                    else
                        System.out.println("No se puede cambiar el cuidador porque no ha indicado una posición correcta");
                    break;

                case 0:
                    // La opción de salida se contempla sin código para
                    // que no se de un mensaje de opción incorrecta
                    break;

                default:
                    // Por defecto la opción es incorrecta si no es
                    // ninguna de las elegidas antes
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }

    // Código principal del tester
    public static void main(String[] args) {

        gestionMenu();
    }
}
package ZooHerenciaAgregacion;

import java.util.Random;
import java.util.Scanner;

public class TesterZoo {

    public static void gestionMenu() {
        Scanner lector = new Scanner(System.in);
        Zoo zoo = new Zoo(50);
        int opcion;
        int aux;
        String nuevo_cuidador;

        do {
            System.out.println();
            System.out.println("Menú de opciones");
            System.out.println("****************");
            System.out.println("G1. Mostrar el array");
            System.out.println("G2. Agregar un animal en el zoo");
            System.out.println("G3. Eliminar un animal del zoo");
            System.out.println("4. Buscar la posición del primer mono");
            System.out.println("5. Contar el número de Elefantes");
            System.out.println("G6. Modificar el cuidador del elemento que digamos");
            System.out.println("G7. Modificar ornitorrinco pico");
            System.out.println("0. Salir");

            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    zoo.mostrarArrrayDeAnimales();
                    break;
                case 2:
                    if (zoo.hayHueco()!=-1) {
                        zoo.introducirloZoo(zoo.darAlta());
                        System.out.println("Animal introducido correctamente");
                    }else
                        System.out.printf("No se ha podido dar de alta el animal porque no hay hueco");
                    break;
                case 3:
                    zoo.banderaPlayaGrande("CabodeGata");
                    break;
                case 4:
                    aux = zoo.buscarPrimerMono();
                    if (aux > 0)
                        System.out.println("El primero mono está en la posición " + aux);
                    else
                        System.out.println("No hay monos en la lista");
                    break;
                case 5:
                    aux = zoo.contarElefantes();
                    System.out.println("En la lista de animales hay " + aux + " elefantes");
                    break;

                case 6:
                    System.out.println("Indique la posición del animal (0-"+(zoo.getLista().length-1)+"): ");
                    aux= lector.nextInt();
                    lector.nextLine();

                    System.out.println("Indique el nombre del nuevo cuidador: ");
                    nuevo_cuidador= lector.nextLine();

                    if ((aux>=0) && (aux <= zoo.getLista().length-1)) {
                        Animal listaAux[] = zoo.getLista();
                        listaAux[aux].setCuidador(nuevo_cuidador);
                        System.out.println("Cambiado!");
                    }
                    else
                        System.out.println("No se puede cambiar el cuidador porque no ha indicado una posición correcta");
                    break;

                case 0:
                    break;
                default:
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
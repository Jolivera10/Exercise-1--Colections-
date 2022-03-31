package Main;

import Entidades.Perro;
import Servicio.ServicioPerro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Perro p1 = new Perro();
        Scanner leer = new Scanner(System.in);
        ServicioPerro ps = new ServicioPerro();
        int opcion = 0;
        boolean salir = false;
        while (!salir) {

            System.out.println("1. Crear perritos");
            System.out.println("2. Eliminar perritos");
            System.out.println("3. Mostrar perritos");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    System.out.println("Ingrese la cantidad de perritos a crear");
                    ps.fabricaPerros(leer.nextInt());
                    System.out.println("Los perritos creados son: ");
                    ps.mostrarPerritos();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    ps.eliminarPerritos();
                    System.out.println("Los perritos que quedan son: ");
                    ps.mostrarPerritos();

                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    System.out.println("Los perritos actuales son: ");
                    ps.mostrarPerritos();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

       
    }

}

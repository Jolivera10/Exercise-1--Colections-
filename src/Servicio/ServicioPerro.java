/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicio;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioPerro {

    ArrayList<String> razas = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void guardarPerros() {
        Perro p1 = new Perro();

        System.out.println("Ingrese la raza del perro");
        p1.setRaza(leer.nextLine());
        String m;
        m = p1.getRaza();
        razas.add(m);

    }

    public void fabricaPerros(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            guardarPerros();

        }

    }

    public void mostrarPerritos() {
//for each mejor manera para MOSTRAR elementos
        for (String aux : razas) {
            System.out.println(aux);

        }

    }

    public void eliminarPerritos() {
          for (String aux : razas) {  
              System.out.println("Ingrese el nombre del perrito a eliminar");
            String nombre = leer.nextLine();
            if (aux.equals(nombre)) {
                razas.remove(aux);

            } else {
                System.out.println("El perrito no esta en la lista");
                    
                }
              
            
        }
            
            

                

            }

            
        }
        
        

    



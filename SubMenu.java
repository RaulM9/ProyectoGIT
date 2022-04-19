package vista;

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class TiendaVideojuegos {    //CORREGIR
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. Nombre");
            System.out.println("2. Plataforma");
            System.out.println("3. G�nero");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Bienvenido al SubMen� de b�squeda");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado b�squeda por Nombre");
                        break;
                    case 2:
                        System.out.println("Has seleccionado b�squeda por Plataforma");
                        break;
                    case 3:
                        System.out.println("Has seleccionado b�squeda por G�nero");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo n�meros entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un n�mero");
                sn.next();
            }
        }
 
    }
 
}
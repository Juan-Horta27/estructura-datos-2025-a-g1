package main;
import model.Animal;
import model.perro;
import model.gato;
import model.pajaro;
import model.conejo;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    private static ArrayList <Animal> animales = new ArrayList <>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] argas){

        // menu interactivo
        int opcion;
        do{
            switch (opcion){
                case 1:
                    registrarperro();
                    break;
                case 2:
                    registrargato();
                    break;
                case 3:
                    registrarpajaro();
                    break;
                case 4:
                    registrarconejo();
                case 5:
                    mostrartodoslosanimaes();
                    break;
                case 6:
                    probarpolimorfismo();
                    break;
                case 7:
                    System.out.println(" saliendo");
                default:
                    System.out.println("opcion no valida");
            }
            private static void mostrarmenu(){
                System.out.println("=== SISTEMA PETWORLD===\n" +
                        "1. registrar perro\n" +
                        "2. registrar gato\n" +
                        "3. registrar pajaro\n" +
                        "4. registrar conejo\n" +
                        "5. mostar todos los animales\n" +
                        "6. probar polimorfismo\n"+
                        "7. salir\n" +
                        "escriba su opcion aqui:");
            }
            private static void registrarperro(){
                System.out.println("\n registar nuevo perro");
                System.out.println("nombre:");
                String nombre = scanner.nextLine();
                System.out.println("edad:");
                int edad = scanner.nextInt();
                System.out.println("peso:");
                double peso = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("raza");

            }

        }while(opcion !=7);
    }
}

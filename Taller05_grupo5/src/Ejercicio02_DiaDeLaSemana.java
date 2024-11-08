/**
 * Día de la Semana: Mostrar el nombre del día de la semana en 
 * función del número ingresado (1 para lunes, 2 para martes, etc.).
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio02_DiaDeLaSemana{
    public static void main(String[] args) {
     int num_dia;
     Scanner teclado = new Scanner(System.in);
     System.out.println("________________________________");
     System.out.print("Ingrese el numero de dia:  ");
     num_dia = teclado.nextInt();     
     System.out.println("--------------------------------");
     System.out.println("________________________________");
        switch (num_dia) {
            case 1 -> System.out.println("Lunes ");
            case 2 -> System.out.println("Martes ");
            case 3 -> System.out.println("Miercoles ");
            case 4 -> System.out.println("Jueves ");
            case 5 -> System.out.println("Viernes ");
            case 6 -> System.out.println("Sabado ");
            case 7 -> System.out.println("Domingo ");
            default -> System.out.println("ERRROR en el numero de dia  ");
        }
     System.out.println("--------------------------------");   
    }
}
/**
 * run:
 * ________________________________
 * Ingrese el numero de dia:  5
 * --------------------------------
 * ________________________________
 * Viernes 
 * --------------------------------
 * 
 * run:
 * ________________________________
 * Ingrese el numero de dia:  8
 * --------------------------------
 * ________________________________
 * ERRROR en el numero de dia  
 * --------------------------------
 */

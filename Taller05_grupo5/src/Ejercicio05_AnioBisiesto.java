/**
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. 
 * Si es bisiesto, mostrar un mensaje especial.
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio05_AnioBisiesto {
    public static void main(String[] args) {
        int año;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        año = teclado.nextInt();
        if ((año % 4)== 0)
            System.out.print("El año es bisiesto");
        else
            System.out.print("El año no es bisiesto");
    }
}
/**
 * run:
 * Ingrese un a�o: 2024
 * El a�o es bisiesto
 * 
 * run:
 * Ingrese un a�o: 2006
 * El a�o no es bisiesto
 */
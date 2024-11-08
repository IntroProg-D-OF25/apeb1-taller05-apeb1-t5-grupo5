/**
 * Edad para Votar: Determinar si una persona es elegible para 
 * votar en función de su edad (mayor o igual a 18 años).
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio01_EdadParaVotar {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dame una edad: ");
        edad = teclado.nextInt();
        if (edad > 18)
            System.out.print("Vota");
        else
            System.out.print("No vota");
    }
}
/**
 * run :
 * Dame una edad: 17
 * No vota
 * 
 * run:
 * Dame una edad: 19
 * Vota
 */
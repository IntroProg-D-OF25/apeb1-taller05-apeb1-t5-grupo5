/**
 * Rango de Notas: Asignar una letra 
 * (A, B, C, D) a una calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio07_RangoDeNotas {
    public static void main(String[] args) {
        int notas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su nota sobre 100: ");
        notas = teclado.nextInt();
        if ((notas <= 100)&&(notas>=90))
            System.out.print("Obtuvo una A");
        else if ((notas < 90)&&(notas > 79))
            System.out.print("Obtuvo una B");
        else if ((notas < 80)&&(notas >69))
            System.out.print("Obtuvo una C");
        else if ((notas < 70)&&(notas>=0))
            System.out.print("Obtuvo una D");
        else
            System.out.print("Ingrese un valor de 0 a 100");
    }
}
/**
 * run:
 * Ingrese su nota sobre 100: 100
 * Obtuvo una A
 * 
 * run:
 * Ingrese su nota sobre 100: 89
 * Obtuvo una B
 * 
 * run:
 * Ingrese su nota sobre 100: 79
 * Obtuvo una C
 * 
 * run:
 * Ingrese su nota sobre 100: 69
 * Obtuvo una D
 * 
 * run:
 * Ingrese su nota sobre 100: 200
 * Ingrese un valor de 0 a 100
 */
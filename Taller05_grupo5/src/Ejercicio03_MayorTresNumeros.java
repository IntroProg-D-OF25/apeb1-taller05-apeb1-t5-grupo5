/**
 * Mayor de tres números: Dados tres números, determinar cuál es el mayor. 
 * Si son iguales, mostrar un mensaje.
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio03_MayorTresNumeros {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros:");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        if ((num1 > num2)&&(num1 > num3))
            System.out.print("El numero mayor es: " + num1);
        else if ((num2 > num1)&&(num2 > num3))
            System.out.print("El numero mayor es: " + num2);
        else if ((num3 > num1)&&(num3 > num2))
            System.out.print("El numero mayor es: " + num3);
        else
            System.out.println("Los numeros son iguales");                
    }
}
/**
 * run: 
 * Ingrese 3 numeros:
 * 3
 * 1
 * 2
 * El numero mayor es: 3
 * 
 * run:
 * Ingrese 3 numeros:
 * 5 
 * 5
 * 5
 * Los numeros son iguales
 */
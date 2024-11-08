/**
 * Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio09_OrdenamientoDeTresNumeros {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros para ordenarlos en orden ascendente: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        System.out.println("Los numeros en orden son: ");
        if((num1 > num2)&&(num1 > num3)){
            if (num2 > num3){
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            }
            else{
                System.out.println(num1);
                System.out.println(num3);
                System.out.println(num2);
            }
        }
        else if((num2 > num1)&&(num2 > num3)){
            if (num1 > num3){
                System.out.println(num2);
                System.out.println(num1);
                System.out.println(num3);
            }
            else{
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            }
        }
        else
            if (num2 > num1){
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
            else{
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
            }
    }
}
/**
 * run:
 * Ingrese 3 numeros para ordenarlos en orden ascendente: 
 * 1
 * 2
 * 3
 * Los numeros en orden son: 3
 * 2
 * 1
 */
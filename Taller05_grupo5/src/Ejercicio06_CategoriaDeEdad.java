/**
 * Categoría de Edad: Clasificar a una persona en una categoría de edad 
 * (niño, adolescente, adulto) en función de su edad.
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio06_CategoriaDeEdad {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        if (edad < 13)
            System.out.print("Es un niño");
        else if (edad < 26)
            System.out.print("Es un adolescente");
        else
            System.out.print("Es un adulto");
    }
}
/**
 * run:
 * Ingrese su edad: 12
 * Es un ni�o
 * 
 * run:
 * Ingrese su edad: 17
 * Es un adolescente
 * 
 * run:
 * Ingrese su edad: 26
 * Es un adulto
 */
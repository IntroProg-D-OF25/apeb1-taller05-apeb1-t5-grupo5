/**
 * Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% 
 * si el precio original es mayor de $100; de lo contrario, no hay descuento.
 * @author Erick Malla
 */
import java.util.Scanner;
public class Ejercicio04_DescuentoEnCompras {
    public static void main(String[] args) {
        float precio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el precio:  ");
        precio = teclado.nextFloat();
        if (precio > 100)
            System.out.println("El precio final con descuento de 10% es: " + (precio*0.90) + " $");
        else
            System.out.println("El precio final es: " + precio + " $");
    }
}
/**
 * run:
 * Ingrese el precio:  200
 * El precio final con descuento de 10% es: 180.0 $
 * 
 * run:
 * Ingrese el precio:  99
 * El precio final es: 99.0 $
 */
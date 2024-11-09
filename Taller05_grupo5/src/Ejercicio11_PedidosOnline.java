
/**
 *Problema 11
Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un 
* artículo del cual se tiene la descripción, la cantidad que se requiere y el precio
* unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 * Autor: Johan Wang.
 */
import java.util.Scanner;
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        
        String descripcion;
        int cantidad;
        double precioUnitario, costoTotal, costoConDescuento;
        Scanner tlc = new Scanner(System.in);
        // Solicitar descripción del artículo
        System.out.print("Ingresa la descripcion del articulo: ");
        descripcion = tlc.nextLine();

        // Solicitar la cantidad solicitada
        System.out.print("Ingresa la cantidad solicitada: ");
        cantidad = tlc.nextInt();

        // Solicitar el precio unitario del artículo
        System.out.print("Ingresa el precio unitario del articulo: ");
        precioUnitario = tlc.nextDouble();

        // Calcular el costo total sin descuento
        costoTotal = cantidad * precioUnitario;

        // Aplicar descuento si la cantidad supera las 50 unidades
        if (cantidad > 50) 
        {
            costoConDescuento = costoTotal * 0.85;  // 15% de descuento
            System.out.println("El costo total sin descuento es: " + costoTotal);
            System.out.println("El costo total con descuento es: " + costoConDescuento);
        } 
        else 
        {
            System.out.println("El costo total es: " + costoTotal);
        }
    }
}
/**
 * Salida:
 * debug:
Ingresa la descripcion del articulo: camisas
Ingresa la cantidad solicitada: 51
Ingresa el precio unitario del articulo: 10
El costo total sin descuento es: 510.0
El costo total con descuento es: 433.5
BUILD SUCCESSFUL (total time: 9 seconds)
 */


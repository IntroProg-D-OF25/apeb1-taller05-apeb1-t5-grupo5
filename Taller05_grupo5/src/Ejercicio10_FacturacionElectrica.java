
/**
 *Problema 10
Facturación eléctrica: Desarrollar una solución que permita calcular y mostrar el valor 
* a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora
* y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años,
* se debe descontar el 10% por pertenecer a la tercera edad.
 * Autor: Johan Wang
 */
import java.util.Scanner;

public class Ejercicio10_FacturacionElectrica {
    public static void main(String[] args) {
        double costo_k, kilovatio_consumido, precio_planilla;
        int edad;

        Scanner tlc = new Scanner(System.in);

        // Solicitar el costo del kilovatio/hora
        System.out.print("Ingresa el costo del kilovatio/hora: ");
        costo_k = tlc.nextDouble();

        // Solicitar la cantidad de kilovatios consumidos
        System.out.print("Ingresa la cantidad de kilovatios consumidos: ");
        kilovatio_consumido = tlc.nextDouble();

        // Solicitar la edad del cliente
        System.out.print("¿Que edad tiene el cliente?: ");
        edad = tlc.nextInt();

        // Calcular el precio de la planilla
        if (edad >= 65) {
            // Si el cliente tiene 65 años o más, aplicar un 10% de descuento
            precio_planilla = (kilovatio_consumido * costo_k) * 0.90;
        } else {
            // Si no, no se aplica descuento
            precio_planilla = kilovatio_consumido * costo_k;
        }

       
        System.out.printf("Total a pagar: %.2f%n", precio_planilla);

    }
}

/**
 * Salida:
 * debug:
Ingresa el costo del kilovatio/hora: 10
Ingresa la cantidad de kilovatios consumidos: 50
�Que edad tiene el cliente?: 65
Total a pagar: 450,00
BUILD SUCCESSFUL (total time: 14 seconds)
 */
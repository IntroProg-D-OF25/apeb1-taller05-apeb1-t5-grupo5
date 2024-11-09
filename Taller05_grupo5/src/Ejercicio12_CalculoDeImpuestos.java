
/**
 *Problema 12
Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil 
* (marca, origen y costo) imprima el impuesto por pagar y el precio de venta (incluido el impuesto).
* Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia,
* 15%, y si es de USA, 8%
 * Autor: Johan Wang
 */
import java.util.Scanner;

public class Ejercicio12_CalculoDeImpuestos {
    public static void main(String[] args) {
        String marca, origen;
        double costo, impuesto, precioVenta;

        Scanner tlc = new Scanner(System.in);

        // Solicitar marca del automóvil
        System.out.print("Ingresa la marca del automovil: ");
        marca = tlc.nextLine();

        // Solicitar origen del automóvil
        System.out.print("Ingresa el origen del automovil (Alemania, Japon, Italia, USA): ");
        origen = tlc.nextLine();

        // Solicitar el costo del vehículo
        System.out.print("Ingresa el costo del automovil: ");
        costo = tlc.nextDouble();

        // Calcular el impuesto basado en el origen del automóvil
        switch (origen.toLowerCase()) {
            case "alemania" -> impuesto = costo * 0.20;
            case "japon" -> impuesto = costo * 0.30;
            case "italia" -> impuesto = costo * 0.15;
            case "usa" -> impuesto = costo * 0.08;
            default -> {
                impuesto = 0; 
                System.out.println("ORIGEN NO VALIDO ERROR.");
            }
        }

        precioVenta = costo + impuesto;

        System.out.println("Impuesto por pagar:" + impuesto);
        System.out.println("Precio de venta con impuesto:" + precioVenta);
    }
}
/**
 * Salida: 
 * debug:
Ingresa la marca del automovil: Susuki
Ingresa el origen del automovil (Alemania, Japon, Italia, USA): Japon
Ingresa el costo del automovil: 10000
Impuesto por pagar:3000.0
Precio de venta con impuesto:13000.0
BUILD SUCCESSFUL (total time: 17 seconds)
 */
/**
 * Problema 13
Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10%
* si el cliente se hospeda más de 5 días, del 15% si se hospeda más de 10 días y del 20% si se 
* hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el número de días y 
* el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento 
* y el total por pagar.
* Autor: Johan Wang
 */
import java.util.Scanner;
public class Ejercicio13_SistemaReservasHoteleras {
    public static void main(String[] args) {
        int dias;            
        double precio;       
        Scanner tlc = new Scanner(System.in);
       
        // Solicitar el número de días
        System.out.print("Ingresa los dias que se hospedara el cliente: ");
        dias = tlc.nextInt();
       
        // Solicitar el precio de la habitación por día
        System.out.print("Ingresa el precio de la habitacion por dia: ");
        precio = tlc.nextDouble();

        // Si se hospeda más de 15 días, se aplica un 20% de descuento
        if (dias >= 15) {
            System.out.println("Descuento aplicado: 020%");
            System.out.println("Total a pagar: " + ((dias * precio) * 0.80));
        }
        // Si se hospeda más de 10 días, se aplica un 15% de descuento
        else if (dias >= 10) {
            System.out.println("Descuento aplicado: 15%");
            System.out.println("Total a pagar: " + ((dias * precio) * 0.85));
        }
        // Si se hospeda más de 5 días, se aplica un 10% de descuento
        else if (dias >= 5) {
            System.out.println("Descuento aplicado: 10%");
            System.out.println("Total a pagar: " + ((dias * precio) * 0.90));
        }
        // Si no se cumple ninguna de las condiciones anteriores, no hay descuento
        else {
            System.out.println("Descuento aplicado: 0%");
            System.out.println("Total a pagar: " + (dias * precio));
        }
    }
}

/**
 * En caso que se hospede menos de 5 días:
 * 
 * debug:
Ingresa los dias que se hospedara el cliente: 4
Ingresa el precio de la habitacion por dia: 10
Descuento aplicado: 0%
Total a pagar: 40.0
BUILD SUCCESSFUL (total time: 11 seconds)
* 
* En caso que sea mayor o igual a 5 días: 
* 
* debug:
Ingresa los dias que se hospedara el cliente: 6
Ingresa el precio de la habitacion por dia: 10
Descuento aplicado: 10%
Total a pagar: 54.0
BUILD SUCCESSFUL (total time: 10 seconds)
* 
* En caso de que se hospede 10 o mas dias:
* 
* debug:
Ingresa los dias que se hospedara el cliente: 11
Ingresa el precio de la habitacion por dia: 10
Descuento aplicado: 15%
Total a pagar: 93.5
BUILD SUCCESSFUL (total time: 11 seconds)
* 
* En caso de que sean 15 o mas dias:
* 
* debug:
Ingresa los dias que se hospedara el cliente: 15
Ingresa el precio de la habitacion por dia: 10
Descuento aplicado: 020%
Total a pagar: 120.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */
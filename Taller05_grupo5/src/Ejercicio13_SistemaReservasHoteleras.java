import java.util.Scanner;
public class Ejercicio13_SistemaReservasHoteleras {
  
    public static void main(String[] args) {
        int dias;
        double precio;
        Scanner tlc = new Scanner(System.in);
        System.out.print("Ingresa los dias que se osperdara el cliente: ");
        dias = tlc.nextInt();
        System.out.print("Ingresa el precio de la habitacion por dia: ");
        precio = tlc.nextDouble();
        
        if (dias <= 5) {
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.90));
        } 
        else if (dias < 10) {
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.90));
        } 
        
        else if (dias >= 10) {
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.85));
        }
        else if (dias < 15){
            System.out.println("Valor a pagar: " + ((dias * precio) * 0.85));
        }
        else if (dias > 15){
         System.out.println("Valor a pagar: " + ((dias * precio) * 0.80));
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Problema-8
Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y 
* clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).

 * Autor:Johan Wang
 */
import java.util.Scanner;

public class Ejercicio08_CalculadoraDeIMC {
    public static void main(String[] args) {
       double peso, altura, imc;
        Scanner tlc = new Scanner(System.in);
        
        //Solicitar peso en kg
        System.out.print("Ingresa tu peso en kilogramos: ");
        peso = tlc.nextDouble();
        
        //Solicitar altura en metros
        System.out.print("Ingresa tu altura en metros: ");
        altura = tlc.nextDouble();

        // Calcular el IMC
        imc = peso / (altura * altura);

        // Mostrar el IMC calculado
        System.out.println("Tu IMC es: " + imc);

        // Clasificar el IMC
        if (imc < 18.5) 
        {
            System.out.println("Clasificación: Bajo peso");
        } 
        else if (imc >= 18.5 && imc < 24.9)
        {
            System.out.println("Clasificacion: Peso normal");
        } 
        else if (imc >= 25 && imc < 29.9) 
        {
            System.out.println("Clasificacion: Sobrepeso");
        } 
        else 
        {
            System.out.println("Clasificacion: Obesidad");
        }

      
    }
}

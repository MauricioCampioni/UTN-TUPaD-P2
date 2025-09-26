/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.programacion2;
import java.util.Scanner;
/**
 *
 * @author Mauricio
 */
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        // Validacion de division por cero
        String division;
        if (numero2 != 0) {
            division = String.valueOf(numero1 / numero2);
        } else {
            division = "No se puede dividir por cero.";
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("Division: " + division);
        scanner.close();
    }
}

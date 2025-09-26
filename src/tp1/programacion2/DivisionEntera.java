package tp1.programacion2;
import java.util.Scanner;
public class DivisionEntera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int b = scanner.nextInt();
        int resultado = a / b;
        System.out.println("Resultado (división entera): " + resultado);
        scanner.close();
    }
}

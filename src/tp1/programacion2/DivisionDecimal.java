package tp1.programacion2;
import java.util.Scanner;
public class DivisionDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();
        double resultado = a / b;
        System.out.println("Resultado (división decimal): " + resultado);
        scanner.close();
    }
}

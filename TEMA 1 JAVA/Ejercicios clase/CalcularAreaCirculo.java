import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = 3.14 * radio * radio;

        System.out.println("El área del círculo es: " + area);
        scanner.close();
    }
}
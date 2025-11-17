import java.util.Scanner;

public class CalculoAreaCirculo{
    public static void main(String[] args) {
        // Inicio del programa
        Scanner scanner = new Scanner(System.in);

        // Leer el radio
        System.out.print("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área
        double area = 3.14 * radio * radio;

        // Escribir el área
        System.out.println("El área del círculo es: " + area);

        // Fin del programa
        scanner.close();
    }
}


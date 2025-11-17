import java.util.Scanner;

public class tablademultiplicar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------introduce el numero de la tabla de multiplicar------------");
        int numero = scanner.nextInt();

        System.out.println("-------Tabla de multiplicar del Nº" + numero );
        for (int i = 1; i <= 10; i ++){
            System.out.println(numero + " x " + i + " = " + (numero * i));

        }
    }
}


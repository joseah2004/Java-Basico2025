import java.util.Scanner;
// Realiza un aplicación de calculadora, que tendrá 4 funciones para las operaciones aritméticas de suma, resta, multiplicación y división.

// En el método main, se pedirán al usuario dos números, y después la operación que quiere realizar.  
// Introduce número 1: Introduce número 2: ¿Qué operacion quieres realizar?: 1. suma 2.resta 3.multiplicación 4.división El resultado de la operación es





public class Funciones {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        String cadena = "";
        int res;

        System.out.println("Introduce el first number :O");
        int numero1 = lector.nextInt();
        System.out.println("introduce el second number ;c");
        int numero2 = lector.nextInt();
        
        

        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("|1.<==Sumar-------------------|");
        System.out.println("|2.<==Restar------------------|");
        System.out.println("|3.<==Multiplicar-------------|");
        System.out.println("|4.<==Dividir-----------------|");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1 :
            res = sumar(numero1, numero2);
            System.out.println("> Suma ="+ res + "<");
                break;
            case 2:
            res = restar(numero1, numero2);
            System.out.println("> resta ="+ res + "<");
            break;
            case 3:
            res = multiplicar(numero1, numero2);
            System.out.println("> multiplicacion ="+ res + "<");
            break;
            case 4 :
            res = dividir(numero1, numero2);
            System.out.println("> division ="+ res + "<");
                break;

            default:
                break;
        }
    }

    
    

    public static int sumar(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
    

    
    public static int restar(int numero1, int numero2){
        int resultado = numero1 - numero2;
        return resultado;
    }

    public static int multiplicar(int numero1, int numero2){
        int resultado = numero1 * numero2;
        return resultado;
    }

    public static int dividir (int numero1, int numero2){
        int resultado = numero1 / numero2;
        return resultado;
    }
}

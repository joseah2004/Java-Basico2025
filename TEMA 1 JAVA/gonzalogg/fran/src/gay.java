import java.util.Scanner;
// Se aplican descuentos por edades:

// Menor de 8 años: gratis
// Entre 8 y 17 años: se aplica el 50% de descuento
// Entre 18 y 64 años: no hay descuento
// Mayor de 64 años (a partir de 65): gratis
public class gay {
public static void main(String[] args) {
    Scanner lectorteclado = new Scanner(System.in);
    
    System.out.println("------------ Introduce tu edad --------");
    int edad = lectorteclado.nextInt();
    

    if (edad < 8) {
        System.out.println(" gratis");
    }else if (edad >= 8 && edad <= 17) {
        System.out.println("50% gonza chikito");

    }else if (edad >= 18 && edad <= 64) {
        System.out.println("Paga sorra");

    }else{
        System.out.println( "SEXO CON ABUELAS");

    }

}
}

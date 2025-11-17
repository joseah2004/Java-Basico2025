import java.util.Scanner;
public class Ejercicio1 {
     
   
    public static void main (String[]args){

        Scanner lectorTeclado = new Scanner (System.in);
        int numero;
        int resto;
        int VALOR = 2;

        System.out.println("ESCRIBE UN NÚMERO");

        numero= lectorTeclado.nextInt();

        resto = numero % VALOR;

        if (resto == 0){
            System.out.println("EL NÚMERO ES PAR");
        }else
            System.out.println("EL NÚMERO ES IMPAR");
        }
    }

/* 
    * Ejercicio 2.
    * Escribe un programa que solicite una contraseña (con mayusculas, minúsculas,
    * signos de puntuación y números), si la contraseña es correcta tendrá 
    * acceso al sistema, si es incorrecta no.
    */
    Public static boolean esContraseñaValida(String contraseña) {
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tienePuntuacion = false;

    String cadena1 = "abcd"; 
    String cadena2 = "ABCD"
    if (cadena1.equals (cadena2)) {
        
    }
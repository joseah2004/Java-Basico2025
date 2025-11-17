package es.avellaneda;

import java.util.Scanner;

public class CapturasExcepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int numero;

        System.out.println("Introduce el numero");
        cadena = sc.nextLine();
        try{
            numero = Integer.parseInt(cadena);
            System.out.println("número "+ numero);
            
        }catch (Exception ex) {
        System.out.println("NO ERA EL NUMERO QUE HAS INTRODUCIDO");

        }
        finally{
            System.out.println("VOY A MOSTRAR UN MENSAJE");
        }
        System.out.println("continua el programa");
    }
}

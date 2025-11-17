package es.avellaneda;

import java.util.Scanner;

public class Ejercicio3 {
// Ejercicio 3
// En este ejercicio además de crear funciones vamos a repasar los métodos de String. 
// Para ello hacer una función que será la encargada de pedir al usuario por consola que introduzca un carácter. 
// ¿Existe un método de Scanner que permita recoger el tipo char ?. La función devolverá el char que ha introducido el usuario. 
// Después completa una función que compruebe si el el carácter es una vocal, la función devolverá un booleano. 
// En el método main, realizarás la llamada a la función de pedirCaracter, y con su resultado comprobarás si es una vocal o no.


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    pedirCaracter(sc);
}









public static char pedirCaracter(Scanner sc){
    

    char caracter = 'x' ;
    boolean continuar = true;
    String cadena ;
    do{
        System.out.println("Caracter");
        cadena = sc.nextLine();  
    

        if (cadena.length()>1) {
            System.out.println("Debes introducir solo un caracter");
            System.out.println("has introducido" + cadena.length());
        }else{
            caracter = cadena.charAt(0);
            continuar = false;
        }
    
    
    }while (continuar);

    //caracter = sc.nextLine().charAt(0);
   

    System.out.println('a' == caracter);
    return caracter;
    
}


}



// Programa que muestre un mensaje repetido por consola tantas veces como se haya introducido por teclado.

// Hazlo de tres formas:

//     con bucle for.
//     con bucle while.
//     con bucle do..while.


import java.util.Scanner;
public class ejercicioechoconlostrestipos {


public static void main(String[] args) {
//for
for (int a=0; a<3; a++) {
    System.out.println(" no es mayor que 2, debemos esperar..." + a  );
}
//while
System.out.println("-----Ejemplo básico de while---");
int i = 0;
while (i < 3) {
System.out.println(i);
i++;

}
//do while
System.out.println("while");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while(j < 5);



// Ejercicio 2
// Programa que muestre los números del 1 a un número mayor introducido por teclado utilizando la sentencia for.
// Realizar el ejercicio mostrando los números cada uno en una línea.
// Y después mostrándolos en la misma línea separados por un espacio.
// Mostrar un mensaje que indique el final del programa



      //scanner y variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        //for
        System.out.println("Números en líneas separadas:");
        for (int k = 1; k <= numero; k++) {
            System.out.println(k);
        }
        //for
        System.out.println("Números en la misma línea:");
        for (int k = 1; k <= numero; k++) {
            System.out.print(k + " ");
        }
        //cerrar
        System.out.println("\nFin del programa.");
        scanner.close();
            
    

// Ejercicio 3
// Programa que muestre los números del 100 al 1 utilizando la instrucción while.
// Realizar el ejercicio mostrando los números cada uno en una línea.
// Y después mostrándolos en la misma línea separados por un espacio.
// Mostrar un mensaje que indique el final del programa


        System.out.println("Números en líneas separadas:");
        int numeroo = 100;
        while (numeroo >= 1) {
            System.out.println(numeroo);
            numeroo--;
        }
        System.out.println("Números en la misma línea:");
        numeroo = 100;
        while (numeroo >= 1) {
            System.out.print(numeroo + " ");
            numeroo--;
        }
        System.out.println("Fin del programa.");
    }
}
// Ejercicio 4
// Programa que muestre los números, descendiendo de uno en uno desde
// un número introducido por teclado mayor al 1 hasta el número 1 utilizando la 
// instrucción do-while.
// Realizar el ejercicio mostrando los números cada uno en una línea.
// Y después mostrándolos en la misma línea separados por un espacio.
// Mostrar un mensaje que indique el final del programa.



    






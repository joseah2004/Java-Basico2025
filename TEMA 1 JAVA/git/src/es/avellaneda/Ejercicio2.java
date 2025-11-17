
package es.avellaneda;


// Completa el código de una aplicación que podrá calcular el área o el volumen de un cilindro:
// image

import java.util.Scanner;

import calculos.Calculos;

// Es requisito que la petición de datos al usuario 
//(radio, altura, y la opción de área o volumen) se haga en el método main y el cálculo se haga en una función con la siguiente firma o declaración:
// static double areaVolumenCilindro(double radio, double altura, int opcion) { ......} 
//La función areaVolumenCilindro, debe estar en un paquete distinto al que tiene el código principal.
public class Ejercicio2 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radio, altura ;
        int opcion;
        double resultado;
        System.out.println("Introduce el radio");
        radio = sc.nextDouble();
        System.out.println("Introduce la altura");
        altura = sc.nextDouble();
        System.out.println("Introduce la opcion \n1.volumen \n2.area");
        opcion =sc.nextInt();

        resultado = calculos.Calculos.areaVolumenCilindro(radio,altura,opcion);

        System.out.println("El resultado es '" +resultado + "'");
}


        



}
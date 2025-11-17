
import java.util.Scanner;

// Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos.
// Calcula y muestra la hora:minutos:segundos que serán, transcurrido un segundo.
// Solo se puede introducir como máximo los valores de:
// 23 horas
// 59 minutos
// 59 segundos

public class SUMASEGUNDO {
    
public static void main (String[] args){
Scanner lectorTeclado = new Scanner (System.in);
int hora;
int minutos;
int segundos;
boolean continua = true;


while(continua){
System.out.print("Introduzca hora: ");
hora = lectorTeclado.nextInt();
System.out.print("Introduzca minutos: ");
minutos = lectorTeclado.nextInt();
System.out.print("Introduzca segundos: ");
segundos = lectorTeclado.nextInt();
    

int horatotal = hora,minutos,segundos
    System.out.println();
    



if (continua) {
    

    (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59 )


    

}else{
    System.out.println("Error: Las horas deben estar entre 0 y 23, los minutos y segundos entre 0 y 59.");
    return;

}
}
}
}
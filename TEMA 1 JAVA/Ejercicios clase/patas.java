// Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de trabajo.

// Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar.
// El número de hormigas capturadas (6 patas)
// El número de arañas capturadas (8 patas)
// El número de cochinillas capturadas (14 patas)
// La aplicación debe mostrar el número tota de patas.

import java.util.Scanner;

public class patas {   


    public static void main(String[] args) {
       
        int Numerohormigas;
        int Numeroarañas;
        int Numerocochinillas;

        final int PatasHormiga = 6;
        final int PatasArañas = 8;
        final int PatasCochinillas = 14;
        final int max = 32;
        boolean continua = true;

        Scanner lectorTeclado = new Scanner (System.in);

        while(continua){
        System.out.println("¿Cuantas hormigas has capturado?");
        Numerohormigas = lectorTeclado.nextInt();

        System.out.println("¿Cuantas arañas has capturado?");
        Numeroarañas = lectorTeclado.nextInt();

        System.out.println("¿Cuantas cochinillas has capturado?");
        Numerocochinillas = lectorTeclado.nextInt();

      int total= Numerohormigas*PatasHormiga+Numeroarañas*PatasArañas+Numerocochinillas*PatasCochinillas;
      System.out.println("El total de patas es: " + total);

    
     
      if (total <= 32) {
            continua= true;
            System.out.println("EL BAILE DE LA CUCARACHA"+  total);
           
            
            
          }else{
            continua= false;

            System.out.println("CURRA MÁS, QUE TIENES QUE LEVANTAR ESPAÑA");
          }
      }
    }

    
















}
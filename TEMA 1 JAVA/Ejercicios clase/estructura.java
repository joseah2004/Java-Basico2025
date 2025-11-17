import java.util.Scanner;

public class estructura {

    /**
     * EJERCICIO ADIVINA UN NÚMERO
     * 
     * 
     * SI EL USUARIO ACIERTA, LE FELICITAMOS Y TERMINAMOS
     * 
     * SI EL USUARIO NO ACIERTA, TIENE HASTA 5 POSIBILIDADES DE ACERTAR.
     * DESPUÉS EL PROGRAMA TERMINA
     *
     * 
     *  @param args
     */
    
    public static void main (String[] args){
        final int NUMERO = 10;
        Scanner lectorTeclado = new Scanner (System.in);
        int intento;
        boolean continua = true;

        System.out.println("ADIVINA UN NÚMERO");

        while(continua){
            //código que se va repetir mientras se cumple la condición
            System.out.println ("INTRODUCE UN NÚMERO");
            intento = lectorTeclado.nextInt();

            if (intento == NUMERO){
                System.out.println("FELICIDADES HAS ACERTADO");
                continua = false;
            }




        }
        do{
            System.out.println("INTRODUCE UN NUMERO");
            intento = lectorTeclado.nextInt();

            if (intento == NUMERO){
                System.out.println ("FELICIDADES HAS ACERTADO");
                 continua = false;
            }
            
            //código que se va a ejecutar una vez al menos,
            // después se repetirá mientras se cumpla la condidicón

            else{
                

            }

        }while(continua);
    }
}

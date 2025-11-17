import java.util.Scanner;
public class While {
    public static void main (String[] arga) throws Exception{

        final int NUMERO = 23;
        Scanner lectorTeclado = new Scanner (System.in);
        int intento;
        boolean continua = true;

        System.out.println("¡HOLA!, PRUEBA TU SUERTE");

        while (continua){
            System.out.println("INTRODUCE UN NUMERO");

            intento = lectorTeclado.nextInt();

            if (intento == NUMERO){
                System.out.println("FELICIDADES HAS ACERTADO");
                continua = false;

            }else{
                System.out.println("FALLASTE");
            }
            
        }
    }

}


    


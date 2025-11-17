import java.util.Scanner;
public class bucles{

 
public static void main(String[] args) {
    // repetición de escribir hola mientras que se cumpla que 
    // valor = true

    Scanner lectorTeclado = new Scanner(System.in);
    boolean valor = true;
    String opcion; 

    while(valor){

        System.out.println("hola");
        System.out.println("¿Quieres continuar en el bucle");
        System.out.println("RESPONDE SI, si quieres continuar");

        opcion = lectorTeclado.nextLine();

        if(opcion.equals("si")){
            valor = true;

        }else{
            valor = false;

        }

        // PREGUNTAREMOS AL USUARIO SI QUIERE CONTINUAR
        // SI DICE "SI" - EL PROGRAMA VOLVERÁ A escribir
        // "hola" y volverá a preguntarñe si quiere continuar
        // SI DICE CUALQUIER OTRA COSA EL PROGRAMA FINALIZA

        

        

    

        
    }

    System.out.println("fin");
}
}

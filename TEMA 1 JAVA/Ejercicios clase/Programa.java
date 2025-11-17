import java.util.Scanner;
public class Programa {
    int edad = 22;


    public static void main(String[] args) {

     System.out.println("Dime tu nombre");
     
     Scanner lectorTeclado = new Scanner (System.in);
     String nombre = lectorTeclado.nextLine();


     System.out.println("Primer apellido");

     
     String apellidos = lectorTeclado.nextLine();

     System.out.println("Segundo apellido");
     String apellido = lectorTeclado.nextLine();

     System.out.println("Edad");
     String edad = lectorTeclado.nextLine();

     System.out.println("****************");
     
    int edadInt= Integer.parseInt(edad);
    System.out.println("D/DÑA   " + nombre +"   EL AÑO QUE VIENE CUMPLIRÁ    "  + (edadInt+1)  +  "  AÑOS");
    



    

     
    }

   
    
    
}

import java.util.Scanner;

public class UT301ifEjercicio03 {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        //Pedimos al usuario que introduzca su edad.
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt();

        if(edad<7 || edad>64){
            System.out.println("Precio del billete: GRATIS.");

        }else if (edad > 6 && edad <26){
            
            System.out.println("Precio del billete: 1€");

        }else if (edad > 25 && edad < 65){

            System.out.println("Precio del billete: 2€");
            

        }
        }
        }
    
    


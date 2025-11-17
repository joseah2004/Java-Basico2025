import java.util.Scanner;

public class tablamultprofe {
    public static void main(String[] args) {
        //preguntamos al usuario
        //que tablas quiere que le mostremos
        //solamente son validos los numeros en orden
        //solo numeros entre el rango 1 al 20
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------introduce el numero de la tabla de multiplicar------------");
        int numero = scanner.nextInt();

        System.out.println("------------introduce el rango------------");
        int numeroF=scanner.nextInt();

        
        if (numero >= 1 && numeroF <= 20 && numero <= numeroF) {

        for (int i = numero; i <= numeroF; i++ ){
            System.out.println("-------Tabla de multiplicar del Nº" + i );
        

        for (  int j = 1; j <= 10; j ++ )
            System.out.println(i + " x " + j + " = " + (i * j));

        }
    }
        else{
            System.out.println("EL RANGO TIENE QUE SER ENTRE 1 Y 20");
            
        }
        
    }}
    


import java.util.Scanner;

public class FacturasGastos {

    /**
     * REQUISITOS: 
     * 
     * Debe pedir el número de facturas del cliente.
     * Por cada factura debe pedir el número de gastos que tiene la factura.
     * Por cada gasto debe pedir el importe del mismo.
     * Debe mostrar el importe total de gastos de cada factura.
     * Finalmente debe mostrar el importe total de todas las facturas del usuario
     * 
     * @param args
     */
    public static void main(String[] args) {
        // número de facturas y gastos debe ser entero
        int numeroFacturas, numGastos;
        double gasto; 
        double[] totalFactura;
        double totalFacturas=0, totalGastosFactura=0; 
        Scanner sc = new Scanner(System.in);


        
        System.out.println("Indica el número de faturas que vas introducir:");
        numeroFacturas = sc.nextInt();
        String opcion;
        boolean continua = true;
        
        //creamos el array estático, una vez que conocemos el tamaño
        totalFactura = new double[numeroFacturas];

        for (int i = 0; i < numeroFacturas; i++) {

            System.out.println("Indica el número de gastos de la factura "+ (i+1));
            numGastos = sc.nextInt();
            for(int j=0; j<numGastos; j++){
                System.out.println("     Indica el importe del gasto " +  (j+1));
                gasto = sc.nextDouble();
                totalGastosFactura += gasto; 

            }
            System.out.println("Factura ( " + (i+1) + ")" +  "total importe: "+ totalGastosFactura);
           totalFactura[i]= totalGastosFactura;
           
           
            //totalFacturas += totalGastosFactura; 
            totalGastosFactura =0; 
          

            }for (int i = 0; i < numeroFacturas; i ++) {

            
            System.out.println("***************************************************");
            System.out.println("Importe total de todas las facturas: "+ totalFacturas);
            System.out.println("***************************************************");
while (continua){

System.out.println("1. Mostrar todos los importes totales de las facturas");
System.out.println("2. Mostrar el total de todas las facturas");
System.out.println("3. Muestra el importe más alto");
System.out.println("4. Muestra el importe más bajo");
System.out.println("5. Pide al usuario que factura quiere modificar");
System.out.println("6. salir");

opcion = sc.nextLine();

switch (opcion){
    case "1":
    mostrarTotales(totalFactura);
   
    break;




    case "2":
    mostrarTotal(totalFactura);
   
    break;




    case "3":
    mostrarMaximo(totalFactura);
   
    break;


    case "4":
   
    break;


    case "5":
    
    // int cambio;
    // double valor;
    // boolean pideMas= true;
    // while (pideMas){

    // }
    // try{
    //  System.out.println("Dame el numero de factura que quieres modificar");
    // cambio = sc.nextInt();
    // pideMas=true;
    // }catch (Exception mException) {
    //     System.out.println("EL NÚMERO NO ES CORRECTO");
    //     pideMas= false;

    // }
    
    // try{

    // System.out.println("Dime el importe final de la factura" + cambio);
    // valor = sc.nextDouble();
    // totalFactura[cambio-1]= valor; 
    // pideMas= true;
    //  } catch (Exception e){
    //     pideMas = true;
     

    //  }
    
        int cambio;
        double valor;
        boolean pideMas = true; 

        
        while (pideMas) {

        try {

        System.out.println("Dame el número de factura que quieres modificar:");
        cambio = sc.nextInt();

        if (cambio > 0 && cambio <= totalFactura.length) {
                                System.out.println("Dime el importe final de la factura " + cambio );
                                valor = sc.nextDouble();
                                totalFactura[cambio - 1] = valor;
                                System.out.println("Factura " + cambio + " modificada con el nuevo importe: " + valor);
                                pideMas = false; 
        } else {
                                System.out.println("Número de factura no válido. Debe estar entre 1 y " + totalFactura.length);
        }

        } catch (Exception mException) {
         System.out.println("Entrada no válida. Por favor ingresa un número válido.");
        sc.next(); // Limpiar el buffer de entrada en caso de error
        }
        }

    break;
     
     

    case "6":
    System.out.println("fin");
    break;
    default:
    System.out.println("Opción no valida");
}
        }
        }
      

    }
    //funcion que muestra todos los importes totales de las facturas
    public static void mostrarTotales(double[] valores) {

        // aquí en "valores" ya tengo el array con los totales de las facturas
        System.out.println("MUESTRA TODOS LOS VALORES");
        for(int i=0; i<valores.length; i++){


            System.out.println("Factura num"+ (i+1)+ valores[i] );
        }
    }


    //TOTAL
    public static void mostrarTotal(double[] totalFactura) {
        System.out.println("Total de todas las facturas: " + totalFactura);
    }
    



    //MAX
    public static double mostrarMaximo(double[] totalFactura) {
        System.out.println("MUESTRA TODAS LAS FACTURAS ");
        double alto = 0;
        for (int i = 0; i<totalFactura.length; i++ ) {
            if (totalFactura[i] > alto) {
                alto =totalFactura[i];
            }
        }
        return alto;
    }

    //MINIMO
    public static double mostrarMinimo(double[] totalFactura) {
        System.out.println("MUESTRA TODAS LAS FACTURAS ");
        double bajo = Double.MAX_VALUE;
        for (int i = 0; i<totalFactura.length; i++ ) {
            if (totalFactura[i] < bajo) {
                bajo =totalFactura[i];
            }
        }
        return bajo;
    }
}
import java.util.Scanner;

public class facturasArray {

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
        boolean continua= true;
        String opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el número de faturas que vas introducir:");
        numeroFacturas = sc.nextInt();
        //creamos el array una vez conocemos la capacidad 
        totalFactura =new double[numeroFacturas] ;
        for (int i = 0; i < numeroFacturas; i++) {

            System.out.println("Indica el número de gastos de la factura "+ (i+1));
            numGastos = sc.nextInt();
            for(int j=0; j<numGastos; j++){
                System.out.println("     Indica el importe del gasto " +  (j+1));
                gasto = sc.nextDouble();
                totalGastosFactura += gasto; 

            }
            System.out.println("Factura ( " + (i+1) + ")" +  "total importe: "+ totalGastosFactura);
            totalFactura[1]=totalGastosFactura;
           
           // totalFacturas += totalGastosFactura; 
            totalGastosFactura =0; 
          

            }
            System.out.println("***************************************************");
            System.out.println("Importe total de todas las facturas: "+ totalFacturas);
            System.out.println("***************************************************");

  //aqui ya tenemos los gastos de la factura 

            while(continua){

                System.out.println("1. Mostrar todos los importes totales de las facturas");
                System.out.println("2. Mostrar el total de todas las facturas");
                System.out.println("3. Muesta el importe mas alto");
                System.out.println("4. muestra el importe mas baj0");
                System.out.println("5 salir ");
                System.out.println("");
                
                opcion=sc.nextLine();
                switch (opcion) {
                    case "1" :
                            muestraTotales(totalFactura);
                            
                        break;
                        case "2" :
                            muestraTotal(totalFactura);
                            
                        break;
                        case "3" :
                        System.out.println("el valor bajo es :" + valoralto(totalFactura));

                        
                    break;
                    case "4":
                    System.out.println("el valor bajo es :" + valorbajo(totalFactura));

                      
                    break;
                        case "5" :
                        continua=false;
                    break;
                    default:
                    System.out.println("opcion no valida ");
                       break;
                }
            }
        }
      //funciones que muesta todos los importes totales de las facturas
public static void  muestraTotales(double[] valores){
    // aqui en "valores" ya tengo el array con los totales de las facturas
    for (int i=0;i<valores.length;i++)  {
        System.out.println("facturas num" + (i+1) + valores[i]);


    }

}
public static void  muestraTotal(double[] totalFactura){
    System.out.println("muestra el total de todas las facturas");
    double total=0;
    for (int i=0;i<totalFactura.length;i++)  {

        total += totalFactura[i];
        System.out.println("facturas num" + totalFactura.length +"es" + total);


    }

}
public static double  valoralto(double[] totalFactura){
   double alto= 0;
   for (int i=0;i<totalFactura.length;i++)  {
    if(totalFactura[i] >alto){
        alto=totalFactura[1];
    }

}
return alto;


}
public static double   valorbajo(double[] totalFactura){
    double bajo= 0;
    for (int i=0;i<totalFactura.length;i++)  {
     if(totalFactura[i] <=bajo){
         bajo=totalFactura[1];
     }
 }
 return bajo;
 
   
}
}

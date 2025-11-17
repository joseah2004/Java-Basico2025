import java.util.Scanner;
public class facturas {
   public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      
      

        System.out.print("Ingrese el número de facturas: ");
        int Facturas = pediValor();
        double totalGeneral = 0;

        for (int i = 1; i <= Facturas; i++) {
            System.out.println("Factura " + i + ":");

           
            System.out.print("Ingrese el número de gastos de la factura " + i + ": ");
            int Gastos = pediValor();
            double totalFactura = 0;

            for (int j = 1; j <= Gastos; j++) {
                System.out.print("Ingrese el importe del gasto " + j + ": ");
                double importe = pediValordouble();
                totalFactura += importe;
            }

         
            System.out.println("Total de la factura " + i + ": " + totalFactura);
            totalGeneral += totalFactura;
        }

        System.out.println("***************************************************");
        System.out.println("*******Importe total de todas las facturas: " + totalGeneral);
        
    }


    public static  int pediValor(){
        int opcion=0;

        boolean valorMalo=true;
        while(valorMalo){

            try {
                System.out.println("introduce un valor entero");

                opcion = sc.nextInt();
                valorMalo=false;
            } catch (Exception ex) {
                System.out.println(" el valor numero un numero entero");
                sc.nextLine();/*para limpiar el scanner  */
            }
        }
        return opcion;
    }

    public static  double  pediValordouble(){
        double opcion=0;

        boolean valorMalo=true;
        while(valorMalo){

            try {
                System.out.println("introduce un valor entero");

                opcion = sc.nextDouble();
                valorMalo=false;
            } catch (Exception ex) {
                System.out.println(" el valor numero un numero entero");
                sc.nextLine();/*para limpiar el scanner  */
            }
        }
        return opcion;
    }
}



          
            
          
    
    


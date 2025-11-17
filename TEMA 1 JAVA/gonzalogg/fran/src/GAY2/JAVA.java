package GAY2;
import java.util.Scanner;
public class JAVA {
//     Debe pedir el número de facturas del cliente.
// Por cada factura debe pedir el número de gastos que tiene la factura.
// Por cada gasto debe pedir el importe del mismo.
// Debe mostrar el importe total de gastos de cada factura.
// Finalmente debe mostrar el importe total de todas las facturas del usuario
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce cuantos facturas tienes");
        int factura = teclado.nextInt();
        
        for (int i=1;i<factura;i++){
            System.out.println("Introduce el numero de gastos de la factura numero "+i);
            int num=teclado.nextInt();
                for(int j=1;j<num;j++){
                    System.out.println("Introduce el importe del gasto numero "+j+" de la factura");
                    double precio[j]=teclado.nextDouble();
                }


        }
    }
}
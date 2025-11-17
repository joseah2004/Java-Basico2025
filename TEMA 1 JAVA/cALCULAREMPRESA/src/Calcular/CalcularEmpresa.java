package Calcular;

import java.util.Scanner;

// Debe pedir el número de facturas del cliente.
// Por cada factura debe pedir el número de gastos que tiene la factura.
// Por cada gasto debe pedir el importe del mismo.
// Debe mostrar el importe total de gastos de cada factura.
// Finalmente debe mostrar el importe total de todas las facturas del usuario

public class CalcularEmpresa {
public static Scanner sc = new Scanner(System.in);
//public static void{pedirValor();}
    


    public static void main(String[] args) {

        int numeroFacturas;
        double totalGeneral = 0;
        double totalFactura = 0;

        //
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("Cual es el numero de las facturas d elos clientes");
        numeroFacturas = sc.nextInt();

        // for//
        for (int i = 0; i < numeroFacturas; i++) {

            System.out.println("Factura" + i);
            System.out.println("Numero de gastos =");
            int numGastos = sc.nextInt();
            boolean valorBueno = true;
                while (valorBueno) {
                    try{
                        numGastos = sc.nextInt();
                        valorBueno =false;

                    }catch (Exception e){
                        System.out.println("El valor no es valido tienes que volver a teclearlo");
                    }
                }
            // for//
            for (int j = 1; j <= numGastos; j++) {
                System.out.println();
                double importeGasto = sc.nextDouble();
                totalFactura += importeGasto;

            }
            //
            System.out.println("Total de gastos de la factura " + i + ": " + totalFactura);
            totalGeneral += totalFactura;

        }
        System.out.println("El importe total de todas las facturas es: " + totalGeneral);

    }


    public static int pedirValor() {
        int opcion;
        boolean valorMalo = true;
        while(valorMalo){
        try{
            System.out.println("introduce un valor entero");
            opcion = sc.nextInt();
            //si llego aqui, es el que el usuario ha introducido entero
            valorMalo = false;
        }catch(Exception ex){
            System.out.println("el valor no era un numero entero");

        }
    }
    return opcion;
    }
}


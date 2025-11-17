package calculos;
// Completa el código de una aplicación que podrá calcular el área o el volumen de un cilindro:
// image

// Es requisito que la petición de datos al usuario 
//(radio, altura, y la opción de área o volumen) se haga en el método main y el cálculo se haga en una función con la siguiente firma o declaración:
// static double areaVolumenCilindro(double radio, double altura, int opcion) { ......} 
//La función areaVolumenCilindro, debe estar en un paquete distinto al que tiene el código principal.
public class Calculos {
    public static double areaVolumenCilindro(double radio, double altura, int opcion) {
        double resultado = 0;
        double PI = 3.14;
        switch (opcion) {
            case 1:
                    //VOLUMEN            
                    resultado = Math.PI * radio * radio * altura;
             break;
            case 2:
            //ALTURA
                resultado = 2* Math.PI * radio * (radio * altura);
            break;
            default:
            System.out.println("Opción inválida. Elige 1 para volumen o 2 para área.");
        }
        return resultado;

    }
}

public class UT03E04WhileDoWhile {

    public static void main(String[] args) {
        
        // Ejemplo básico de bucle while
        System.out.println("-----Ejemplo básico de while---");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        
        // Otro ejemplo de while
        i = 0;
        System.out.println("-----Ejemplo flag-----");
        boolean flag = true;
        while(flag) {
            if (i > 3) {
                flag = false;
            } else {
                System.out.println("i no es mayor de 3, debemos esperar. " + i);
                i++;
            }
        }
        
        // Ejemplo básico de do while
        System.out.println("-----Ejemplo básico de do...while-----");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < 5);
        
        // Otro ejemplo de do...while
        System.out.println("----Hola prueba tu suerte-----");
        boolean tengoCita = false;
        do {
            System.out.println("Llamando...");
            System.out.println("Me han dado cita!");
            tengoCita = true;
        } while (!tengoCita);
        
        
        // Debemos tener cuidado con los bucles while, si hacemos mal
        // la condición de salida nos podemos quedar en un bucle infinito

    }
    

































}

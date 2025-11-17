public class UT03E01if {

    public static void main(String[] args) {
        // Ejemplos de uso de la ejecución condicional if
        System.out.println("-----Sentencia if-----");
        
        int a = 3;
        if (a < 5) {
            System.out.println("AAA");
        }
        
        System.out.println("Esto se ejecuta siempre, no está dentro de un if.");
        
        boolean z;
        z = true;
        if (z) {
            System.out.println("BBB");
        }
        
        int b = 7;
        int c = 6;
        // usamos varias operaciones pero el resultado final será true o false
        if (!(((a < b) && (c > b)) || (b == a))) {
            System.out.println("CCC");
        }
        
        z = !(((a < b) && (c > b)) || (b == a));
        if (z) {
            System.out.println("DDD");
        }
        
        // De esta forma podemos comparar un string
        String cadena = "Hola", cadena2 = "Hola";
        if (cadena.equals(cadena2)) {
            System.out.println("EEE");
        }
        if ("Hola".equals(cadena2)) {
            System.out.println("FFF");
        }
        if (cadena.equals("Hola")) {
            System.out.println("GGG");
        }
        
        // Ejemplo de uso de la sentencia else asociada a un if
        System.out.println("-----Sentencia else-----");
        a = 2;
        if (a < 5) {
            System.out.println("HHH");
        } else {
            System.out.println("III");
        }
        
        // Ejemplo de uso de else if
        System.out.println("-----Sentencia else if-----");
        a = 4;
        if (a == 4) {
            System.out.println("JJJ");
        } else if (a == 5) {
            System.out.println("KKK");
        } else {
            System.out.println("LLL");
        }       
        
        int resto = 5%3;

        a= 6;

        switch (a){
            case 6:
            System.out.println("PAR");
            break;

            case 5:
            System.out.println("IMPAR");
            break;
            

        }
        
    }
    
}

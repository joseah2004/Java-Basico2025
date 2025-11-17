public class UT02E04ConversionesDeTipos {

    public static void main(String[] args) {
        // Conversión implícita
        System.out.println("-----Conversión implícita-----");
        int vbleTipoInt = 5;
        double vbleTipoDouble;
        vbleTipoDouble = vbleTipoInt;
        System.out.println("Implícita: Valor de int: " + vbleTipoInt);
        System.out.println("Implícita: Valor de double: " + vbleTipoDouble);
        
        byte vbleTipoByte = 10;
        short vbleTipoShort;
        vbleTipoShort = vbleTipoByte;
        System.out.println("Implícita: Valor de byte: " + vbleTipoByte);
        System.out.println("Implícita: Valor de short: " + vbleTipoShort);
        
        // Conversión explícita
        System.out.println("-----Conversión explícita-----");
        double vbleTipoDouble2 = 3.2;
        int vbleTipoInt2;
        vbleTipoInt2 = (int)vbleTipoDouble2;
        System.out.println("Explícita: Valor de double: " + vbleTipoDouble2);
        System.out.println("Explícita: Valor de int: " + vbleTipoInt2);
        
        // Convirtiendo texto a número
        System.out.println("-----Conversión texto a número-----");
        String cadena1 = "7";
        String cadena2 = "hola";
        int numero;
        numero = Integer.parseInt(cadena1);
        //numero = Integer.parseInt(cadena2); // Error :(
        System.out.println("El valor de la variable número es: " + numero);

    }
    
}
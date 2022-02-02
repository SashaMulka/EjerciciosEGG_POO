

package poo_08;

import java.util.Locale;
import java.util.Scanner;


public class POO_08 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena cadena = new Cadena();
//        System.out.println(cadena.getLongitudFrase());
        System.out.println("Ingrese la palabra o frase");
        cadena.setFrase(entry.next());
        
//        cadena.mostrarVocales();
//        
//        cadena.invertirFrase();
        
        System.out.println(cadena.contiene("a"));
    }

}

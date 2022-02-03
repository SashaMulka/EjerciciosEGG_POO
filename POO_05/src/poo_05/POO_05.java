

package poo_05;

import java.util.Locale;
import java.util.Scanner;


public class POO_05 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);                    
        
        Cuenta cuenta = new Cuenta();
        
        cuenta.crearCuenta();
        
        System.out.println("---Extraccion---");
        System.out.println("Ingrese la cantidad a extraer");
        cuenta.retirar(entry.nextDouble());
        System.out.println("");
        System.out.println("---Deposito---");
        System.out.println("Ingrese la cantidad a depositar");
        cuenta.ingresar(500);
        System.out.println("");
        
        cuenta.consultarSaldo();
        
        cuenta.extraccionRapida();
        
        cuenta.consultarDatos();
        
    }

}

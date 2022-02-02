

package poo_03;

import java.util.Locale;
import java.util.Scanner;


public class POO_03 {

  
    public static void main(String[] args) {
        
        Operacion operacion = new Operacion();
        
        operacion.crearOperacion();
        
        System.out.println("---Suma---");
        System.out.println(operacion.sumar());
        System.out.println("---Resta---");
        System.out.println(operacion.restar());
        System.out.println("---Multiplicacion---");
        System.out.printf("%.2f\n", operacion.multiplicar());      
        if (operacion.multiplicar()==0) {
            System.out.println("Error: multiplicacion por 0");
        }
        System.out.println("---Divicion---");
        System.out.printf("%.2f\n", operacion.dividir());
        if (operacion.dividir()==0) {
            System.out.println("Error: multiplicacion por 0");
        }        
    }
}

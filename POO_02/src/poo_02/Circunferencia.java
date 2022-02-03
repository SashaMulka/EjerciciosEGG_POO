/*

 */
package poo_02;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {
    
            private double radio;
            
            public Circunferencia (double radio) {
    this.radio=radio;
}
            public double getRadio (){
                return radio;
            }
            
            public void setRadio (double radio) {
                this.radio=radio;
            }
            
            public void crearCircunferencia () {
                Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
                System.out.println("Ingrese el radio del la circunferencia");
                this.radio = entry.nextInt();
            }
            
            public double area() {
                return Math.PI * Math.pow(radio, 2);
            }
            
            public double perimetro() {
                return 2 * Math.PI * radio;
            }
}

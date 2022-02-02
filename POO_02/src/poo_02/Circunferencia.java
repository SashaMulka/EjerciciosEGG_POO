/*

 */
package poo_02;

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
                //???
            }
            
            public double area() {
                return Math.PI * Math.pow(radio, 2);
            }
            
            public double perimetro() {
                return 2 * Math.PI * radio;
            }
}

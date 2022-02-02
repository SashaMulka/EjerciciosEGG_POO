

package poo_04;


public class POO_04 {

  
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        
        rectangulo.crearRectangulo();
        
        rectangulo.dibujar();
        System.out.println("");
        System.out.println("Superficie: " + rectangulo.superficie());
        System.out.println("Perimetro: " + rectangulo.perimetro());
    }

}

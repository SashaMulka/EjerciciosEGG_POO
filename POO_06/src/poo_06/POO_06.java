

package poo_06;


public class POO_06 {

  
    public static void main(String[] args) {
        
        Cafetera cafetera = new Cafetera(1500, 0);
        cafetera.llenarCafetera();
        System.out.println(cafetera.getCantidadActual());
        cafetera.servirTaza(750);
        System.out.println(cafetera.getCantidadActual());
        System.out.println("Servir 800");
        cafetera.servirTaza(800);
        cafetera.agregarCafe(1600);
        cafetera.vaciarCafetera();
        System.out.println("Se vacio la cafetera");
        cafetera.agregarCafe(1400);
        System.out.println(cafetera.getCantidadActual());
    }

}

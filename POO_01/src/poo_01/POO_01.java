

package poo_01;


public class POO_01 {

  
    public static void main(String[] args) {
    
    Libro libro1 = new Libro(12345, "El pescador", "Julio Pastor", 40);
    
        System.out.println("ISBN: " + libro1.getIsbn()); 
        System.out.println("Nombre: " + libro1.getTitulo());
        
        libro1.setAutor("Carla Lineo");
        
        System.out.println("Autor: " + libro1.getAutor());
        
    }

}

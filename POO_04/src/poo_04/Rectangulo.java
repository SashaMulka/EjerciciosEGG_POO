/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package poo_04;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo () {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Decida el ancho del rectangulo");
        this.base=entry.nextInt();
        System.out.println("Decida la altura del rectangulo");
        this.altura=entry.nextInt();
    }
    
    public int superficie(){
        return base * altura;
    }
    
    public int perimetro (){
        return (base * altura) * 2;
    }
    
    public void dibujar() {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i==0||j==0||i==base-1||j==altura-1){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }System.out.println("");
        }
    }
}

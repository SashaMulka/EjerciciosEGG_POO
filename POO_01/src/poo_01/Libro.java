/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package poo_01;

import java.util.Locale;
import java.util.Scanner;


public class Libro {
    
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro (int isbn, String titulo, String autor, int paginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;            
    }
    
    public Libro () {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void registrarLibro() {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("---Registrar libro---");
        System.out.println("Nombre:");
        this.titulo = entry.next();
        System.out.println("Autor:");
        this.autor = entry.next();
        System.out.println("Numero de paginas:");
        this.paginas = entry.nextInt();
        System.out.println("ISBN:");
        this.isbn = entry.nextInt();        
    }
    
    public void datosLibro() {
        System.out.println("---Datos del libro---");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("ISBN: " + this.isbn);
    }
}

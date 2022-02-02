/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package poo_12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Persona {
    Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private String nombre;
    private Date fechaNacimiento = new Date();
    private int edad;

    public Persona(String nombre, Date fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void crearPersona() {
       
        System.out.println("Nombre de la persona:");
        this.nombre = entry.next();
        System.out.println("Fecha de nacimiento");
        System.out.println("Año:");
        this.fechaNacimiento.setYear(entry.nextInt()-1900);       
        System.out.println("Mes:");
        this.fechaNacimiento.setMonth(entry.nextInt());
        System.out.println("Dia:");
        this.fechaNacimiento.setDate(entry.nextInt());        
    }
    
    public void calcularEdad() {
        Date fechaActual = new Date();       
        this.edad = fechaActual.getYear() - (fechaNacimiento.getYear());
        System.out.println(this.nombre + " tiene " + this.edad + " años");
    }
    
    public boolean menorQue(int edad){
        return this.edad < edad;
    }
    
    public void mostrarPersona() {
        System.out.println(this.nombre);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento.getDate() + "/" + this.fechaNacimiento.getMonth() + "/" + (this.fechaNacimiento.getYear() + 1900));
    }
}

//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
//la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
//pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
//fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
//Si necesiten acá tienen más información en clase Date: Documentacion Oracle

package poo_11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class POO_11 {

  
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        int año;
        int mes;
        int dia;
        int diferenciaAños;
        Date fechaActual = new Date();
        
        
        
        System.out.println("Ingrese un año");
        año = entry.nextInt();       
        System.out.println("Ingrese el mes");
        mes = entry.nextInt();
        System.out.println("Ingrese el dia");
        dia = entry.nextInt();
        Date fecha = new Date(año, mes, dia);
        System.out.println("Fecha ingresada: " + fecha.getDate() + "/" + fecha.getMonth() + "/" + fecha.getYear());
              
        diferenciaAños = Math.abs(fechaActual.getYear() - (fecha.getYear() - 1900)); //el calculo tiene en cuenta el dia y mes
        System.out.println("Entre la fecha ingresada y la fecha actual hay " + diferenciaAños + " años");
        
        
    }

}

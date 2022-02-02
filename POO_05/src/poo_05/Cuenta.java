/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package poo_05;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldo;

    public Cuenta(int numeroCuenta, long dni, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void crearCuenta(){
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el numero de cuenta");
        this.numeroCuenta=entry.nextInt();
        System.out.println("Ingrese el DNI de la cuenta");
        this.dni=entry.nextLong();
        System.out.println("Declare el saldo");
        this.saldo=entry.nextDouble();
    }
    
    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }
    
    public void retirar(double retiro){
        this.saldo -= retiro;
        if (this.saldo < 0)
            this.saldo = 0;
    }
    
    public void extraccionRapida(){
        Scanner entry = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Que cantidad desea extraer?");
      
        double pedido = entry.nextDouble();
        
        while(pedido > this.saldo * 0.2) {
            System.out.println("Solo puede retirar hasta el 20% (" + (this.saldo * 0.2) + ") de su saldo" );
            System.out.println("Que cantidad desea extraer?");
            pedido = entry.nextDouble();
        }
            saldo -= pedido;  
    }
    
    public void consultarSaldo () {
        System.out.println("El saldo de la cuenta es: $" + saldo);
    }
    
    public void consultarDatos() {
        System.out.println("DATOS DE LA CUENTA");
        System.out.println("N°: " + this.numeroCuenta);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: $" + this.saldo);
    }
}

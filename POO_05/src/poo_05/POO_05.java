

package poo_05;


public class POO_05 {

  
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();
        
        cuenta.crearCuenta();
        
        cuenta.retirar(500);
        
        cuenta.ingresar(500);
        
        cuenta.consultarSaldo();
        
        cuenta.extraccionRapida();
        
        cuenta.consultarDatos();
        
    }

}

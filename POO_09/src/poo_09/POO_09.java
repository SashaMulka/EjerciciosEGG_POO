

package poo_09;


public class POO_09 {

  
    public static void main(String[] args) {
        Matematica matematica = new Matematica();
        matematica.setNum1((double)Math.round(((Math.random() * -21)+10) * 100) / 100);
        matematica.setNum2((double)Math.round(((Math.random() * -21)+10) * 100) / 100);
        
        System.out.println("1° Número: " + matematica.getNum1());
        System.out.println("2° Número: " + matematica.getNum2());
        
        System.out.println("El mayor es: " + matematica.devolverMayor());
        System.out.println("El mayor redondeado potenciado al menor redondeado dá: " + matematica.calcularPotencia());
        System.out.println("La raiz cuadrada del valor absoluto del número menor es: " + matematica.calculaRaiz());
    }

}

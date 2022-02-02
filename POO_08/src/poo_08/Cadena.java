/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y
 */
package poo_08;


public class Cadena {
    private String frase;
    private int longitudFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitudFrase = frase.length();
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setLongitudFrase(int longitudFrase) {
        this.longitudFrase = longitudFrase;
    }
    
    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < this.longitudFrase; i++) {
            if (this.frase.toLowerCase().charAt(i)=='a'||this.frase.toLowerCase().charAt(i)=='e'||this.frase.toLowerCase().charAt(i)=='i'||this.frase.toLowerCase().charAt(i)=='o'||this.frase.toLowerCase().charAt(i)=='u') {
                contador ++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales");
    }
    
    public void invertirFrase() {
        String fraseAlReves = "";
        for (int i = this.longitudFrase-1; i >= 0; i--) {
            fraseAlReves += this.frase.charAt(i);
        }
        System.out.println(fraseAlReves);
    }
    
    public void vecesRepetido(String letra){
        int contador = 0; 
        for (int i = 0; i < this.longitudFrase; i++) {
            if (letra == frase.substring(i, i+1)){
                contador ++;
            }                
        }
        System.out.println("El caracter " + letra + " se repite " + contador + " veces");
    }
    
    public void compararLongitud(String frase){
        if (frase.length() > this.longitudFrase) {
            System.out.println("La frase <<" + frase + ">> es mas larga");
        } else if (frase.length() < this.longitudFrase) {
            System.out.println("La frase <<" + frase + ">> es mas corta");
        } else {
            System.out.println("La frase <<" + frase + ">> tiene la misma longitud");
        }
    }
    
   public void unirFrases(String frase){
       this.frase += frase;
       this.longitudFrase = this.frase.length();
       System.out.println(this.frase);
   }
   
   public void reemplazar(String letra){
       
       
       System.out.println(this.frase.replace('a', letra.charAt(0)));
   }
   
   public boolean contiene(String letra){
       return this.frase.contains(letra);
   }
}

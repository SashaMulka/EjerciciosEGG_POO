

package poo_07;


public class POO_07 {
   
  
    public static void main(String[] args) {
    
//        int totalBP = 0;
//        int totalPI = 0;
//        int totalSP = 0;
//        int totalMayores = 0;
//        int totalMenores = 0;
        double[] registroIMCs = new double [3];
        double [] registroME = new double [2];
  
        Persona persona1 = new Persona("Alejandro", 22, "H", 62, 1.83);
        Persona persona2 = new Persona("Carla", 25, "M", 60, 1.70);
        Persona persona3 = new Persona("Xavi", 16, "O", 45, 1.65);
        Persona persona4 = new Persona("Tomas", 40, "H", 96, 1.79);
                
        System.out.println(persona1.getNombre());
        ejecutarIMC(persona1, registroIMCs);
        mayoriaDeEdad(persona1, registroME);
        System.out.println("");
        
        System.out.println(persona2.getNombre());
        ejecutarIMC(persona2, registroIMCs);
        mayoriaDeEdad(persona2, registroME);
        System.out.println("");
        
        System.out.println(persona3.getNombre());
        ejecutarIMC(persona3, registroIMCs);
        mayoriaDeEdad(persona3, registroME);
        System.out.println("");
        
        System.out.println(persona4.getNombre());
        ejecutarIMC(persona4, registroIMCs);
        mayoriaDeEdad(persona4, registroME);
        System.out.println("");
        
        poblacionIMC(registroIMCs);
        poblacionEdad(registroME);
        
//        Persona persona5 = new Persona();
//        persona5.crearPersona();
    }
    
    public static void ejecutarIMC(Persona persona, double[] registroIMCs) {
        switch (persona.calcularIMC()) {
            case 1:
                System.out.println("La persona tiene sobrepeso");
                registroIMCs[0] ++;
                break;
            case 0:
                System.out.println("La persona se encuentra dentro de su peso ideal");
                registroIMCs[1] ++;
                break;
            case -1:
                System.out.println("La persona tiene bajopeso");
                registroIMCs[2] ++;
                break;
        }
    }
    
    public static void mayoriaDeEdad(Persona persona, double[] registroME) {
        if (persona.esMayor()){
            System.out.println("La persona es mayor de edad");
            registroME[0] ++;
        } else {
            System.out.println("La persona es menor de edad");
            registroME[1] ++;
        }
    }
    
    public static void poblacionIMC (double[] registroIMCs) {
        double poblacion = registroIMCs[0] + registroIMCs[1] + registroIMCs[2];
        System.out.printf("Personas con sobrepeso: %.2f%s\n", (registroIMCs[0] * 100 / poblacion),"%");
        System.out.printf("Personas con peso ideal: %.2f%s\n", (registroIMCs[1] * 100 / poblacion),"%");
        System.out.printf("Personas con bajopeso: %.2f%s\n",(registroIMCs[2] * 100 / poblacion),"%");
        System.out.println("");
    }
    
    public static void poblacionEdad (double[] registroME) {
        double poblacion = registroME[0] + registroME[1];
        System.out.printf("Personas mayores de edad: %.2f%s\n",(registroME[0] * 100 / poblacion),"%");
        System.out.printf("Personas menores de edad: %.2f%s\n",(registroME[1] * 100 / poblacion),"%");
        System.out.println("");
    }
}

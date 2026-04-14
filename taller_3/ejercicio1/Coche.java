package ejercicio1;

public class Coche {
    String marca;
    String modelo;
    static int contadorChoches = 0;
    
    public Coche() {   //contador
        contadorChoches++;
    }

    public static void mostarContador(){
        System.out.println("Contador de coches: " + contadorChoches);
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        Coche.mostarContador();
    }
    
}

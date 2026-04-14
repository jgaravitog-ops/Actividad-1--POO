package ejercicio3;

public class Casa {

    String color = "azul";

    public void mostarCasa(){     //la solucion podria ser quitar static del metodo
        System.out.println(this.color); 
    }

    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.mostarCasa();
    }
}


package ejercicio3;

public class Ejemplo {
    static int numero = 1;     //atributo ahora es estatico

    public static void cambiarNumero(){
        numero = 5;     //no se produce el error
    }
    public static void main(String[] args) {
        Ejemplo.cambiarNumero();
    }
}


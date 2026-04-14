package ejercicio2;

public class Matematicas {
    // suma
    public static int suma(int a, int b) {
        return a + b;
    }
    // resta
    public static int resta(int a, int b) {
        return a - b;
    }
    //multiplicacion
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    // division
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        return a / b;
    }
}
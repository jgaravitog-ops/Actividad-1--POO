package ejercicio2;

public class Estudiante {
    String nombre;
    int edad;
    public Estudiante() {
        this("Desconocido", 0);
    }
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostarProducto() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}
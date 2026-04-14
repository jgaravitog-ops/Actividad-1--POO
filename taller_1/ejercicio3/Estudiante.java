package ejercicio3;

public class Estudiante {
    //atributos
    String nombre;
    int edad;
    int curso;

    //constructores
    public Estudiante() {
        nombre = "Desconocido";
        edad = 0;
        curso = 0;
    }
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Estudiante(String nombre, int edad, int curso) {
        this(nombre, edad);
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
    } 
}
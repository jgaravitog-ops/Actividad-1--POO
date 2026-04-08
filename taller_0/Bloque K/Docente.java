/*
    Ejercicio 61.
    La clase docente tendra 3 atributos: nombre de tipo String, asignatura de tipo String y horioClase de tipo String.
    tendra 2 metodos: asignarHorario(String) y mostrarDocente()
    Se crearan 2 objetos reales: 
    nombre = Nora, asignatura = Ingles, horarioClase = Lunes
    nombre = Mateo, asignatura = Matematicas, horarioClase = Jueves
*/
public class Docente {
    String nombre;
    String asignatura;
    String horarioClase;
    public Docente(String nombre, String asignatura, String horarioClase) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.horarioClase = horarioClase;
    }
    void asignarHorario(String horarioClase){
        this.horarioClase = horarioClase;
    }
    void mostrarDocente(){
        System.out.println("Docente: "+nombre);
        System.out.println("Asignatura: "+ asignatura);
        System.out.println("Horario de clase: "+ horarioClase);
    }

    public static void main(String[] args) {
        Docente docente1 = new Docente("Nora", "Ingles", "Lunes");
        Docente docente2 = new Docente("Mateo", "Matematicas", "Jueves");
        
        docente1.asignarHorario("Lunes y Miercoles");
        
        docente1.mostrarDocente();
        System.out.println("----------");
        docente2.mostrarDocente();
    }
    
}
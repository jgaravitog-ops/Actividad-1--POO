/*
    Ejercicio 72 reescrito con metodo fabrica.
*/
class Estudiante {
    String nombre;
    String codigo;
    int semestre;
    
    Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }
    static Estudiante crearEstudiante(String nombre, String codigo, int semestre){
        return new Estudiante(nombre, codigo, semestre);
    }
    void mostrarInf(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Semestre: "+semestre);
    }
    public static void main(String[] args) {
        Estudiante estudiante1 = Estudiante.crearEstudiante("Yasuri", "1318", 6);
    }
}
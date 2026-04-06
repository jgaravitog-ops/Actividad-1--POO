/*
    Los 2 objetos (curos1 y curso2) pertenencen a la misma clase Curso
    porque fueron creados a partir de la misma plantilla, por lo que comparten
    la misma estructura y los mismos metodos. Pero, sus datos son distintos porque
    cada objeto tiene valores propios en sus atributos, permitiendo representar cursos
    diferentes aunque sigan el mismo modelo definido por la clase.
*/

class Curso {
    String nombre;
    int duracion;
    String instructor;

    Curso(String nombre, int duracion, String instructor){
        this.nombre = nombre;
        this.duracion = duracion;
        this.instructor = instructor;
    }

    void mostrarCurso(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracion + " horas");
        System.out.println("Instructor: " + instructor);
    }

    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", 40, "Carlos");
        Curso curso2 = new Curso("Diseño Web", 30, "Ana");

        curso1.mostrarCurso();
        System.out.println("------------");
        curso2.mostrarCurso();
    }
}
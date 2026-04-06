/*
"Estudiantes" es una clase porque es el modelo o la plantilla con la que se crearan objetos.
Esta define que atributos (nombre,codigo,semestre) y que comportamiento (mostrarInf()) tendran los objetos,
por lo que es algo que no es real, solo describe como seran los objetos.
Por otro lado, "estudiante1" es un odjeto porque este fue instanciado a partir de la clase "Estudiante", teniendo asi
los atributos (nombre,codigo,semestre), este es diferente a la clase porque si es real, 
ademas ocupa espacio en memoria. es una copia creada a partir de un molde que tiene sus propios datos.
*/
class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    void mostrarInf(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Semestre: "+semestre);
    }
        public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan";
        estudiante1.codigo = "123123";
        estudiante1.semestre = 2;
        estudiante1.mostrarInf();
    }
}

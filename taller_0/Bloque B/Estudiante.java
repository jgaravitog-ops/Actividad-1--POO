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

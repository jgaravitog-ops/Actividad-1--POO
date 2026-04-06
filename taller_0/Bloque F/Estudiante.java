
class Estudiante {
    String nombre;
    String codigo;
    int semestre;

    //contructor vacio
    Estudiante(){}

    //constructor con nombre y codigo
    Estudiante(String nombre,String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //Constructor con nombre, codigo y semestre
    Estudiante(String nombre,String codigo,int semestre){
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }

    void mostrarInf(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Semestre: "+semestre);
    }
        public static void main(String[] args) {
        //Contructor vacio
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Juan";
        estudiante1.codigo = "123123";
        estudiante1.semestre = 2;
        estudiante1.mostrarInf();
        System.out.println("-----------");
        //constructor con nombre y codigo
        Estudiante estudiante2 = new Estudiante("Maria","321456");
        estudiante2.mostrarInf();
        System.out.println("-----------");
        //Constructor con nombre, codigo y semestre
        Estudiante estudiante3 = new Estudiante("Paula", "231564", 3);
        estudiante3.mostrarInf();
    }
}

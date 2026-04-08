public class Actividad {
    String asignatura;
    String unidad;
    double nota;
    public Actividad(String asignatura, String unidad) {
        this.asignatura = asignatura;
        this.unidad = unidad;
        nota = 0;
    }
    void calificar(double nota){
        this.nota = nota;
    }
    void mostrarNota(){
        System.out.println("Asignatura: "+asignatura);
        System.out.println("Unidad: "+unidad);
        System.out.println("Nota: "+nota);
    }

    public static void main(String[] args) {
        Actividad act1 = new Actividad("Programacion", "1");
        Actividad act2 = new Actividad("Programacion", "2");
        Actividad act3 = new Actividad("Programacion", "3");
        Actividad act4 = new Actividad("Programacion", "4");
        
        act1.calificar(3);
        act2.calificar(4);
        act3.calificar(3.4);
        act4.calificar(4.1);

        act1.mostrarNota();
        act2.mostrarNota();
        act3.mostrarNota();
        act4.mostrarNota();

        System.out.println("----------");
        System.out.println("Promedio: "+(act1.nota+act2.nota+act3.nota+act4.nota)/4);

    }
}

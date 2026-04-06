/*
    Crear un paciente e instanciar la clase Paciente se relacionan porque en ambos implica obtener un objeto
    que representa una persona en el sistema.Pero no son exactamente lo mismo, instanciar es la accion concreta 
    de tomar un clase y utilizarla para crear el objeto mediante la palabra clave new y un constructor, mientras que crear es el proceso completo
    de generar el objeto y darle valores, se pueden crear objetos sin necesidad de usar la palabra clave new directamente. 
*/
class Paciente {
    String nombre;
    int edad;
    String diagnostico;

    Paciente(String nombre, int edad, String diagnostico){
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    void mostrarPaciente(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Diagnóstico: " + diagnostico);
    }

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Juan", 25, "Gripe");
        Paciente paciente2 = new Paciente("Ana", 30, "Migraña");

        paciente1.mostrarPaciente();
        System.out.println("------------");
        paciente2.mostrarPaciente();
    }
}
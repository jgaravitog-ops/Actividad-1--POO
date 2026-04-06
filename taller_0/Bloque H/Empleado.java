/*
Al modelar Empleado con clases y objetos antes que con variables sueltas nos permite agrupar
en una sola estructura los datos y manejar multiples empleado de forma ordenada mediante objetos.
Esto nos dacilita la organizacion del codigo y permite reutilizar la misma plantilla para representar
diferentes empleado con sus propios valores.
*/
class Empleado {
    String nombre;
    String cargo;
    double salario;

    Empleado(String nombre, String cargo, double salario){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    void mostrarEmpleado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Desarrollador", 2500);
        Empleado empleado2 = new Empleado("Ana", "Diseñadora", 2200);

        empleado1.mostrarEmpleado();
        System.out.println("------------");
        empleado2.mostrarEmpleado();
    }
}
/*Ejercicio.63
Clase Hospital
Atributos: String nombre, String nivel, String ubicacion, int capacidad.
Métodos: aumentarCapacidad() disminuirCapacidad()  mostarDatos()
objetos: 
nombre = 	Hospital de Nazareth, nivel = 1, ubicacion = Bogotá, capacidad = 32
nombre = 	Hospital Mario Correa Rengifo, nivel = 2, ubicacion = Cali, capacidad = 64
nombre = 	Hospital Universitario San Rafael, nivel = 3, ubicacion = Tunja, capacidad = 128
*/
public class Hospital {
    String nombre;
    String nivel;
    String ubicacion;
    int capacidad;
    public Hospital(String nombre, String nivel, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
    }
    void aumentarCapacidad(){
        capacidad += 1;
    }
    void disminuirCapacidad(){
        if (capacidad>0) {
            capacidad -= 1;
        }
    }
    void mostarDatos(){
        System.out.println("Nombre :"+nombre);
        System.out.println("Nivel: "+nivel);
        System.out.println("Ubicación: "+ubicacion);
        System.out.println("Capacidad: "+capacidad);
    }
    public static void main(String[] args) {
        Hospital hosp1 = new Hospital("Hospital de Nazareth", "1", "Bogotá", 32);
        Hospital hosp2 = new Hospital("Hospital Mario Correa Rengifo", "2", "Cali", 64);
        Hospital hosp3 = new Hospital("Hospital Universitario San Rafael", "3", "Tunja", 128);

        hosp1.mostarDatos();
        System.out.println("..........");
        hosp2.mostarDatos();
        System.out.println("..........");
        hosp3.mostarDatos();
    }
    
}
class Mascota {
    String nombre;
    String especie;
    int edad;

    void mostrarMascota(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("edad: "+edad+ " años");
    }

    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();

        mascota1.nombre = "Firulais";
        mascota1.especie = "Perro";
        mascota1.edad = 5;
        
        mascota1.mostrarMascota();
        mascota1.edad = 7;
        System.out.println("--Cambio edad--");
        mascota1.mostrarMascota();
    }
    
}
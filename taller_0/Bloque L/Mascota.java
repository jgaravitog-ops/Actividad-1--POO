class Mascota {
    String nombre;
    String especie;
    int edad;
    

    Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    Mascota(Mascota copia){       //copia
        this.nombre = copia.nombre;
        this.especie = copia.especie;
        this.edad = copia.edad;
    }

    void mostrarMascota(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Especie: "+especie);
        System.out.println("edad: "+edad);
    }
    
}
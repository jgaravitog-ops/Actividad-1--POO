class Cancion {
    String titulo;
    String artista;
    double duracion;

    Cancion(String titulo,String artista,double duracion){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    void mostrarInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Duracion: "+duracion+ " segundos");
    }
}
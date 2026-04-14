package ejercicio1;

public class Libro {
    //atributos
    String titulo;
    String autor;
    int numeroPaginas;
    
    //constructores
    public Libro() {
        titulo = "Desconocido";
        autor = "Desconocido";
        numeroPaginas = 0;
    }
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    //metodos
    public void mostrarAutor() {
        System.out.println(autor);
    }
    public void mostrarTitulo(){
        System.out.println(titulo);
    }
    public void mostrarPaginas() {
        System.out.println(numeroPaginas);
    }
    public void mostrarLibro(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Numero paginas: "+numeroPaginas);
    }
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
    }

}
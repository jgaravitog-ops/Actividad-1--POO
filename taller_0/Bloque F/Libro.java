class Libro { 
    String titulo; 
    String autor; 
    int paginas; 

    Libro(String titulo,String autor,int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    Libro(Libro otroLibro){
        this.autor = otroLibro.autor;
        this.titulo = otroLibro.titulo;
        this.paginas = otroLibro.paginas;
    }

    void mostrarLibro(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Paginas: "+paginas+" Paginas");
    }

    public static void main(String[] args) { 
        //libro original
        Libro original = new Libro("1984","George Orwell", 349);
        //Libro copia
        Libro copia = new Libro(original);

        original.mostrarLibro();
        System.out.println("----------");
        copia.mostrarLibro();
    } 
} 
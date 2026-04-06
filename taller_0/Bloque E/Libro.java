class Libro { 
    String titulo; 
    String autor; 
    int paginas; 

    //Constructor vacio
    Libro(){
    }
    //contructor con parametros
    Libro(String titulo,String autor,int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void mostrarLibro(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Paginas: "+paginas+" Paginas");
    }
    class Main { 
        public static void main(String[] args) { 
        //Objeto creado con el constructor vacio
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad"; 
        libro1.autor = "Gabrial Garcia Marquez"; 
        libro1.paginas = 496; 

        //objeto creado con el constructor con parametros
        Libro libro2 = new Libro("1984","George Orwell", 349);

        libro1.mostrarLibro();
        System.out.println("----------");
        libro2.mostrarLibro();
        } 
    }
} 
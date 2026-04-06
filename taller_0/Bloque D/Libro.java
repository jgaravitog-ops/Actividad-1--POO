class Libro { 
    String titulo; 
    String autor; 
    int paginas; 
 
    class Main { 
        public static void main(String[] args) { 
        Libro libro1 = new Libro(); 
        Libro libro2 = new Libro(); 
        Libro libro3 = new Libro(); 
        Libro libro4 = new Libro(); 

        libro1.titulo = "Cien años de soledad"; 
        libro1.autor = "Gabrial Garcia Marquez"; 
        libro1.paginas = 496; 
        
        libro2.titulo = "1984"; 
        libro2.autor = "George Orwell"; 
        libro2.paginas = 349;

        libro3.titulo = "El principito"; 
        libro3.autor = "Antoine de Saint-Exupéry"; 
        libro3.paginas = 120;

        libro4.titulo = "Don Quijote de la Mancha"; 
        libro4.autor = "Miguel de Cervantes"; 
        libro4.paginas = 1100;

        } 
    }
} 
/*
La clase Libro funciona como una plantilla porque define las características comunes (titulo, autor y páginas) 
que tendran todos los libros. A partir de esa plantilla se crean los objetos (libro1, libro2, libro3, libro 4),
que son casos concretos porque cada uno tiene valores propios y representa un libro específico, 
aunque todos comparten la misma estructura.
*/
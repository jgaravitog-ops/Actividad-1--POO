/*
    La clase biblioteca tendra los atributos: titulo de tipo String, autor de tipo String, paginas de tipo String, disponible tipo boolean;
    Tendrá los métodos: disponibilidad(), mostarLibro();
    se construiran los siguientes objetos reales:
    titulo = Los Miserables, autor = Victor Hugo, paginas = 1488, disponible = true;
    titulo = Orgullo y prejuicio, autor = Jane Austen, paginas = 400, disponible = true;
    titulo = Crimen y castigo, autor = Fiódor Dostoievski, paginas = 650, disponible = true;
*/
public class Biblioteca {
    String titulo;
    String autor;
    String paginas;
    boolean disponible;
    public Biblioteca(String titulo, String autor, String paginas, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.disponible = disponible;
    }
    void disponibilidad(boolean disponible){
        this.disponible = disponible;
    }
    void mostarLibro(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Paginas: "+paginas);
        System.out.print("Disponibilidad: ");
        if (disponible==true) {
            System.out.println("Disponible");
        } else{
            System.out.println("No disponible");
        }
    }
    public static void main(String[] args) {
        Biblioteca libro1 = new Biblioteca("Los Miserables", "Victor Hugo", "1488", true);
        Biblioteca libro2 = new Biblioteca("Orgullo y prejuicio", "Jane Austen", "400", true);
        Biblioteca libro3 = new Biblioteca("Crimen y castigo", "Fiódor Dostoievski", "650", true);

        libro1.disponibilidad(false);
        libro2.disponibilidad(true);

        libro1.mostarLibro();
        System.out.println("----------");
        libro2.mostarLibro();
        System.out.println("----------");
        libro3.mostarLibro();

    }
}
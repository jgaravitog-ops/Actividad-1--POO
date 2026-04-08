/*Ejercicio.65
    Atributos: String nombre, String ciudad, int categoria, int titulos;
    Métodos: subirCategoria() bajarCategoria() aumentarTitulo() mostrarEquipo()
    objetos
    nombre = Real Madrid, ciudad = Madrid, categoria = 1, titulos = 35;
 */
public class EquipoDeFutbol {
    String nombre;
    String ciudad;
    int categoria;
    int titulos;
    public EquipoDeFutbol(String nombre, String ciudad, int categoria, int titulos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.categoria = categoria;
        this.titulos = titulos;
    }
    void subirCategoria(){
        if (categoria>=2) {
            categoria-=1;
        }
    }
    void bajarCategoria(){
        categoria+=1;
    }
    void aumentarTitulo(){
        titulos+=1;
    }
    void mostrarEquipo(){
        System.out.println("Club: "+nombre);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Categoria: "+categoria);
        System.out.println("Titulos: "+titulos);
    }


    
    public static void main(String[] args) {
        EquipoDeFutbol equipo1 = new EquipoDeFutbol("Real Madrid", "Madrid", 1, 35);

        equipo1.mostrarEquipo();
        System.out.println("..........");
        equipo1.bajarCategoria();
        equipo1.mostrarEquipo();
        System.out.println("..........");
        equipo1.subirCategoria();
        equipo1.aumentarTitulo();
        equipo1.mostrarEquipo();

    }
    
}
/*Ejercicio 64
    Clase: Tienda
    Atributos: String nombre, String tipoProducto, boolean abierto;
    Métodos: abrir() cerrar() mostarTienda()
    objetos: 
    nombre = Despertar Infinito, tipoProducto = Alimentos y Bebidas, boolean = true
    nombre = Nube Ergonómica, 	tipoProducto = Muebles, boolean = true;
    nombre = Silencio Total X1, tipoProducto = Tecnología, boolean = false;
 */
public class Tienda {
    String nombre;
    String tipoProducto;
    boolean abierto;

    public Tienda(String nombre, String tipoProducto, boolean abierto) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.abierto = abierto;
    }
    void abrir(){
        abierto = true;
    }
    void cerrar(){
        abierto = false;
    }
    void mostarTienda(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Categoria: "+tipoProducto);
        if (abierto==true) {
            System.out.println("Abierto");
        }else{
            System.out.println("Cerrado");
        }
    }
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda("Despertar Infinito", "Alimentos y Bebidas", true);
        Tienda tienda2 = new Tienda("Nube Ergonómica", "Muebles", true);
        Tienda tienda3 = new Tienda("Silencio Total X1", "Tecnología", false);

        tienda1.abrir();
        tienda2.cerrar();
        tienda3.abrir();

        tienda1.mostarTienda();
        System.out.println("..........");
        tienda2.mostarTienda();
        System.out.println("..........");
        tienda3.mostarTienda();
    }
    
    
}
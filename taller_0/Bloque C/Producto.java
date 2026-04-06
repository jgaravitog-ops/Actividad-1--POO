public class Producto {
    String nombre;
    String precio;
    int stock;

    void mostrarProducto(){
        System.out.println("Nombre: "+nombre);
        System.out.println("precio: "+precio);
        System.out.println("Stock: "+stock);
    }
    void vender(int cantidad){
        if (stock >= cantidad) {
            stock -= cantidad;
        }
        else {
            System.out.println("No hay stock suficiente");
        }
    }
    
    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        producto1.nombre = "Arroz";
        producto1.precio = "$15";
        producto1.stock = 58;

        producto2.nombre = "Maiz";
        producto2.precio = "$12";
        producto2.stock = 74;

        producto3.nombre = "Avena";
        producto3.precio = "$20";
        producto3.stock = 62;

        producto1.mostrarProducto();
        System.out.println("------------");
        producto2.mostrarProducto();
        System.out.println("------------");
        producto3.mostrarProducto();
    }
}
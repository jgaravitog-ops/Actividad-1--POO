class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre,double precio,int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    //método fábrica estático
    static Producto creaProductoBasico(String nombre,double precio,int stock){
        return new Producto(nombre,precio,stock);
    }


    void mostrarProducto(){
        System.out.println("Nombre: "+nombre);
        System.out.println("precio: "+precio);
        System.out.println("Stock: "+stock);
    }
    
    public static void main(String[] args) {

        Producto producto1 = Producto.creaProductoBasico("Arroz",15,58);
        
        Producto producto2 = Producto.creaProductoBasico("Maiz",12.5,73);

        producto1.mostrarProducto();
        System.out.println("------------");
        producto2.mostrarProducto();

    }
}
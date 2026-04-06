class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(){} //Constructor vacio

    Producto(String nombre,double precio,int stock){  //Constuctor con parametros
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }



    void mostrarProducto(){
        System.out.println("Nombre: "+nombre);
        System.out.println("precio: "+precio);
        System.out.println("Stock: "+stock);
    }
    
    public static void main(String[] args) {

        Producto producto1 = new Producto(); //creado con constructor vacio
        producto1.nombre = "Arroz";
        producto1.precio = 15;
        producto1.stock = 58;

        //creado con constructor con parametros
        Producto producto2 = new Producto("Maiz",12.5,74);

        producto1.mostrarProducto();
        System.out.println("------------");
        producto2.mostrarProducto();

    }
}
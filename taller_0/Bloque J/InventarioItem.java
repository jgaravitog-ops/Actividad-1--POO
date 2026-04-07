class InventarioItem {
    String nombre;
    int cantidad;
    double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    double precioInventario(){
        return precioUnitario*cantidad;
    }
    void mostrarInf(){
        System.out.println("Item: "+nombre);
        System.out.println("Stock: "+cantidad);
        System.out.println("Valor Unidad: "+precioUnitario);
    }
    public static void main(String[] args) {
        InventarioItem item1 = new InventarioItem("Ladrillos", 712, 15.2);
        item1.mostrarInf();
        System.out.println("Valor total inventario: "+item1.precioInventario());
    }
}
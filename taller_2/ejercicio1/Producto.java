public class Producto {

  String nombre;
  double precio;

  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }
  public void mostarProducto() {
    System.out.println("Nombre: "+nombre);
    System.out.println("Precion: "+precio);
  }

}

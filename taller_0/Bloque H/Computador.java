/*
    El plano conceptual del computador es la clase Computador ya que define la caracteristicas generales que los 
    computadodes creados pueden tener. En cambio una maquina concreta es el objeto (pc1 y pc2) creado a partir de esa clase,
    que representan computadores reales con valores especificos. Para resumir, El plano conceptual del computador es el modelo o diseño
    y la maquina concreta es la instancia construida a partir de ese modelo.  
*/
class Computador {
    String marca;
    String procesador;
    int ram;

    Computador(String marca, String procesador, int ram){
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    void mostrarComputador(){
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
    }

    public static void main(String[] args) {
        Computador pc1 = new Computador("HP", "Intel i5", 8);
        Computador pc2 = new Computador("Lenovo", "Ryzen 7", 16);

        pc1.mostrarComputador();
        System.out.println("------------");
        pc2.mostrarComputador();
    }
}
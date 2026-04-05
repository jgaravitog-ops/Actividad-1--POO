class Vehiculo {
    String marca;
    String modelo;
    int velocidadActual;

    void mostrarEstado(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo:"+modelo);
        System.out.println("Velocidad Actual: "+velocidadActual+ " km/h");
    }

        public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo1.marca = "Tesla";
        vehiculo1.modelo = "Model 3";
        vehiculo1.velocidadActual = 115;
        vehiculo2.marca = "Ford";
        vehiculo2.modelo = "F-150";
        vehiculo2.velocidadActual = 40;

        System.out.println("--Estado vehiculos--");
        vehiculo1.mostrarEstado();
        System.out.println("---------");
        vehiculo2.mostrarEstado();
    }
}

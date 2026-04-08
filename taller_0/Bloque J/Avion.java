class Avion {
    String aerolinea;
    String destino;
    int pasajeros;
    public Avion(String aerolinea, String destino, int pasajeros) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }
    
    void abordar(int cantidad){
        pasajeros += cantidad;
    }
    void mostrarVuelo(){
        System.out.println("Aerolinea: "+aerolinea);
        System.out.println("Destino: "+destino);
        System.out.println("Pasajeros: "+pasajeros);
    }

    public static void main(String[] args) {
        Avion vuelo1 =  new Avion("Avianca", "Bogota", 12);
        vuelo1.mostrarVuelo();
        vuelo1.abordar(3);
        vuelo1.mostrarVuelo();
    }
}
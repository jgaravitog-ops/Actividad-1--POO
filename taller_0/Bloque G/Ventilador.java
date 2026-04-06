class Ventilador {
    String marca;
    int velocidad;
    boolean encendido;

    Ventilador(String marca){
        this.marca = marca;
        velocidad = 0;
        encendido = false;
    }
    void encender(){
        if (encendido==false) {
            velocidad = 1;
            encendido = true;
        }
    }
    void apagar(){
        if (encendido==true) {
            velocidad = 0;
            encendido = false;
        }
    }
    void subirVelocidad(){
        if(velocidad<3){
            velocidad += 1;
        }
    }
    void mostarVentilador(){
        System.out.println("Marca: "+marca);
        if (encendido == true) {
            System.out.println("El ventilador esta encendido");
            System.out.println("Velocidad: " + velocidad);
        } else {
            System.out.println("El ventilador esta apagado");
        }
    }
    public static void main(String[] args) {
        Ventilador ventilador1 = new Ventilador("Philips");
        ventilador1.mostarVentilador();
        System.out.println("----------");
        ventilador1.encender();
        ventilador1.mostarVentilador();
        System.out.println("----------");
        ventilador1.subirVelocidad();
        ventilador1.mostarVentilador();
        System.out.println("----------");
        ventilador1.apagar();
        ventilador1.mostarVentilador();
    }
}
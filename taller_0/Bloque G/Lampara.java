class Lampara{
    String marca;
    boolean encendida;

    Lampara(String marca,boolean encendida){
        this.marca = marca;
        this.encendida = encendida;
    }
    void encender(){
        encendida = true;
    }
    void apagar(){
        encendida = false;
    }
    void mostarEstado(){
        if (encendida == true) {
            System.out.println("La lampara "+marca+" esta encendida");
        } else{
            System.out.println("La lampara "+marca+" esta apagada");
        }
    }
    public static void main(String[] args) {
        Lampara lampara1 = new Lampara("Philips", false);

        lampara1.mostarEstado();
        System.out.println("--------------");
        lampara1.encender();
        lampara1.mostarEstado();
        System.out.println("--------------");
        lampara1.apagar();
        lampara1.mostarEstado();
    }
}
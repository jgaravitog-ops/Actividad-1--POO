class Puerta{
    String material;
    boolean abierta;

    Puerta(String material,boolean abierta){
        this.material = material;
        this.abierta = abierta;
    }
    void abrir(){
        abierta = true;
    }
    void cerrar(){
        abierta = false;
    }
    void mostarEstado(){
        if (abierta == true) {
            System.out.println("La puerta de "+material+" esta abierta");
        } else{
            System.out.println("La puerta "+material+" esta cerrada");
        }
    }
    public static void main(String[] args) {
        Puerta puerta1 = new Puerta("Madera", false);

        puerta1.mostarEstado();
        System.out.println("--------------");
        puerta1.abrir();
        puerta1.mostarEstado();
        System.out.println("--------------");
        puerta1.cerrar();
        puerta1.mostarEstado();
    }
}
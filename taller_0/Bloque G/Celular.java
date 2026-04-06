class Celular {
    String marca;
    int bateria;
    boolean prendido;

    Celular(String marca,int bateria,boolean prendido){
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = prendido;
    }

    void encender(){
        prendido = true;
    }
    void apagado(){
        prendido = false;
    }
    void cargarBateria(){
        if(bateria<100){
            bateria +=1;
        }
        else {
            System.out.println("Bateria completamente cargada");
        }
    } 
}
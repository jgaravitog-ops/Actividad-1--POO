class Reloj{
    int hora;
    int minuto;
    int segundo;
    
    Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    void mostrarHora(){
        System.out.println("La hora es: "+hora+":"+minuto+":"+segundo);
    }

    public static void main(String[] args) {
        Reloj reloj1 = new Reloj(11, 32, 56);
        reloj1.mostrarHora();
    }
}
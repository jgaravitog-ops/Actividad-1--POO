class Reserva{
    String nombreCliente;
    String fecha;
    boolean activa;

    Reserva(String nombreCliente,String fecha){
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
    }
    void confirmar(){
        activa = true;
        System.out.println("LA reserva a sido confirmada");
    }
    void cancelar(){
        activa = false;
        System.out.println("La reserva a sido cancelada");
    }

    public static void main(String[] args) {
        Reserva reserva1 = new Reserva("Anita","31 Febrero 2026");
        reserva1.confirmar();
    }
}
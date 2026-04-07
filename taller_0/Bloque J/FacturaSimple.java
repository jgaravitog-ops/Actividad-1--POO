class FacturaSimple{
    String numero;
    String cliente;
    double valor;

    FacturaSimple(String numero,String cliente,double valor){
        this.numero = numero;
        this.valor = valor;
        this.cliente = cliente;
    }
    double descuento(){
        return (valor*10)/100;
    }

    void mostrarFactura(){
        System.out.println("Numero: "+numero);
        System.out.println("Cliente: "+cliente);
        System.out.println("Valor: "+valor);
        System.out.println("Descuento: "+descuento());
        System.out.println("Total a pagar: "+(valor-descuento()));
    }

    public static void main(String[] args) {
        FacturaSimple cliente1 = new FacturaSimple("1234","Pedrito",1000);
        cliente1.mostrarFactura();
    }
}
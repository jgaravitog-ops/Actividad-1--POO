class CuentaBancaria {
    int numero;
    String titular;
    double saldo;

    void mostrarCuenta(){
        System.out.println("Numero: "+numero);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }
    
    public static void main(String[] args) {
        CuentaBancaria cBancaria1 = new CuentaBancaria();
        CuentaBancaria cBancaria2 = new CuentaBancaria();

        cBancaria1.numero = 123;
        cBancaria1.titular = "Pedro Gonzales";
        cBancaria1.saldo = 7769;

        cBancaria2.numero = 321;
        cBancaria2.titular = "Jose Garcia";
        cBancaria2.saldo = 5243.5;

        cBancaria1.mostrarCuenta();
        System.out.println("----------");
        cBancaria2.mostrarCuenta();
    }
}
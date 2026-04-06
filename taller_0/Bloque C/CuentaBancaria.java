class CuentaBancaria {
    int numero;
    String titular;
    double saldo;

    void mostrarCuenta(){
        System.out.println("Numero: "+numero);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }
    void consignar(double valor){
        if (valor>0) {
            saldo += valor;
            System.out.println("Se consigno al saldo el siguiente  valor: "+valor);
        }
        else{
            System.out.println("No se puede consignar saldo menor o igual que 0.");
        }
    }
    void retirar(double valor){
        if (saldo > valor && valor > 0) {
            saldo -= valor;
        }
        else {
            System.out.println("El valor ingresado no es permitido o saldo es insuficiente");
        }
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
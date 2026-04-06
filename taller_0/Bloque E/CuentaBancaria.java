class CuentaBancaria {
    String numero;
    String titular;
    double saldo;

    //constructor
    CuentaBancaria (String numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        saldo = saldoInicial;
    }   

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
        CuentaBancaria cBancaria1 = new CuentaBancaria("123","Pedro Gonzales",7769);
        CuentaBancaria cBancaria2 = new CuentaBancaria("321","Jose Garcia",5243.5);
        CuentaBancaria cBancaria3 = new CuentaBancaria("456", "Sofia Perez", 8234.9);

        cBancaria1.mostrarCuenta();
        System.out.println("----------");
        cBancaria2.mostrarCuenta();
        System.out.println("----------");
        cBancaria3.mostrarCuenta();
    }
}
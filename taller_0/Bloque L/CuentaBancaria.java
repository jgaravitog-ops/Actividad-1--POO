/*
    Ejercicio 71 - reescrito con constructor con parametros
 */
class CuentaBancaria {
    int numero;
    String titular;
    double saldo;
    
    CuentaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    void mostrarCuenta(){
        System.out.println("Numero: "+numero);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
    }
}
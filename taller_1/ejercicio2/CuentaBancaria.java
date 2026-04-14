package ejercicio2;

public class CuentaBancaria {
    //atributos
    String nombreCuenta;
    double saldo;
    String tipoCuenta;

    //constructores
    public CuentaBancaria() {
        nombreCuenta = "Desconocido";
        saldo = 0;
        tipoCuenta = "Desconocido";
    }
    public CuentaBancaria(String nombreCuenta, String tipoCuenta) {
        this.nombreCuenta = nombreCuenta;
        this.tipoCuenta = tipoCuenta;
    }
    public CuentaBancaria(String nombreCuenta, double saldo, String tipoCuenta) {
        this.nombreCuenta = nombreCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
}
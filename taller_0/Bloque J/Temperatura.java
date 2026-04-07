class Temperatura{
    double grados;

    public Temperatura(double grados) {
        this.grados = grados;
    }
    double convertirAFarenheit(){
        return (grados*9/5)+32;
    }
    void mostrarDatos(){
        System.out.println("Grados Celsius: "+ grados);
        System.out.println("Grados Farenheit: "+convertirAFarenheit());
    }
    public static void main(String[] args) {
        Temperatura temperatura1 = new Temperatura(15);
        temperatura1.mostrarDatos();
    }
}
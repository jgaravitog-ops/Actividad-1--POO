class Rectangulo {
    double base;
    double altura;

    Rectangulo (double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
        return base*altura;
    }
    double calcularPerimetro(){
        return 2*(base+altura);
    }
    void mostarResultados(){
        System.out.println("Base: "+ base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+ calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(3,5);
        rectangulo1.mostarResultados();
    }
}
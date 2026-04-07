class Semaforo {
    String color;

    Semaforo(String color){
        this.color = color;
    }

    void cambiarcolor(){
        if(color=="rojo"){
            color="verde";
        }
        else if(color=="verde"){
            color="amarillo";
        }
        else if (color=="amarillo") {
            color ="rojo";
        }
        else{System.out.println("El color no es valido");}
    }
    void mostrarColor(){
        System.out.println("El color actual es: " +color);
    }

    public static void main(String[] args) {
        Semaforo semaforo1 = new Semaforo("rojo");
        semaforo1.mostrarColor();
        
        semaforo1.cambiarcolor();
        semaforo1.mostrarColor();
        
        semaforo1.cambiarcolor();
        semaforo1.mostrarColor();

        semaforo1.cambiarcolor();
        semaforo1.mostrarColor();
    }
    
}
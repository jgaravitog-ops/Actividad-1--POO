class UsuarioSistema {
    String nombre;
    String clave;
    boolean activo;
    public UsuarioSistema(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }
    void activar(){
        activo = true;
    }
    void desactivar(){
        activo = false;
    }
    void mostrarUsuario(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Clave: "+clave);
        System.out.print("El usuario esta: ");
        if (activo==true) {
            System.out.println("Activo");
        }
        else {
            System.out.println("Desactivado");
        }
    }
    public static void main(String[] args) {
        UsuarioSistema uSistema1 = new UsuarioSistema("Marina", "123456");
        uSistema1.mostrarUsuario();
        uSistema1.activar();
        uSistema1.mostrarUsuario();
    }

    
}
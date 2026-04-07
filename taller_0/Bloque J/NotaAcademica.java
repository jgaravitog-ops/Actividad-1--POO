class NotaAcademica {
    String asignatura;
    double nota1;
    double nota2;
    double nota3;
    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    double calcularDefinitiva(){
        return (nota1+nota2+nota3)/3;
    }
    void mostrarNotas(){
        System.out.println("Asignatura: "+asignatura);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);
        System.out.println("Nota definitiva: "+calcularDefinitiva());
    }
    public static void main(String[] args) {
        NotaAcademica nAcademica1 = new NotaAcademica("Programación", 3, 3.5, 4);
        nAcademica1.mostrarNotas();
    }
}
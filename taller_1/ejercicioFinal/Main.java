package ejercicioFinal;
import ejercicio1.Libro;
import ejercicio2.CuentaBancaria;
import ejercicio3.Estudiante;

import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Clase Libro
        Libro libro1 = new Libro();  //constructor por defecto
        System.out.println(libro1.toString());
        //ingresar datos por consola
        System.out.println("Ingrese el titulo, autor y numero de paginas: ");
        Libro libro2 = new Libro(teclado.nextLine(), teclado.nextLine(),teclado.nextInt());
        System.out.println(libro2.toString());
        System.out.println("------------");

        //Clase CuentaBancaria
        CuentaBancaria cBancaria1 = new CuentaBancaria();
        System.out.println(cBancaria1.toString());
        //ingresar los datos por consola
        System.out.println("Ingrese nombreCuenta, tipo cuenta: ");
        CuentaBancaria cBancaria2 = new CuentaBancaria(teclado.nextLine(), teclado.nextLine());
        System.out.println(cBancaria2.toString());
        System.out.print("Ingrese nombreCuenta: "); String nombreCuenta = teclado.nextLine();
        System.out.print("Ingrese saldo: "); double saldo = teclado.nextDouble(); teclado.nextLine();
        System.out.print("Ingrese tipoCuenta: "); String tipoCuenta = teclado.nextLine();
        CuentaBancaria cBancaria3 = new CuentaBancaria(nombreCuenta, saldo, tipoCuenta);
        System.out.println(cBancaria3.toString());
        System.out.println("------------");

        //clase Estudiante
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1.toString());
        //ingresar datos por consola
        System.out.print("Ingrese nombre: ");String nombre = teclado.nextLine();
        System.out.print("Ingrese edad: "); int edad = teclado.nextInt(); teclado.nextLine(); 
        Estudiante estudiante2 = new Estudiante(nombre, edad);
        System.out.println(estudiante2.toString());
        System.out.print("Ingrese nombre: ");nombre = teclado.nextLine();
        System.out.print("Ingrese edad: "); edad = teclado.nextInt(); teclado.nextLine(); 
        System.out.print("ingrese curso: "); int curso = teclado.nextInt(); teclado.nextLine();
        Estudiante estudiante3 = new Estudiante(nombre, edad, curso);
        System.out.println(estudiante3.toString());

        teclado.close();
    }
}



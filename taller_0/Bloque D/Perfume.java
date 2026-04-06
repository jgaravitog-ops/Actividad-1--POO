public class Perfume {
    String marca;
    String nombre;
    
    public static void main(String[] args) {
        Perfume perfume1 = new Perfume(); //objeto 1
        Perfume perfume2 = new Perfume(); //objeto 2
        Perfume perfume3 = new Perfume(); //objeto 3

        perfume1.nombre = "Bleu de Chanel";
        perfume1.marca = "Chanel";
        
        perfume2.nombre = "Allure Homme Sport";
        perfume2.marca = "Chanel";

        perfume3.nombre = "Acqua di Gio";
        perfume3.marca = "Giorgio Armani";
    }
}
/*Ejercicio 20: Los 3 objetos comparten que fueron instanciados de la clase Perfume y tienen los mismos atributos (marca y nombre),
es decir, todos tienen la misma estructura. 
Se diferencian en que cada objeto tiene valores diferentes (marca y modelo), aunque tenga un valor "igual", ese valor
seguira siendo propio del objeto y no tendra relacion con el valor del otro objeto mas alla de que son del mismo tipo. 
Por lo tanto, cada objeto puede almacener informacion distinta en sus atributos, que permite diferenciar al perfume de los demas.

Ejercicio 21: El objeto perfume1 y perfume2 tienen el mismo valor en el atributo marca. siguen siendo el mismo valor
pero cada uno representa a su objeto.
 */
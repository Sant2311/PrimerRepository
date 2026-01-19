import java.util.Scanner;

//atributos
public class Cuadrado extends FiguraGeometrica {
 private double lado;
 
 //constructor
 public Cuadrado(double lado) {
     this.lado = lado;
 }
 //metodos
 @Override
 public double obtenerArea() {
     return lado * lado;
 }

 @Override
 public double obtenerPerimetro() {
     return 4 * lado;
 }

 @Override
 public String toString() {
     return "CUADRADO\n" +
            "LADO: " + lado + "\n" +
            super.toString();
 }

 public static Cuadrado crearCuadrado(Scanner sc) {
     System.out.print("Introduce el tamaño del lado: ");
     double lado = Double.parseDouble(sc.nextLine());
     return new Cuadrado(lado);
 }
}
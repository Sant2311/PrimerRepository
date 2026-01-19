import java.util.Scanner;

//atributos
public class Circulo extends FiguraGeometrica {
 private double radio;

 //constructor
 public Circulo(double radio) {
     this.radio = radio;
 }

 //metodo 
 @Override
 public double obtenerArea() {
     return Math.PI * radio * radio;
 }

 @Override
 public double obtenerPerimetro() {
     return 2 * Math.PI * radio;
 }

 @Override
 public String toString() {
     return "CIRCULO\n" +
            "RADIO: " + radio + "\n" +
            super.toString();
 }

 public static Circulo crearCirculo(Scanner sc) {
     System.out.print("Introduce el radio: ");
     double radio = Double.parseDouble(sc.nextLine());
     return new Circulo(radio);
 }
}
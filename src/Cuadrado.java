import java.util.Scanner;

//atributos
class Cuadrado extends FiguraGeometrica {
    private double lado;

    // constructor
    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    // metodos
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

    public static Cuadrado crearCuadrado(Scanner teclado) {
        System.out.print("Introduce el tamaño del lado: ");
        double lado = teclado.nextDouble();
        teclado.nextLine();
        return new Cuadrado(lado);
    }
}
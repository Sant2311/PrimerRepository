import java.util.Scanner;

//atributos
class Circulo extends FiguraGeometrica {
    private double radio;

    // constructor
    public Circulo(double radio) {
        super(1);
        this.radio = radio;
    }

    // metodo
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

    public static Circulo crearCirculo(Scanner teclado) {
        System.out.print("Introduce el radio: ");
        double radio = teclado.nextDouble();
        teclado.nextLine();
        return new Circulo(radio);
    }

}
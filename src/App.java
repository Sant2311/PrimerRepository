import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Figuras Geométricas ---");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = leerEntero(teclado);

            if (opcion == 4) {
                System.out.println("Adiós!");
                break;
            }
            if (opcion == 2) {
                System.out.print("Ingresa la altura del rectángulo: ");
                double altura = teclado.nextDouble();
                System.out.print("Ingresa la base del rectángulo: ");
                double base = teclado.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
                break;
            }
            if (opcion == 3) {
                System.out.print("Ingresa el lado del triángulo: ");
                double lado = teclado.nextDouble();
                Triangulo triangulo = new Triangulo(lado);

                System.out.println("Área del triángulo: " + triangulo.obtenerArea());
                System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
                break;
            } else {
                System.out.println("Opción no válida");
            }
        } while (true);
        teclado.close();
    }

    private static int leerEntero(Scanner teclado) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            if (teclado.hasNextInt()) {
                valor = teclado.nextInt();
                valido = true;
            } else {
                System.out.println("Ingresar solo números");
                teclado.next();
            }

        }
        return valor;
    }

}

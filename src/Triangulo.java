class Triangulo extends FiguraGeometrica {

    private double lado;

    public Triangulo(double lado) {
        super(3);
        this.lado = lado;
    }

    @Override
    double obtenerArea() {
        return lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    double obtenerPerimetro() {
        return 3 * lado;
    }

    @Override
    public String toString() {
        return "\nLado: " + lado +
                "\nArea: " + (int) obtenerArea() +
                "\nPerimetro: " + (int) obtenerPerimetro();
    }

}

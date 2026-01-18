class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }

    @Override
    double obtenerArea() {
        return base * altura;
    }

    @Override
    double obtenerPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "\nBase: " + base +
                "\nAltura: " + altura +
                "\nArea: " + (int) obtenerArea() +
                "\nPerimetro: " + (int) obtenerPerimetro();
    }
}

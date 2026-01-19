abstract class FiguraGeometrica {
    protected int numLados;

    public FiguraGeometrica(int numLados) {
        this.numLados = numLados;
    }

    public FiguraGeometrica(){
        
    }

    abstract double obtenerArea();

    abstract double obtenerPerimetro();

    @Override
    public String toString() {
        return "Numero de lados: " + numLados +
                "\nArea: " + obtenerArea() +
                "\nPerimetro: " + obtenerPerimetro();
    }

}

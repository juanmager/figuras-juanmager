package ar.edu.unahur.obj2;

public class FiguraAgujereada extends Figura {

    private Figura figura;

    public FiguraAgujereada(Figura figura) {
        this.figura = figura;
    }

    @Override
    public Double area() {
        return this.figura.area()/2;
    }
}

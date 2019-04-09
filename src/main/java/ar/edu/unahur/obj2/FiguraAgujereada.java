package ar.edu.unahur.obj2;

public class FiguraAgujereada extends Figura {

    private Figura figura;

    public FiguraAgujereada(Figura figura) {
        super(figura.getColor());
        this.figura = figura;
    }

    @Override
    public Double area() {
        return this.figura.area()/3;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FiguraAgujereada{");
        sb.append("figura=").append(figura);
        sb.append('}');
        return sb.toString();
    }
}

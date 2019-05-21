package ar.edu.unahur.obj2;

public class FiguraAgujereada extends Figura {

    private Figura figura;

    public FiguraAgujereada(Figura figura) {
        this.figura = figura;
    }
    
    public void pintar(Color color) {
        this.figura.pintar(color);    
    }
    
    public Color getColor() {
        return this.figura.getColor();
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

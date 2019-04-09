package ar.edu.unahur.obj2;

public class Rectangulo extends Figura {

    private Integer base;
    private Integer altura;

    public Rectangulo(String color, Integer base, Integer altura) {
        super(color);
        validarDimension(base);
        validarDimension(altura);

        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return (double)base*altura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("color='").append(getColor()).append('\'');
        sb.append("regular='").append(regular()).append('\'');
        sb.append("area=").append(area());
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}

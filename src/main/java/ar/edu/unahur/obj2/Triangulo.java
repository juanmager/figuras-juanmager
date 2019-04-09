package ar.edu.unahur.obj2;


public class Triangulo extends Figura {

    private Integer base;
    private Integer altura;

    public Triangulo(String color, Integer base, Integer altura) {
        super(color);
        validarDimension(base);
        validarDimension(altura);
        this.base = base;
        this.altura = altura;
    }

    public Double area() {
        return (double) (base * altura / 2);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangulo{");
        sb.append("color='").append(getColor()).append('\'');
        sb.append("regular='").append(regular()).append('\'');
        sb.append("area=").append(area());
        sb.append("base=").append(base);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}

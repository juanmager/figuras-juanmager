package ar.edu.unahur.obj2;

public class Circulo extends Figura {

    private Integer radio;

    public Circulo(String color, Integer radio) {
        super(color);
        validarDimension(radio);
        this.radio = radio;
    }

    public Double area() {
        return  Math.PI*Math.pow(radio,2);
    }

    public Integer getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circulo{");
        sb.append("color='").append(getColor()).append('\'');
        sb.append("regular='").append(regular()).append('\'');
        sb.append("area=").append(area());
        sb.append("radio=").append(radio);
        sb.append('}');
        return sb.toString();
    }
}

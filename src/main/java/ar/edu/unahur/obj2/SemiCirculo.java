package ar.edu.unahur.obj2;

public class SemiCirculo extends Circulo {

    public SemiCirculo(String color, Integer radio) {
        super(color, radio);
    }

    @Override
    public Double area() {
        return super.area()/2;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SemiCirculo{");
        sb.append("color='").append(getColor()).append('\'');
        sb.append("regular='").append(regular()).append('\'');
        sb.append("area=").append(area());
        sb.append("radio=").append(getRadio());
        sb.append('}');
        return sb.toString();
    }
}

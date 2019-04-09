package ar.edu.unahur.obj2;

public class SemiCirculo extends Circulo {

    public SemiCirculo(String color, Integer radio) {
        super(color, radio);
    }

    @Override
    public Double area() {
        return super.area()/2;
    }


}

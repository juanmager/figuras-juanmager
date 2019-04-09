package ar.edu.unahur.obj2;

import java.util.Objects;

public class Triangulo extends Figura {

    private Double base;
    private Double altura;

    public Triangulo(String color, Double base, Double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Double area() {
        return  base*altura/2;
    }

}

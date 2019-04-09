package ar.edu.unahur.obj2;

import java.util.Objects;

public abstract class Figura {

    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public Figura() {
    }

    public String getColor() {
        return color;
    }

    public void pintar(String color) {
        this.color = color;
    }

    public Boolean regular() {
        return true;
    }

    public abstract Double area();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return Objects.equals(getColor(), figura.getColor()) && Objects.equals(area(), figura.area());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), area());
    }
}

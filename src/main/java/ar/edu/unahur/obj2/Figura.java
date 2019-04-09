package ar.edu.unahur.obj2;

import java.util.Objects;

public abstract class Figura implements Comparable<Figura> {

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

    /**
     * La implementación de comparable es el orden "natural" de los objetos Figura (figuras y sus subclases).
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Figura o) {
        return this.area().compareTo(o.area());
    }

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Figura{");
        sb.append("color='").append(getColor()).append('\'');
        sb.append("regular='").append(regular()).append('\'');
        sb.append("area=").append(area());
        sb.append('}');
        return sb.toString();
    }

    protected void validarDimension(Integer valor) {
        if (valor==null || valor<=0)
            throw new RuntimeException("Las dimensiones no pueden ser menores o iguales a 0 (cero)");
    }
}

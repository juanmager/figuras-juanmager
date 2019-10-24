package figuras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// EL ABSTRACT QUIERE DECIR QUE NO SE PUEDE CREAR OBJ DE ESTA SUPERCLASE
// PERO SIRVE PARA MODELAR OTRAS SUPERCLASES.

public abstract class Figura { 

	private String color;
	private double area;
	public boolean regular;
	List<Figura> figuretas = new ArrayList<Figura>();

	public Figura(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void pintar(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRegular() {
		regular = true;
	}
	
	public void setNoRegular() {
		regular = false;
	}
	
	public boolean getEsRegular() {
		return regular;
	}
	
	public void addFigura(Figura cual) {
		figuretas.add(cual);
	}
	
	public List<Figura> figuretasOrdenada(){
		return figuretas.stream()
		.sorted(Comparator.comparingDouble(Figura::getArea))
		.collect(Collectors.toList());
	}
	
	
	public Figura figuretasMAX(){
		return figuretas.stream()
				.max(Comparator.comparing(Figura::getArea)).get();
	}
	
	public Figura figuretasMIN(){
		return figuretas.stream()
				.min(Comparator.comparing(Figura::getArea)).get();
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return Objects.equals(this.color, figura.color) &&
                Objects.equals(this.getArea(), figura.getArea());
    }

}

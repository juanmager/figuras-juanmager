package figuras;

public class Triangulo extends Figura {
	
	private double base;
	private double altura;
	
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public double area() {
		return (base * (altura / 2));
	}

	
}

package figuras;

public class Rectangulo extends Figura {
	
	private double base = 0;
	private double altura = 0;
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public double area() {
		return base * altura;
	}

}

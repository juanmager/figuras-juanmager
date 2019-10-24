package figuras;

public class Circulo extends Figura {

	protected Integer radio;
	
	public Circulo(String color, Integer radio) {
		super(color);
		this.radio = radio;
	}
	
	public Integer getRadio() {
		return radio;
	}

	public void setRadio(Integer radio) {
		this.radio = radio;
	}

	public double getArea() { // PI * radio(ALCUADRADO)
		return Math.PI*Math.pow(radio, 2);
	}
	
	public Double perimetro() {
		return 2*Math.PI*radio;
	}
	

}

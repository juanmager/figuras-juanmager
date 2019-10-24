package figuras;

public class Semicirculo extends Circulo {

	public Semicirculo(String color, Integer radio) {
		super(color, radio);
	}

	@Override
	public double getArea() {
		return ((Math.PI*Math.pow(radio, 2)) / 2);
		
	}
	
	

}

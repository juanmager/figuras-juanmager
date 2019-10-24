package figuras;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Pruebas {
	
	
	Circulo circle;
	Semicirculo semicircle;
	Triangulo triangle;
	Rectangulo rectangle;
	Rectangulo rectangle2;
	
	@BeforeEach
	void ImplementoTest() {
		circle = new Circulo("amarillo", 10);
		
		semicircle = new Semicirculo("verde", 10);
		
		triangle = new Triangulo("Azul", 10, 20);
		
		rectangle = new Rectangulo("Violeta", 10, 20);
		
		rectangle2 = new Rectangulo("Violeta", 10, 20);
		
		//List<Figura>figuretas = new ArrayList<Figura>();
		
		rectangle.figuretas.add(circle);
		//rectangle.figuretas.add(rectangle);
		//rectangle.figuretas.add(rectangle2);
		rectangle.figuretas.add(semicircle);
		rectangle.figuretas.add(triangle);
		
	}
	
	@Test
	public void TestCircle() {
		assertEquals(314.1592653589793, circle.getArea());
	}
	
	@Test
	public void TestSemiCircle() {
		assertEquals(157.07963267948966, semicircle.getArea());
	}
	

	@Test
	public void TestTriangle() {
		assertEquals(100, triangle.area());
	}
	
	@Test
	public void TestRectangle() {
		assertEquals(200, rectangle.area());
	}
	
	@Test
	public void TestRectangulosIguales() {
		assertTrue(rectangle2.equals(rectangle));
	}
	
	@Test
	public void TestRectanguosNOiguales() {
		rectangle2.pintar("Verde");
		assertFalse(rectangle2.equals(rectangle));
	}
	
	@Test	
	public void TestMAX() {
		assertEquals(circle, rectangle.figuretasMAX());
		
	}
	
	@Test	
	public void TestMIN() {
		assertEquals(triangle, rectangle.figuretasMIN());
		
	}
	
	
	
}

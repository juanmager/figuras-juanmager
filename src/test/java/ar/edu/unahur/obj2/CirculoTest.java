package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CirculoTest {


    private Circulo circulo1;
    private Rectangulo rectangulo1;
    private Rectangulo rectangulo2;
    private Triangulo triangulo1;
    private SemiCirculo semiCirculo;
    private FiguraAgujereada rectanguloConAgujeros;
    private FiguraAgujereada trianguloConAgujeros;


    @BeforeTest
    public void setUp() {
        circulo1 = new Circulo("amarillo",10);
        semiCirculo = new SemiCirculo("verde", 10);
        triangulo1 = new Triangulo("azul", 10, 20);
        rectangulo1 = new Rectangulo("violeta", 10, 20);
        rectangulo2 = new Rectangulo("violeta", 10, 20);
        rectanguloConAgujeros = new FiguraAgujereada(rectangulo1);
        trianguloConAgujeros = new FiguraAgujereada(triangulo1);
    }

    @Test
    public void areaCirculoOk() {
        Double superficieEsperada = Math.PI*Math.pow(10,2);
        Assert.assertEquals(circulo1.area(), superficieEsperada);
    }

    @Test
    public void areaSemiCirculoOk() {
        Double superficieEsperada = Math.PI*Math.pow(10,2)/2;
        Assert.assertEquals(semiCirculo.area(), superficieEsperada);
    }

    @Test
    public void areaTrianguloOk() {
        Double superficieEsperada = 100d;
        Assert.assertEquals(triangulo1.area(), superficieEsperada);
    }

    @Test
    public void areaRectanguloOk() {
        Double superficieEsperada = 200d;
        Assert.assertEquals(rectangulo1.area(), superficieEsperada);
    }


    @Test
    public void areaRectanguloAgujereadoOk() {
        Double superficieEsperada = 200d/3;
        Assert.assertEquals(rectanguloConAgujeros.area(), superficieEsperada);
    }


    @Test
    public void setRectanguloIguales() {
       Assert.assertTrue(rectangulo1.equals(rectangulo2));
    }

    @Test
    public void setRectanguloIguales2() {
        rectangulo1.pintar("verde");
        Assert.assertFalse(rectangulo1.equals(rectangulo2));
    }

    @Test
    public void ordenamientoNatural() {
        List<Figura> figuras = Arrays.asList(circulo1, semiCirculo, rectangulo1, rectangulo2,
                triangulo1);

        List<Figura> figurasOrdenNatural = figuras.stream().sorted().collect(Collectors.toList());

        // Imprimo todos los elementos de la colección por terminal
        figurasOrdenNatural.stream().forEach(System.out::println);

        Assert.assertEquals(figurasOrdenNatural.get(0), triangulo1);
        Assert.assertEquals(figurasOrdenNatural.get(figuras.size()-1), circulo1);

    }


    @Test
    public void ordenamientoAlternativo1() {
            List<Figura> figuras = Arrays.asList(circulo1, semiCirculo, rectangulo1, rectangulo2,
                    triangulo1);

            List<Figura> figurasOrdenColor = figuras.stream()
                    .sorted((f1,f2) -> f1.getColor().compareTo(f2.getColor()))
                    .collect(Collectors.toList());

            // Imprimo todos los elementos de la colección por terminal
            figurasOrdenColor.stream().forEach(System.out::println);

            Assert.assertEquals(figurasOrdenColor.get(0), circulo1);
            Assert.assertEquals(figurasOrdenColor.get(figuras.size()-1), rectangulo2);

    }

    @Test
    public void ordenamientoAlternativo2() {
        List<Figura> figuras = Arrays.asList(circulo1, semiCirculo, rectangulo1, rectangulo2,
                triangulo1, rectanguloConAgujeros, trianguloConAgujeros);

        List<Figura> figurasOrdenColor = figuras.stream()
                .sorted(Comparator.comparing(Figura::regular).thenComparing(Figura::area))
                .collect(Collectors.toList());

        // Imprimo todos los elementos de la colección por terminal
        figurasOrdenColor.stream().forEach(System.out::println);

        Assert.assertEquals(figurasOrdenColor.get(0), trianguloConAgujeros);
        Assert.assertEquals(figurasOrdenColor.get(figuras.size()-1), circulo1);

    }

    @Test(expectedExceptions = RuntimeException.class)
    public void dimensionInvalida() {
        Rectangulo rectangulo = new Rectangulo("azul", -10, 10);
    }

}

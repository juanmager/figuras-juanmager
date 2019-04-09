package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CirculoTest {

    @BeforeTest
    public void setUp() {

    }



    @Test
    public void saludoExitoso() {
        Circulo c1 = new Circulo("Rojo",20);

        Double superficieEsperada = Math.PI*Math.pow(20,2);

        Assert.assertEquals(superficieEsperada, c1.area());

    }

    @Test
    public void compararTriangulos() {
        Triangulo t1 = new Triangulo("verde", 10.0, 5.0);
        Triangulo t2 = new Triangulo("verde", 10.0, 5.0);

        Assert.assertTrue(t1.equals(t2));

    }

    @Test
    public void ordenamiento() {
        List<Integer> enteros = new ArrayList<>();
        enteros.add(100);
        enteros.add(15);
        enteros.add(23);
        enteros.add(16);

        System.out.println("Original: ");


        //for each
        for (Integer i : enteros) {
            System.out.println(i);
        }

        Collections.sort(enteros);

        System.out.println("Ordenada: ");

        //for each
        for (Integer i : enteros) {
            System.out.println(i);
        }

    }

}

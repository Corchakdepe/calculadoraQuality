package test;

import main.Calculadora;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;



class CalculadoraTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception
    {
        System.out.println("Before all");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception
    {
        System.out.println("After all");
    }

    @BeforeEach
    void setUp()
    {
        System.out.println("Before each");
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("After each");
    }

    @Test
    void add()
    {
        int valorEsperado = 12;
        int valorReal = Calculadora.add(4,3);

        assertEquals(valorEsperado,valorReal);
    }

    @Test
    void resta()
    {
        int valorEsperado = 12;
        int valorReal = Calculadora.resta(4,3);

        assertEquals(valorEsperado,valorReal);
    }

    @Test
    void multiply()
    {
        double valorEsperado = 12;
        double valorReal = Calculadora.multiply(4,3);

        assertEquals(valorEsperado,valorReal);
    }

    @Test
    void devide()
    {
        double valorEsperado = 12;
        double valorReal = Calculadora.devide(4,3);

        assertEquals(valorEsperado,valorReal);
    }
}
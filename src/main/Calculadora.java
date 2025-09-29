package main;

public class Calculadora {

    static public int add(int a, int b) {
        return a + b;
    }

    static public int resta(int a, int b) {
        return a - b;

    }

    static public double multiply(int a, int b)
    {
        return a*b;
    }

    static public double devide(int a, int b) {
        if (b==0){
            return -1;
        }else
        {
           return (double) a /b;
        }
    }
}
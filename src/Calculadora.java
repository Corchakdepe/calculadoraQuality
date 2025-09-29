import java.util.stream.DoubleStream;

public class Calculadora {

    static double add(int a, int b) {
        return a + b;
    }

    static double resta(int a, int b) {
        return a - b;

    }

    static double multiply(int a, int b)
    {
        return a*b;
    }

    static double devide(int a, int b) {
        if (b==0){
            return -1;
        }else
        {
           return a/b;
        }
    }
}
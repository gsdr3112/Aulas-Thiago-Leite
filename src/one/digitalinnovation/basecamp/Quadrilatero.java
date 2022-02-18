package one.digitalinnovation.basecamp;

public class Quadrilatero {
    public static double area(double lado) {  //Quadrilatero Quadrado
        return lado * lado;

    }

    public static double area(double a, double b) {  //Quadrilatero retângulo
        return a * b;

    }

    public static double area(double baseMaior, double baseMenor, double altura) {  //Quadrilatero trapézio
        return (baseMaior + baseMenor) / 2 * altura;

    }

    public static float area(float diagonal1, float diagonal2) {  //Quadrilatero losango
        return diagonal1 * diagonal2 / 2;

    }
}

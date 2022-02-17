package one.digitalinnovation.basecamp;

public class Quadrilatero {
    public static void area(double lado) {  //Quadrilatero Quadrado
        double area = lado*lado;
        System.out.println("Área do quadrado: "+ area + " um2");
    }

    public static void area(double a, double b) {  //Quadrilatero retângulo
        double area = a*b;
        System.out.println("Área do retângulo: "+ area + " um2");
    }

    public static void area(double baseMaior, double baseMenor, double altura) {  //Quadrilatero trapézio
        double area = (baseMaior+baseMenor)/2*altura;
        System.out.println("Área do trapézio: "+ area + " um2");
    }

    public static void area(float diagonal1, float  diagonal2) {  //Quadrilatero losango
        double area = diagonal1*diagonal2/2;
        System.out.println("Área do losango: "+ area + " um2");
    }
}

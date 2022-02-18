package one.digitalinnovation.basecamp;

/**
 * @author Guilherme Silva da Rocha
 * @since 17/02/2022
 * @version 1.0.0
 * @since 1.0.0
*/

public class Main {

    public static void main(String[] args) {
        //Calculadora
        Calculadora.soma(25.4, 72.3);
        Calculadora.subtracao(-50, 123.536);
        Calculadora.multiplicacao(25.4, 72.3);
        Calculadora.divisao(25.4, 72.3);
        System.out.println();

        //Mensagem
        Mensagem.obterMensagem(50);
        System.out.println();


        //Empréstimo
        Emprestimo.valorParcela(10000,24,0.01);
        System.out.println();

        //Área quadriláteros
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado: "+ areaQuadrado + " um2");

        double areaRetangulo = Quadrilatero.area(40d,50d);
        System.out.println("Área do retângulo: "+ areaRetangulo + " um2");

        double areaTrapezio = Quadrilatero.area(60,50,60);
        System.out.println("Área do trapézio: " + areaTrapezio + " um2");

        float areaLosango = Quadrilatero.area(50f,40f);
        System.out.println("Área do losango: " + areaLosango + " um2");






    }


}

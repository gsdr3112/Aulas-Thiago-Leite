package one.digitalinnovation.basecamp;

/**
 * @author Guilherme Silva da Rocha
 * @version 1.0.0
 * @since 17/02/2022
 * @since 1.0.0
 */

public class Main {

    /* public static void main(String[] args) {
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






     }*/
    public static void main(String[] args) {
        String s1 = "C";
        String s2 = "C";
        char c1 = 'x';
        char c2 = 'y';
        int i1 = 10;
        int i2 = 20;
        boolean b1 = false;
        boolean b2 = false;


        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("b1 && b2: " + (b1 && b2));

        int salarioReferencia = 1500;
        int salarioFuncionario = 1200;

        int dependentesMedia = 2;
        int dependentesFuncionario = 2;

        boolean salarioBaixo = salarioFuncionario < salarioReferencia;
        boolean muitosDependentes = dependentesFuncionario>dependentesMedia;

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        System.out.println("Recebe auxílio: " + recebeAuxilio);

    }


}

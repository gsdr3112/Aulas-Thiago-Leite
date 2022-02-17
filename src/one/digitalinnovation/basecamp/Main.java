package one.digitalinnovation.basecamp;

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
        Quadrilatero.area(2);
        Quadrilatero.area(54d, 40d);
        Quadrilatero.area(54, 40,55);
        Quadrilatero.area(54f, 40f);






    }


}

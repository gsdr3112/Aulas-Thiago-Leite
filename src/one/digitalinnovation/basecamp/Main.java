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
    /*public static void main(String[] args) {
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

    }*/

    public static void main(String[] args) {
        int mes = 12;

        switch (mes) {
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("março");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("maio");
                break;
            case 6:
                System.out.println("junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("setembro");
                break;
            case 10:
                System.out.println("outubro");
                break;
            case 11:
                System.out.println("novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
                System.out.println("digite um número de mês válido");
                break;

        }
        System.out.println();

        if (mes == 1) {
            System.out.println("janeiro");
        } else if (mes == 2) {
            System.out.println("fevereiro");
        } else if (mes == 3) {
            System.out.println("março");
        } else if (mes == 4) {
            System.out.println("abril");
        } else if (mes == 5) {
            System.out.println("maio");
        } else if (mes == 6) {
            System.out.println("junho");
        } else if (mes == 7) {
            System.out.println("julho");
        } else if (mes == 8) {
            System.out.println("agosto");
        } else if (mes == 9) {
            System.out.println("setembro");
        } else if (mes == 10) {
            System.out.println("outubro");
        } else if (mes == 11) {
            System.out.println("novembro");
        } else if (mes == 12) {
            System.out.println("dezembro");
        } else {
            System.out.println("digite um número de mês válido");
        }


        if ((mes == 7) || (mes == 12) || (mes == 1)) {
            System.out.println("Férias");
        }

        System.out.println();

        String diaSemana = "sabado";

        switch (diaSemana){
            case "segunda":
                System.out.println(1);
                break;
            case "terça":
                System.out.println(2);
                break;
            case "quarta":
                System.out.println(3);
                break;
            case "quinta":
                System.out.println(4);
                break;
            case "sexta":
                System.out.println(5);
                break;
            case "sabado":
                System.out.println(6);
                break;
            case "domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor indefinido");
        }


    }


}

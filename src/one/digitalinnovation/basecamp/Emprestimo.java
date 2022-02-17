package one.digitalinnovation.basecamp;

public class Emprestimo {

    public static void valorParcela(double valor, int parcelas, double taxa) {
        double resultado = Math.pow(1+taxa,parcelas)*valor/parcelas;

        System.out.println(parcelas + " parcelas de R$" + resultado + " à uma taxa de " + taxa*100 + "% am.");
    }

}

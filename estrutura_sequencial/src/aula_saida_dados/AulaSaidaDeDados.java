package aula_saida_dados;

import java.util.Locale;

public class AulaSaidaDeDados {
    public static void main(String[] args) {
        double x = 10.34958;
        String nome = "Marina";
        int idade = 26;
        double renda = 5430.90;

        //sout com a variavel x
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("RESULTADO: " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", x);

        //sout com as variaveis nome, idade e renda
        System.out.printf("%s tem %d anos e ganha R$%.2f.%n", nome, idade, renda);

    }
}

/*
Fazer um programa para ler o código de uma peça 1,
o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2
e o valor unitário de cada peça 2.
Calcule e mostre o valor a ser pago.
 */

package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, quantidadePecas1, codigoPeca2, quantidadePecas2;
        double valorPeca1, valorPeca2, valorASerPago;

        System.out.println("Digite o cod da peça, a qntd de peça e o valor unitario: ");
        codigoPeca1 = sc.nextInt();
        quantidadePecas1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        System.out.println("Digite o cod da peça2, a qntd de peça2 e o valor unitario: ");
        codigoPeca2 = sc.nextInt();
        quantidadePecas2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorASerPago = quantidadePecas1 * valorPeca1 + quantidadePecas2 * valorPeca2;
        System.out.printf("VALOR A PAGAR: R$%.2f", valorASerPago);

        sc.close();

    }
}

/*
Faça um programa para ler o valor do raio de um círculo,
e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raioCirculo, areaCirculo;

        System.out.print("Digite o raio do círculo: ");
        raioCirculo = sc.nextDouble();
        areaCirculo = pi * (Math.pow(raioCirculo, 2.0));
        System.out.printf("A área do círculo é %.4f", areaCirculo);

        sc.close();

    }
}

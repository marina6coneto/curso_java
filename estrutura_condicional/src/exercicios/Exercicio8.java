package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, impostoRenda;

        System.out.println("Digite o valor do seu salário (R$): ");
        salario = sc.nextDouble();

        if (salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario > 2000.00 && salario <= 3000.00) {
            impostoRenda = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", impostoRenda);
        } else if (salario > 3000.00 && salario <= 4500.00) {
            impostoRenda = (salario - 3000) * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", impostoRenda);
        } else {
            impostoRenda = (salario - 4500) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f%n", impostoRenda);
        }

        sc.close();

    }
}

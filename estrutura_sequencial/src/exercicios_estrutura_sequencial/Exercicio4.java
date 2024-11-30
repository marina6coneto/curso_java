/*
Fazer um programa que leia o número de um funcionário,
seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idFuncionario, horasTrabalhadas;
        double valorRecebidoHora, salarioFuncionario;
        System.out.println("ID do funcionário: ");
        idFuncionario = sc.nextInt();
        System.out.println("Número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Valor recebido por hora: ");
        valorRecebidoHora = sc.nextDouble();

        salarioFuncionario = horasTrabalhadas * valorRecebidoHora;

        System.out.println("NUMBER = " + idFuncionario);
        System.out.printf("SALARY: U$%.2f", salarioFuncionario);



        sc.close();

    }
}

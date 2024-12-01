/*
Fazer um programa para ler um número inteiro,
e depois dizer se este número é negativo ou não.
*/

package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number;
        System.out.print("Digite um número: ");
        number = sc.nextInt();

        if (number < 0){
            System.out.println("O número " + number + " é negativo.");
        } else if (number > 0) {
            System.out.println("O número " + number + " é positivo.");
        } else {
            System.out.println("O número " + number + " é não negativo!");
        }


        sc.close();

    }
}

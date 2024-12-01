/*
Leia 2 valores inteiros (A e B).
Após, o programa deve mostrar uma mensagem "Sao Múltiplos" ou
"Nao sao Múltiplos", indicando se os valores lidos são múltiplos entre si.
Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite dois números: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("São Múltiplos.");
        } else {
            System.out.println("Não são Múltiplos");
        }

        sc.close();

    }
}

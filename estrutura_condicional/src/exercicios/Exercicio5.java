package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double cachorroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.0;
        double torradaSimples = 2.0;
        double refrigerante = 1.5;
        double valorPedido;

        System.out.println("Bem vindo a Lancheria Marina");
        System.out.println("""
                1 - Cachorro Quente R$4.00\s
                2 - X-Salada        R$4.50\s
                3 - X-Bacon         R$5.00\s
                4 - Torrada Simples R$2.00\s
                5 - Refrigerante    R$1.50\s
               """);
        System.out.println("Digite o código do seu pedido e quantidade: ");
        int numero = sc.nextInt();
        int quantidade = sc.nextInt();

        if (numero == 1){
            valorPedido = cachorroQuente * quantidade;
            System.out.printf("Total: R$%.2f%n", valorPedido);

        } else if (numero == 2){
            valorPedido = xSalada * quantidade;
            System.out.printf("Total: R$%.2f%n", valorPedido);

        } else if (numero == 3) {
            valorPedido = xBacon * quantidade;
            System.out.printf("Total: R$%.2f%n", valorPedido);

        } else if (numero == 4) {
            valorPedido = torradaSimples * quantidade;
            System.out.printf("Total: R$%.2f%n", valorPedido);

        } else if (numero == 5) {
            valorPedido = refrigerante * quantidade;
            System.out.printf("Total: R$%.2f%n", valorPedido);

        } else {
            System.out.println("Número inválido");
        }

        sc.close();

    }
}

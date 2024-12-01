/*
Leia a hora inicial e a hora final de um jogo.
A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro,
tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horaInicial, horaFinal, tempoJogo;

        System.out.println("Digite a hora inicial da partida: ");
        horaInicial = sc.nextDouble();

        System.out.println("Digite a hora final da partida: ");
        horaFinal = sc.nextDouble();

        if (horaInicial < horaFinal){
            tempoJogo = horaFinal - horaInicial;
        } else {
            tempoJogo = 24 + horaFinal - horaInicial;
        }

        System.out.println("A duração do jogo foi de " + tempoJogo + " horas");

    }
}

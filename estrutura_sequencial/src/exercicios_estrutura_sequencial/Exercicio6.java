/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A como base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        System.out.println("Digite 3 valores de ponto flutuante");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTriangulo = A * C / 2;
        areaCirculo = pi * (Math.pow(C, 2.0));
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado = Math.pow(B, 2.0);
        areaRetangulo = A * B;

        System.out.printf("TRIÂNGULO: %.3f%n", areaTriangulo);
        System.out.printf("CÍRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPÉZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);



    }
}

package aula_saida_dados;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosPart1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);


        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        char a;
        a = sc.next().charAt(0);
        System.out.println("Você digitou: " + a);

        String m;
        int n;
        double o;
        m = sc.next();
        n = sc.nextInt();
        o = sc.nextDouble();
        System.out.println("Dados digitados: " + m + " | " + n + " | " + o);


        sc.close();

    }
}

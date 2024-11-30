package aula_saida_dados;

public class ProcessamentoDeDados {
    public static void main(String[] args) {
        int x, y;
        double z;
        x = 5;
        y = 2 * x;
        z = 3 * x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //area trapézio
        double b, h, B, area;
        b = 6.0;
        h = 5.0;
        B = 8.0;

        area = (b + B)/2 * h;
        System.out.println(area);

        //testando divisão com números inteiros
        int c, d;
        double resultado;

        c = 5;
        d = 2;

        resultado = (double) c / d;
        System.out.println(resultado);

        double e;
        int f;

        e = 5.0;
        f = (int) e;

        System.out.println(f);


    }
}

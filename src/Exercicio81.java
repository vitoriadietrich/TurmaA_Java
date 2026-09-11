import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] q = new double[20];

        for (int i = 0; i < 20; i++) {
            double valor;
            do {
                System.out.print("Digite o valor " + (i + 1) + " (positivo): ");
                valor = sc.nextDouble();
                if (valor < 0) {
                    System.out.println("Valor inválido!");
                }
            } while (valor < 0);
            q[i] = valor;
        }

        double menor = q[0];
        int posicao = 1;

        for (int i = 1; i < 20; i++) {
            if (q[i] < menor) {
                menor = q[i];
                posicao = i + 1;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posição: " + posicao);
        sc.close();
    }
}

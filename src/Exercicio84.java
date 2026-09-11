import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho dos vetores (N): ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] soma = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do vetor A: ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do vetor B: ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma[i] = a[i] + b[i];
        }

        System.out.print("Vetor Soma: ");
        for (int i = 0; i < n; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

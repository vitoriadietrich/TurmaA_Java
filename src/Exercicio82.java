import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] m = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Digite o valor de X: ");
        int x = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            m[i] = a[i] * x;
        }

        System.out.print("Vetor M: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

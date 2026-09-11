import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[11]; // 10 + 1 posição extra para o novo número

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        // ordena os 10 primeiros elementos
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.print("Digite um novo número: ");
        int novo = sc.nextInt();

        int pos = 10;
        boolean achou = false;
        for (int i = 0; i < 10 && !achou; i++) {
            if (novo < vetor[i]) {
                pos = i;
                achou = true;
            }
        }

        for (int i = 9; i >= pos; i--) {
            vetor[i + 1] = vetor[i];
        }
        vetor[pos] = novo;

        System.out.print("Vetor com o novo número inserido: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}

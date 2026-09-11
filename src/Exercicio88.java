import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite um número para remover: ");
        int numero = sc.nextInt();

        boolean existe = false;
        int posicao = -1;

        for (int i = 0; i < 20; i++) {
            if (vetor[i] == numero) {
                existe = true;
                posicao = i;
            }
        }

        if (existe) {
            int[] novoVetor = new int[19];
            int j = 0;
            for (int i = 0; i < 20; i++) {
                if (i != posicao) {
                    novoVetor[j] = vetor[i];
                    j++;
                }
            }

            System.out.print("Novo vetor: ");
            for (int i = 0; i < 19; i++) {
                System.out.print(novoVetor[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Número não encontrado no vetor");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[50];

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vet[i] = sc.nextInt();
        }

        boolean existemRepetidos = false;

        for (int i = 0; i < 49; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (vet[i] == vet[j]) {
                    existemRepetidos = true;
                    System.out.println("Valor " + vet[i] + " repetido nas posições " + (i + 1) + " e " + (j + 1));
                }
            }
        }

        if (!existemRepetidos) {
            System.out.println("Não existem números repetidos no vetor");
        }
        sc.close();
    }
}

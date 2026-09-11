import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[30];

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite um número para buscar: ");
        int numero = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < 30; i++) {
            if (vetor[i] == numero) {
                contador++;
            }
        }

        System.out.println("O número aparece " + contador + " vezes.");
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[15];
        int[] v2 = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do vetor V1: ");
            v1[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o valor " + (i + 1) + " do vetor V2: ");
            v2[i] = sc.nextInt();
        }

        int contador = 0;
        for (int i = 0; i < 15; i++) {
            if (v1[i] == v2[i]) {
                contador++;
            }
        }

        System.out.println("Quantidade de posições iguais: " + contador);
        sc.close();
    }
}

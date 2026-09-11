import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int val1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int val2 = sc.nextInt();

        int inicio = Math.min(val1, val2);
        int fim = Math.max(val1, val2);

        long soma = 0;
        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }
        System.out.println("Soma dos inteiros entre os valores: " + soma);
        sc.close();
    }
}

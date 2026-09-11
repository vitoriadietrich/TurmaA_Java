import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int val1 = sc.nextInt();
        System.out.print("Digite o segundo valor (maior que o primeiro): ");
        int val2 = sc.nextInt();

        long soma = 0;
        for (int i = val1; i <= val2; i++) {
            soma += i;
        }
        System.out.println("Soma dos inteiros entre os valores: " + soma);
        sc.close();
    }
}

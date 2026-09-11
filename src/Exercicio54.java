import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite N (maior que 0): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Valor inválido!");
            }
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}

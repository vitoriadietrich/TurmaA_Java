import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        do {
            System.out.print("Digite a primeira nota (0 a 10): ");
            n1 = sc.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.println("Nota inválida!");
            }
        } while (n1 < 0 || n1 > 10);

        do {
            System.out.print("Digite a segunda nota (0 a 10): ");
            n2 = sc.nextDouble();
            if (n2 < 0 || n2 > 10) {
                System.out.println("Nota inválida!");
            }
        } while (n2 < 0 || n2 > 10);

        double media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
        sc.close();
    }
}

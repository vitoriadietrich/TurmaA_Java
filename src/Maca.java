import java.util.Scanner;

public class Maca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs: ");
        int quantidade = sc.nextInt();

        double total;

        if (quantidade < 12) {
            total = quantidade * 1.30;
        } else {
            total = quantidade * 1.00;
        }

        System.out.printf("Custo total: R$ %.2f%n", total);

        sc.close();
    }
}
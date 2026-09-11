import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de morangos (Kg): ");
        double morango = sc.nextDouble();

        System.out.print("Quantidade de maçãs (Kg): ");
        double maca = sc.nextDouble();

        double precoMorango;
        double precoMaca;

        if (morango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (maca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double total = (morango * precoMorango) + (maca * precoMaca);

        if (morango + maca > 8 || total > 25) {
            total = total * 0.90;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
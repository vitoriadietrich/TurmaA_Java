import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();

        System.out.print("Digite o tipo de combustível (A ou G): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double preco;
        double desconto;

        if (tipo == 'A') {
            preco = 2.90;

            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }

        } else {
            preco = 3.30;

            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        }

        double valor = litros * preco;
        double valorDesconto = valor * desconto;
        double total = valor - valorDesconto;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
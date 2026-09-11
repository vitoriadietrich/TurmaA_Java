import java.util.Scanner;

public class Unitario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.print("Preço unitário: R$ ");
        double preco = sc.nextDouble();

        double total = quantidade * preco;
        double desconto;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalPagar = total - desconto;

        System.out.println("Produto: " + nome);
        System.out.printf("Total: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);

        sc.close();
    }
}
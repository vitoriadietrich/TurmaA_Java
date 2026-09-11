import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double maior = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o código do produto " + i + ": ");
            int codigo = sc.nextInt();
            System.out.print("Digite o preço do produto " + i + ": ");
            double preco = sc.nextDouble();

            soma += preco;
            if (i == 1 || preco > maior) {
                maior = preco;
            }
        }

        double media = soma / 15;
        System.out.println("Maior preço: " + maior);
        System.out.println("Média dos preços: " + media);
        sc.close();
    }
}

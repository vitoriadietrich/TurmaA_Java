import java.util.Scanner;

public class Exercicio68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de mercadorias: ");
        int numMercadorias = sc.nextInt();
        double totalEstoque = 0;

        for (int i = 1; i <= numMercadorias; i++) {
            System.out.print("Digite o valor da mercadoria " + i + ": ");
            double valor = sc.nextDouble();
            totalEstoque += valor;
        }

        double media = totalEstoque / numMercadorias;
        System.out.println("Valor total em estoque: " + totalEstoque);
        System.out.println("Média de valor: " + media);
        sc.close();
    }
}

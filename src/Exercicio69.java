import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalEstoque = 0;
        int numMercadorias = 0;
        String resp;

        do {
            System.out.print("Digite o valor da mercadoria: ");
            double valor = sc.nextDouble();
            totalEstoque += valor;
            numMercadorias++;
            System.out.print("MAIS MERCADORIAS (S/N)? ");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("S"));

        double media = totalEstoque / numMercadorias;
        System.out.println("Valor total em estoque: " + totalEstoque);
        System.out.println("Média de valor: " + media);
        sc.close();
    }
}

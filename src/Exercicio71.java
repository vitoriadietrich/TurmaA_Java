import java.util.Scanner;

public class Exercicio71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de números: ");
        int qtd = sc.nextInt();

        System.out.print("Digite o valor 1: ");
        double valor = sc.nextDouble();
        double maior = valor;
        double soma = valor;

        for (int i = 2; i <= qtd; i++) {
            System.out.print("Digite o valor " + i + ": ");
            valor = sc.nextDouble();
            soma += valor;
            if (valor > maior) maior = valor;
        }

        double media = soma / qtd;
        System.out.println("Maior valor: " + maior);
        System.out.println("Média: " + media);
        sc.close();
    }
}

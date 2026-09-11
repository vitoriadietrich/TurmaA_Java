import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um valor: ");
            double numero = sc.nextDouble();
            soma += numero;
        }
        double media = soma / 10;
        System.out.println("Média: " + media);
        sc.close();
    }
}

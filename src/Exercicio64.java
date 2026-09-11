import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();
            if (numero < 40) {
                soma += numero;
            }
        }
        System.out.println("Soma dos valores menores que 40: " + soma);
        sc.close();
    }
}

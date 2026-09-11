import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double val1 = sc.nextDouble();
        double val2;
        do {
            System.out.print("Digite o segundo valor: ");
            val2 = sc.nextDouble();
            if (val2 == 0) {
                System.out.println("VALOR INVÁLIDO");
            }
        } while (val2 == 0);
        double divisao = val1 / val2;
        System.out.println("Resultado da divisão: " + divisao);
        sc.close();
    }
}

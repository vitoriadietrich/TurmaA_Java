import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double val1 = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double val2 = sc.nextDouble();
        while (val2 == 0) {
            System.out.println("VALOR INVÁLIDO");
            System.out.print("Digite o segundo valor: ");
            val2 = sc.nextDouble();
        }
        double divisao = val1 / val2;
        System.out.println("Resultado da divisão: " + divisao);
        sc.close();
    }
}

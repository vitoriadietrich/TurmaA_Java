import java.util.Scanner;

public class Salariofixo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário fixo: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor das vendas: R$ ");
        double vendas = sc.nextDouble();

        double comissao;

        if (vendas <= 1500) {
            comissao = vendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((vendas - 1500) * 0.05);
        }

        double salarioTotal = salario + comissao;

        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);

        sc.close();
    }
}
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para calcular o novo salário de um funcionário:");

        System.out.println("Digite o salário mensal atual:");
        double salarioMensal = entradaDados.nextDouble();

        System.out.println("Digite o percentual de reajuste:");
        double percentualReajuste = entradaDados.nextDouble();

        double novoSalario = salarioMensal + (salarioMensal * percentualReajuste / 100);

        System.out.println("O novo salário é: R$ " + novoSalario);

        entradaDados.close();
    }
} 
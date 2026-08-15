import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para calcular o custo final de um carro:");

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = entradaDados.nextDouble();

        double percentualDistribuidor = custoFabrica * 28 / 100;
        double percentualImpostos = custoFabrica * 45 / 100;

        double custoFinal = custoFabrica + percentualDistribuidor + percentualImpostos;

        System.out.println("O custo final do carro ao consumidor é: R$ " + custoFinal);

        entradaDados.close();
    }
}
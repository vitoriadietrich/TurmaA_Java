import java.util.Scanner;

public class Revendedora {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para calcular o salário final do vendedor:");

        System.out.println("Digite o número de carros vendidos:");
        int carrosVendidos = entradaDados.nextInt();

        System.out.println("Digite o valor total das vendas:");
        double valorTotalVendas = entradaDados.nextDouble();

        System.out.println("Digite o salário fixo:");
        double salarioFixo = entradaDados.nextDouble();

        System.out.println("Digite o valor recebido por carro vendido:");
        double valorPorCarro = entradaDados.nextDouble();

        double comissaoCarros = carrosVendidos * valorPorCarro;
        double comissaoVendas = valorTotalVendas * 5 / 100;

        double salarioFinal = salarioFixo + comissaoCarros + comissaoVendas;

        System.out.println("O salário final do vendedor é: R$ " + salarioFinal);

        entradaDados.close();
    }
}
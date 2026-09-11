import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperatura = new double[365];
        double soma = 0;

        for (int i = 0; i < 365; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + ": ");
            temperatura[i] = sc.nextDouble();
            soma += temperatura[i];
        }

        double mediaAnual = soma / 365;
        double menor = temperatura[0];
        double maior = temperatura[0];

        for (int i = 1; i < 365; i++) {
            if (temperatura[i] < menor) menor = temperatura[i];
            if (temperatura[i] > maior) maior = temperatura[i];
        }

        int diasAbaixo = 0;
        for (int i = 0; i < 365; i++) {
            if (temperatura[i] < mediaAnual) {
                diasAbaixo++;
            }
        }

        System.out.println("Menor temperatura: " + menor);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Dias abaixo da média: " + diasAbaixo);
        sc.close();
    }
}

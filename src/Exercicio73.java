import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaSalario = 0;
        int somaFilhos = 0;
        int contador = 0;
        int contadorMenor150 = 0;
        double maiorSalario = 0;

        System.out.print("Digite o salário (negativo para encerrar): ");
        double salario = sc.nextDouble();

        while (salario >= 0) {
            System.out.print("Digite o número de filhos: ");
            int filhos = sc.nextInt();

            somaSalario += salario;
            somaFilhos += filhos;
            contador++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario < 150) {
                contadorMenor150++;
            }

            System.out.print("Digite o salário (negativo para encerrar): ");
            salario = sc.nextDouble();
        }

        double mediaSalario = somaSalario / contador;
        double mediaFilhos = (double) somaFilhos / contador;
        double percentual = (contadorMenor150 * 100.0) / contador;

        System.out.println("Média de salário: " + mediaSalario);
        System.out.println("Média de filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Percentual com salário < 150: " + percentual + "%");
        sc.close();
    }
}

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler três notas de um aluno:");

        System.out.println("Digite a primeira nota:");
        double nota1 = entradaDados.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = entradaDados.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = entradaDados.nextDouble();

        double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.println("A média final é: " + mediaFinal);

        entradaDados.close();

    }
}
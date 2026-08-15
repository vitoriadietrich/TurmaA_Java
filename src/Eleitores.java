import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para calcular o percentual de votos:");

        System.out.println("Digite o número total de eleitores:");
        int totalEleitores = entradaDados.nextInt();

        System.out.println("Digite os votos brancos:");
        int brancos = entradaDados.nextInt();

        System.out.println("Digite os votos nulos:");
        int nulos = entradaDados.nextInt();

        System.out.println("Digite os votos válidos:");
        int validos = entradaDados.nextInt();

        // Calcula o percentual de votos nulos em relação ao total de eleitores,
        // multiplicando a quantidade de votos por 100 e dividindo pelo total.
        // Para calcular a porcentagem: quantidade de votos × 100 ÷ total de eleitores.
        double percentualBrancos = (brancos * 100.0) / totalEleitores;
        double percentualNulos = (nulos * 100.0) / totalEleitores;
        double percentualValidos = (validos * 100.0) / totalEleitores;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        entradaDados.close();
    }
} 
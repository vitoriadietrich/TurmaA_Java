import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler as notas da 1a. e 2a. avaliações de um aluno:");

        System.out.println("Digite sua nota:");
        int primeiraAvaliacao = entradaDados.nextInt();

        System.out.println("Digite sua nota:");
        int segundaAvaliacao = entradaDados.nextInt();

        double media = (primeiraAvaliacao + segundaAvaliacao) / 2.0;
        
        if(media >= 6) {
          System.out.println("Aprovado");
        } 
        
        else {
          System.out.println("Reprovado");
        }

        System.out.println("A média é: " + media);
    }
}
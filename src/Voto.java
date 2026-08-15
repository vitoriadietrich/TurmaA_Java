import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler o ano atual e o ano de nascimento de uma pessoa:");

        System.out.println("Digite o ano atual:");
        int anoAtual = entradaDados.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = entradaDados.nextInt();

        int votar = anoAtual - anoNascimento;
        
        if(votar >= 18) {
          System.out.println("Pode votar");
        } 
        
        else {
          System.out.println("Não pode votar");
        }
    }
}
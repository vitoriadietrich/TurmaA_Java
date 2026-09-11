import java.util.Calendar;
import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o código do empregado: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        // Ano atual obtido dinamicamente
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        // Cálculos
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        // Verificação dos requisitos
        boolean requisito1 = idade >= 65;
        boolean requisito2 = tempoTrabalho >= 30;
        boolean requisito3 = idade >= 60 && tempoTrabalho >= 25;

        // Saída de dados
        System.out.println("\n--- Resultado ---");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        if (requisito1 || requisito2 || requisito3) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }

        scanner.close();
    }
}

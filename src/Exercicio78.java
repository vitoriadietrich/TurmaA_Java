import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite o nome a ser buscado: ");
        String busca = sc.nextLine();

        String resposta = "NÃO ACHEI";
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                resposta = "ACHEI";
            }
        }

        System.out.println(resposta);
        sc.close();
    }
}

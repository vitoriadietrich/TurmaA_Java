import java.util.Scanner;

public class Xadrez {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hora de início: ");
        int inicio = sc.nextInt();

        System.out.print("Hora de fim: ");
        int fim = sc.nextInt();

        int duracao;

        if (inicio < fim) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }

        System.out.println("Duração do jogo: " + duracao + " horas");

        sc.close();
    }
}
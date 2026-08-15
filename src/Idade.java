import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para calcular a idade em dias:");

        System.out.println("Digite sua idade em anos:");
        int anos = entradaDados.nextInt();

        System.out.println("Digite os meses:");
        int meses = entradaDados.nextInt();

        System.out.println("Digite os dias:");
        int dias = entradaDados.nextInt();

        int idadeDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade em dias é: " + idadeDias);

        entradaDados.close();
    }
} 
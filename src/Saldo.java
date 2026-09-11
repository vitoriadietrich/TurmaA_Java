import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int conta = sc.nextInt();

        System.out.print("Saldo: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Débito: R$ ");
        double debito = sc.nextDouble();

        System.out.print("Crédito: R$ ");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        sc.close();
    }
}
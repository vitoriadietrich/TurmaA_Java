
import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o número da sua conta:");
        int numeroConta = entradaDados.nextInt();

        System.out.println("Digite o saldo:");
        float saldo = entradaDados.nextFloat();

        System.out.println("Digite o débito:");
        float debito = entradaDados.nextFloat();

        System.out.println("Digite o crédito:");
        float credito = entradaDados.nextFloat();

        float saldoAtual = saldo - debito + credito;

        if (saldoAtual < 0) {
            System.out.println("Saldo negativo");
        } else {
            System.out.println("Saldo positivo");
        }

    }
}
 

import java.util.Scanner;

public class Codigo {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o número de usúario:");
        int a = entradaDados.nextInt();

        if (a != 1234) {
            System.out.println("Usúario errado:");
        } else {
            System.out.println("Digite a senha:");
            int b = entradaDados.nextInt();

            if (b != 9999) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Acesso permitido");
            }

        }

    }
}

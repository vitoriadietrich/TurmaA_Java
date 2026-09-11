
import java.util.Scanner;

public class Mensagens {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        
        System.out.println("Digite um valor para a:");
        int a = entradaDados.nextInt();

        System.out.println("Digite um valor para b:");
        int b = entradaDados.nextInt();

        System.out.println("Digite um valor para c:");
        int c = entradaDados.nextInt();

        
        if (a >=  b && a >= c) {
            System.out.println("A é maior");

        } else if (b >=  a && b >= c) {
            System.out.println("B é maior");

        } else if (c >=  a && c >= b) {
            System.out.println("C é maior");

        } else {
            System.out.println("Todos são iguais");
        }
    }
}

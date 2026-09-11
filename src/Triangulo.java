
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a quantidade do estoque");
        int a = entradaDados.nextInt();

        System.out.println("Digite a quantidade máxima do estoque");
        int b = entradaDados.nextInt();

        System.out.println("Digite a quantidade mínima do estoque");
        int c = entradaDados.nextInt();

        if (a < b + c) {
            System.out.println("Não é válido");

        } else if (b < a + c) {
            System.out.println("Não é válido");

        } else if (c < a + b) {
            System.out.println("Não é válido");

        } else {
            System.out.println("É um triângulo válido");
        }
    }
}

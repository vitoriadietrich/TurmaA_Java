import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = sc.nextInt();
            if (valor < 1 || valor > 10) {
                System.out.println("Valor inválido!");
            }
        } while (valor < 1 || valor > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
        sc.close();
    }
}

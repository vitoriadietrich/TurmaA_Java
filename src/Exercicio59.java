import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um valor: ");
            double numero = sc.nextDouble();
            if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Quantidade de negativos: " + negativos);
        sc.close();
    }
}

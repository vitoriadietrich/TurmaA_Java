import java.util.Scanner;

public class Exercicio70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        double valor = sc.nextDouble();
        double maior = valor;
        double menor = valor;

        for (int i = 2; i <= 100; i++) {
            System.out.print("Digite o valor " + i + ": ");
            valor = sc.nextDouble();
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dentro = 0, fora = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um valor: ");
            double numero = sc.nextDouble();
            if (numero >= 10 && numero <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("Dentro do intervalo: " + dentro);
        System.out.println("Fora do intervalo: " + fora);
        sc.close();
    }
}

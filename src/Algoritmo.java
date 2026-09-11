import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite x: ");
        int x = sc.nextInt();

        System.out.print("Digite y: ");
        int y = sc.nextInt();

        int z = (x * y) + 5;
        char resposta;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println("Z = " + z);
        System.out.println("Resposta = " + resposta);

        sc.close();
    }
}
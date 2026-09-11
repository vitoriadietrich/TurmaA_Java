import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Idade do homem 1: ");
        int homem1 = sc.nextInt();

        System.out.print("Idade do homem 2: ");
        int homem2 = sc.nextInt();

        System.out.print("Idade da mulher 1: ");
        int mulher1 = sc.nextInt();

        System.out.print("Idade da mulher 2: ");
        int mulher2 = sc.nextInt();

        int homemVelho;
        int homemNovo;
        int mulherVelha;
        int mulherNova;

        if (homem1 > homem2) {
            homemVelho = homem1;
            homemNovo = homem2;
        } else {
            homemVelho = homem2;
            homemNovo = homem1;
        }

        if (mulher1 > mulher2) {
            mulherVelha = mulher1;
            mulherNova = mulher2;
        } else {
            mulherVelha = mulher2;
            mulherNova = mulher1;
        }

        int soma = homemVelho + mulherNova;
        int produto = homemNovo * mulherVelha;

        System.out.println("Soma: " + soma);
        System.out.println("Produto: " + produto);

        sc.close();
    }
}
import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa sucessor:");
        System.out.println("Digitar um número:");
        int numero = entradaDados.nextInt();
        int sucessor = numero +1;
        System.out.println("O sucessor é: " + sucessor);
    }
}
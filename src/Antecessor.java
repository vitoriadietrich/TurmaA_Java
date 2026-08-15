import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa antecessor:");
        System.out.println("Digitar um número:");
        int numero = entradaDados.nextInt();
        int antecessor = numero -1;
        System.out.println("O antecessor é: " + antecessor);
    }
}
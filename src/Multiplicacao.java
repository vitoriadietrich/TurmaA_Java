import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa de multiplicação:"); 
        System.out.println("Digite o primeiro valor:");
        int valor1 = entradaDados.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = entradaDados.nextInt();
        int multiplicacao = valor1 * valor2;
        System.out.println("A multiplicação dos valores são: " + multiplicacao);
    }
}
import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa de subtração:"); 
        System.out.println("Digite o primeiro valor:");
        int valor1 = entradaDados.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = entradaDados.nextInt();
        int subtracao = valor1 - valor2;
        System.out.println("A subtração dos valores são: " + subtracao);
    }
}
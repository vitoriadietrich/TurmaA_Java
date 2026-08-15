import java.util.Scanner;

public class ValoresMaior {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles:");

        System.out.println("Digite o primeiro valor:");
        int valor1 = entradaDados.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = entradaDados.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = entradaDados.nextInt();

        
        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O primeiro valor é maior");
        }

        else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O segundo valor é maior");
        }

        else {
            System.out.println("O terceiro valor é maior");
        }

        entradaDados.close();
    }
}
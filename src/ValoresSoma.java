import java.util.Scanner;

public class ValoresSoma {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles:");

        System.out.println("Digite o primeiro valor:");
        int valor1 = entradaDados.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = entradaDados.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = entradaDados.nextInt();
 

        int soma;

        if (valor1 < valor2 && valor1 < valor3) {
            soma = valor2 + valor3;
        }

        else if (valor2 < valor1 && valor2 < valor3) {
            soma = valor1 + valor3;
        }

        else {
            soma = valor1 + valor2;
        }

        System.out.println("A soma dos dois maiores valores é: " + soma);

        entradaDados.close();
    }
}
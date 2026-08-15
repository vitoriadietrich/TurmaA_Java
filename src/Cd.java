import java.util.Scanner;

public class Cd {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler 3 valores e escrevê-los em ordem crescente:");

        System.out.println("Digite o primeiro valor:");
        int valor1 = entradaDados.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = entradaDados.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = entradaDados.nextInt();

        int auxiliar;

        if (valor1 > valor2) {
            auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }

        if (valor1 > valor3) {
            auxiliar = valor1;
            valor1 = valor3;
            valor3 = auxiliar;
        }

        if (valor2 > valor3) {
            auxiliar = valor2;
            valor2 = valor3;
            valor3 = auxiliar;
        }

        System.out.println("Valores em ordem crescente: "
                + valor1 + ", " + valor2 + ", " + valor3);

        entradaDados.close();
    }
}
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler um valor e escrever a mensagem - É MAIOR QUE 10:");

        System.out.println("Digite um valor:");
        int valor = entradaDados.nextInt();

        if(valor >= 10) {
          System.out.println("É maior que 10");
        } 
        
        else{
          System.out.println("É menor que 10");
        }
    }
}
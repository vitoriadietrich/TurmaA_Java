import java.util.Scanner;

public class Pnz {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler um valor e escrever se é positivo ou negativo:");

        System.out.println("Digite um valor:");
        int valor = entradaDados.nextInt();

        if(valor >= 0) {
          System.out.println("É positivo");
        } 
        
        else if(valor < 0) {
          System.out.println("É negativo");
        }

        else{
            System.out.println("É zero");
        }
    }
}
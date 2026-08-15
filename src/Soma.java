
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in); //Scanner é uma classe e demos o nome pra ela de entradaDados porque ela não tinha antes. O System.in é a entrada do sistema. Esse entradaDados é o que vamos fazer dentro deste programa

        System.out.println("Programa soma:"); 
        System.out.println("Digite o primeiro número:");
        int numero1 = entradaDados.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = entradaDados.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos números são: " + soma);
  }
}
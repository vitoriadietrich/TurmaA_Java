
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o número de gols:");
        int palmeiras = entradaDados.nextInt();

        System.out.println("Digite o número de gols:");
        int corinthians = entradaDados.nextInt();

        if (palmeiras > corinthians) {
            System.out.println(" Palmeiras ganhou");
        } else if (palmeiras < corinthians) {
            System.out.println("Corinthians ganhou");
        } else {
            System.out.println("EMPATE");
        }
    }
}
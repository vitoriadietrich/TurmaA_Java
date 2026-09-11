
import java.util.Scanner;

public class MediaAproveitamento {
    public static void main(String[] args) {
        
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para ler três notas de um aluno:");

        System.out.println("Digite a primeira nota:");
        int nota1 = entradaDados.nextInt();

        System.out.println("Digite a segunda nota:");
        int nota2 = entradaDados.nextInt();

        System.out.println("Digite a terceira nota:");
        int nota3 = entradaDados.nextInt();

        double mediaExercicio = nota1 + nota2 + nota3 / 3;

        double mediaAproveitar = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicio) / 7.0;

        if(mediaAproveitar >= 9.0){
            System.out.println("");
        } 

        else if(mediaAproveitar >= 7.5 && mediaAproveitar < 9.0){
            System.out.println("");
        }

        else if(mediaAproveitar >= 6.0 && mediaAproveitar < 7.5){
            System.out.println("");
        }

        else {
            System.out.println("");
        }
    }
}

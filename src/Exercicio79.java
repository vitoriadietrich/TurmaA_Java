import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[20];
        double soma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 20;
        int acimaMedia = 0;

        for (int i = 0; i < 20; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Alunos acima da média: " + acimaMedia);
        sc.close();
    }
}

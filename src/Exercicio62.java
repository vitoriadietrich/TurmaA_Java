import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int numAlunos = sc.nextInt();
        double soma = 0;
        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;
        }
        double media = soma / numAlunos;
        System.out.println("Média da turma: " + media);
        sc.close();
    }
}

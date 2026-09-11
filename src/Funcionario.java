import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas no mês: ");
        int horas = sc.nextInt();

        System.out.print("Salário por hora: R$ ");
        double salarioHora = sc.nextDouble();

        double salarioTotal;

        if (horas > 160) {
            int horasExtras = horas - 160;
            double valorHoraExtra = salarioHora * 1.5;

            salarioTotal = (160 * salarioHora) + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = horas * salarioHora;
        }

        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);

        sc.close();
    }
}
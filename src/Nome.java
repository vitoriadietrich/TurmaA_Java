import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa simples em Java:");

        String nome = "Vitoria";
        String endereco = "Rua Luíza Aparecida de Húngaro";
        double salario = 2.600;
        String data = "17/08/2026";


        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Endereço: %s\n", endereco);
        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.printf("Data: %s\n", data);

        System.out.println("Eu " + nome + "morando no " + endereco + "confirmo o " + salario + "na " + data);

        entradaDados.close();

        //Eu <nome>, morando no endereço <endereco>, confirmo o salário <salario> na data <data>.
    }
}
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite a quantidade do estoque");
        int estoqueAtual = entradaDados.nextInt();

        System.out.println("Digite a quantidade máxima do estoque");
        int estoqueMax = entradaDados.nextInt();

        System.out.println("Digite a quantidade mínima do estoque");
        int estoqueMin = entradaDados.nextInt();

        int quantidadeMedia = (estoqueMax + estoqueMin) /2;
        
        if (estoqueAtual < quantidadeMedia) {
            System.out.println("Efetuar compra");
        } else {
            System.out.println("Não efetuar compra");
        }
    }
}
 
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa para converter Fahrenheit em Celsius:");

        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = entradaDados.nextDouble();

        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println("A temperatura em Celsius é: " + celsius + "°C");

        entradaDados.close();


        // Fórmula:
       // C/5 = F - 32/9

       // 100oC  =  212F (Para testar se a resposta está correta)

    }
}
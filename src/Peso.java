import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
       
        Scanner entradaDados = new Scanner(System.in);

        double peso_ideal;

        System.out.println("Programa para ler o peso ideal da pessoa:");

        System.out.println("Digite seu nome:");
        String nome = entradaDados.nextLine();

        System.out.println("Digite sua altura:");
        Float altura = entradaDados.nextFloat();

        System.out.println("Digite seu sexo:");
        String sexo = entradaDados.nextLine();

        if(sexo.equals("M")) {
          
         peso_ideal = (72.7 * altura) - 58;

        } else {
         
         peso_ideal = (62.1 * altura) - 44.7; 
        }

        System.out.println("Seu peso ideal é :" + peso_ideal);
        
    }
}


import java.util.Scanner; 
 
public class Retangulo { 
    public static void main(String[] args) { 
         
        Scanner entradaDados = new Scanner(System.in); 
 
        System.out.println("Programa de cálculo do retângulo:"); 
        System.out.println("Digitar o valor da base do retângulo:"); 
        float base = entradaDados.nextFloat(); 
        
        System.out.println("Digitar o valor da altura do retângulo:"); 
        float altura = entradaDados.nextFloat(); 
        
        float area = base*altura; 
        
        System.out.println("A área do retângulo é: " + area + "cm"); 
    } 
}   
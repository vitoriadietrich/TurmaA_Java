public class Exercicio67 {
    public static void main(String[] args) {
        long soma = 0;
        int contador = 0;
        for (int i = 15; i <= 100; i++) {
            soma += i;
            contador++;
        }
        double media = (double) soma / contador;
        System.out.println("Média: " + media);
    }
}

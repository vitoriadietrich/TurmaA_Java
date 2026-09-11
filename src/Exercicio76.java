public class Exercicio76 {
    // Simula o comando "posiciona" desenhando o retângulo direto no console,
    // já que não há controle real de cursor no terminal padrão.
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            StringBuilder linha = new StringBuilder();
            if (i == 1 || i == 10) {
                for (int j = 1; j <= 60; j++) {
                    linha.append("+");
                }
            } else {
                linha.append("+");
                for (int j = 2; j <= 59; j++) {
                    linha.append(" ");
                }
                linha.append("+");
            }
            System.out.println(linha.toString());
        }
    }
}

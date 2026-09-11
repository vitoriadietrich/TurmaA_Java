public class Exercicio75 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            StringBuilder linha = new StringBuilder();
            linha.append(i).append(", ");
            for (int j = 1; j <= 10; j++) {
                linha.append(j);
                if (j < 10) linha.append(" ");
            }
            System.out.println(linha.toString());
        }
    }
}

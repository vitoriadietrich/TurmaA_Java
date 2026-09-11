public class Exercicio77 {
    public static void main(String[] args) {
        int[] v = {0, 5, 1, 4, 2, 7, 8, 3, 6}; // índice 0 não usado, vetor começa em 1

        for (int i = 8; i >= 5; i--) {
            int aux = v[i];
            v[i] = v[8 - i + 1];
            v[8 - i + 1] = aux;
        }

        v[3] = v[1];
        v[v[3]] = v[v[2]];

        System.out.print("Vetor final: ");
        for (int i = 1; i <= 8; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}

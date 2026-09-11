public class Exercicio43 {
    public static void main(String[] args) {
        testarTriangulo(1, 2, 3);
        testarTriangulo(3, 4, 5);
        testarTriangulo(2, 2, 4);
        testarTriangulo(4, 4, 4);
        testarTriangulo(5, 3, 3);
    }

    public static void testarTriangulo(int a, int b, int c) {
        String mens;
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                mens = "Triângulo Equilátero";
            } else if (a == b || b == c || a == c) {
                mens = "Triângulo Isósceles";
            } else {
                mens = "Triângulo Escaleno";
            }
        } else {
            mens = "Não é possível formar um triângulo";
        }
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + " -> " + mens);
    }
}

public class Operadores {
    public static void main(String[] args) {

        boolean A = true;
        boolean B = true;
        boolean C = false;

        // a) (A e B) ou (A xou B)
        boolean a = (A && B) || (A ^ B);

        // b) (A ou B) e (A e C)
        boolean b = (A || B) && (A && C);

        // c) A ou C e B xou A e não B
        boolean c = A || (C && B) ^ (A && !B);

        System.out.println("a) " + a);
        System.out.println("b) " + b);
        System.out.println("c) " + c);
    }
}
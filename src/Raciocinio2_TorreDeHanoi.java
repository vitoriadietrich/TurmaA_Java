public class Raciocinio2_TorreDeHanoi {
    public static void main(String[] args) {
        int discos = 3;
        resolverHanoi(discos, 'A', 'C', 'B');
    }

    public static void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }
        resolverHanoi(n - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        resolverHanoi(n - 1, auxiliar, destino, origem);
    }
}

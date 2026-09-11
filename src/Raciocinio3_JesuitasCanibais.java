public class Raciocinio3_JesuitasCanibais {
    public static void main(String[] args) {
        System.out.println("Solução: Jesuítas e Canibais (3 e 3, barco para 2 pessoas)");
        System.out.println("Estado inicial: Esquerda(3 Jesuítas, 3 Canibais) | Direita(0,0)");
        System.out.println();
        System.out.println("1 - 2 canibais vão para a direita -> Esq(3J,1C) | Dir(0J,2C)");
        System.out.println("2 - 1 canibal volta -> Esq(3J,2C) | Dir(0J,1C)");
        System.out.println("3 - 2 canibais vão para a direita -> Esq(3J,0C) | Dir(0J,3C)");
        System.out.println("4 - 1 canibal volta -> Esq(3J,1C) | Dir(0J,2C)");
        System.out.println("5 - 2 jesuítas vão para a direita -> Esq(1J,1C) | Dir(2J,2C)");
        System.out.println("6 - 1 jesuíta e 1 canibal voltam -> Esq(2J,2C) | Dir(1J,1C)");
        System.out.println("7 - 2 jesuítas vão para a direita -> Esq(0J,2C) | Dir(3J,1C)");
        System.out.println("8 - 1 canibal volta -> Esq(0J,3C) | Dir(3J,0C)");
        System.out.println("9 - 2 canibais vão para a direita -> Esq(0J,1C) | Dir(3J,2C)");
        System.out.println("10 - 1 canibal volta -> Esq(0J,2C) | Dir(3J,1C)");
        System.out.println("11 - 2 canibais vão para a direita -> Esq(0J,0C) | Dir(3J,3C)");
        System.out.println();
        System.out.println("Total: 11 travessias. Concluído com sucesso!");
    }
}

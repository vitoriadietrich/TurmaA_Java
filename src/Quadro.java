public class Quadro {
    public static void main(String[] args) {

        int x, y, z;
        char resposta;

        // 1º teste
        x = 3;
        y = 2;

        z = (x * y) + 5;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println(x + " " + y + " " + z + " " + resposta);


        // 2º teste
        x = 150;
        y = 3;

        z = (x * y) + 5;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println(x + " " + y + " " + z + " " + resposta);


        // 3º teste
        x = 7;
        y = -1;

        z = (x * y) + 5;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println(x + " " + y + " " + z + " " + resposta);


        // 4º teste
        x = -2;
        y = 5;

        z = (x * y) + 5;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println(x + " " + y + " " + z + " " + resposta);


        // 5º teste
        x = 50;
        y = 3;

        z = (x * y) + 5;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }

        System.out.println(x + " " + y + " " + z + " " + resposta);
    }
}
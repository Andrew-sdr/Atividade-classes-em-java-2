import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random rodadas = new Random();
        int total = 0;

        for (int i = 1; i < 4; i++){
            int jogar = rodadas.nextInt(6) + 1;
            System.out.println("Rodada " + i + ": " + jogar);
            total += jogar;
        }

        System.out.print("A soma das rodadas foi: " + total);
    }
}

import java.util.Scanner;

public class ConversorDeRadianos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor em radianos: ");
        float radianos = entrada.nextFloat();

        float graus = (float) Math.toDegrees(radianos);
        System.out.println("O valor em graus e: " + graus);
    }
}

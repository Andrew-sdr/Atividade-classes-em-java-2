import java.util.Scanner;

public class InversorDeFrases {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        String removerEspaco = frase.replace(" ", "");
        String invertida = new StringBuilder(removerEspaco).reverse().toString();

        System.out.println("Frase invertida: " + invertida);
    }
}

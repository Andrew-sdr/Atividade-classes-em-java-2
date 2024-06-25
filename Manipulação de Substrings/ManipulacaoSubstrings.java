import java.util.Scanner;

public class ManipulacaoSubstrings {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String palavra = entrada.nextLine();

        if (palavra.length() > 0) {
            String substring = palavra.substring(0, palavra.length() - 1);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("String vazia!");
        }
    }
}

import java.util.Scanner;

public class DetectorDeConteudo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine().toLowerCase();

        if (frase.contains("sexo") || frase.contains("sexual")) {
            System.out.println("conteúdo impróprio");
        } else {
            System.out.println("conteúdo liberado");
        }
    }
}

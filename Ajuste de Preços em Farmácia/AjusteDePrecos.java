import java.util.Scanner;

public class AjusteDePrecos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float preco;

        while (true) {
            System.out.print("Digite o preço de um produto (Digite 0 para sair): ");
            preco = entrada.nextFloat();

            if (preco == 0) break;

            float novoPreco = (float) Math.round(preco + (preco * 0.12));
            System.out.println("Novo preço: " + novoPreco);
        }
    }
}

public class GeradorDeSenhas {
    public static void main(String[] args) {
        int numDigitos = (int) (Math.random() * 6) + 5;

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < numDigitos; i++) {
            int digito = (int) (Math.random() * 10);
            senha.append(digito);
        }
        System.out.println(senha.toString());
    }
}

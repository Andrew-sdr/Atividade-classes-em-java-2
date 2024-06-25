import java.util.Scanner;

public class CalculadoraDePotencia {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Digite a base do numero: ");
      float base = entrada.nextFloat();
      
      System.out.print("Digite o expoente do numero: ");
      float expoente = entrada.nextFloat();

      float resultado = (float) Math.pow(base, expoente);
      System.out.print("Resultado: " + resultado);
    }
}

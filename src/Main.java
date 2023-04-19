import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(100);
        Scanner dados = new Scanner(System.in);
        System.out.println(aleatorio);
        int tentativas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("""
                    Digite o numero que possivelmente apareça: """);
            int numero = dados.nextInt();
            System.out.println("Você errou!");

            if (numero == aleatorio) {
                System.out.println("Você acertou");
                break;
            } else if (numero > aleatorio) {
                System.out.println("O numero digitado é maior que o numero aleatorio");
            } else {
                System.out.println("O numero digitado é menor que o numero aleatorio");
            }
        }
    }
}


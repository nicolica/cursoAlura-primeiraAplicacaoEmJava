import java.util.Random;
import java.util.Scanner;

public class JoogoDeAdivinhacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        String mensagemInicial = """
                Bora jogar o jodo da adivinhação?
                Tente advinhar o número de escolhemos de 0 a 100 em até 5 tentativa.
                
                Vamos começar, digite um número:
                """;

        System.out.println(mensagemInicial);

        while (tentativas <=5){

            int numeroDoJogador = scanner.nextInt();
            tentativas++;

            if (numeroDoJogador == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em "+ tentativas + "tentativas!");
                break;
            }

            if (tentativas == 5) {
                System.out.println("Poxa, você não conseguiu adivinhar o número em 5 tentativas. O número era o: " + numeroAleatorio);
                break;
            }

            if (numeroDoJogador < numeroAleatorio){
                System.out.println("O número digitado é maior que o número gerado.");
            }

            if (numeroDoJogador > numeroAleatorio){
                System.out.println("O número digitado é menor que o número gerado.");
            }

        }










    }
}

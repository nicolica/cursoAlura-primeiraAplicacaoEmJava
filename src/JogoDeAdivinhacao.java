  //Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
 // em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(50);
        int tentativas = 0;
        String mensagemInicial = """
                Bora jogar o jodo da adivinhação?
                Tente advinhar o número de escolhemos de 0 a 50 em até 5 tentativa.
                
                Vamos começar, digite um número:
                """;

        System.out.println(mensagemInicial);

        while (tentativas <=5){

            int numeroDoJogador = scanner.nextInt();
            tentativas++;

            if (numeroDoJogador == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número!");
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

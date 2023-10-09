import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {

            System.out.println("Diga a sua avaliação referente ao filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++; // ++ significa somar a variavel mais 1, poderia usar também (+= 1;)
            }
        }

        System.out.println("Média de avaliações: " + mediaAvaliacao/totalDeNotas);
    }
}

import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String nome = "Nicoli Carvalho";
        String tipoConta = "Corrente";
        double saldo = 5000.00;
        int opcao = 0;
        String mensagem = """
                ******************************************
                Dados iniciais do cliente
                
                Nome:                %s
                Tipo da Conta:       %s
                Saldo inicial:       %.2f
                ******************************************
                """.formatted(nome, tipoConta, saldo); // método formatted do Text Blocks

        System.out.println(mensagem);

        String menu = """
                Operações
                                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de " + saldo);

            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                double valorReceber = leitura.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atualizado " + saldo);

            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double valorTransferir = leitura.nextDouble();

                if (valorTransferir > saldo) {
                    System.out.println("Não há saldo para realizar a transferência. :(");
                } else {
                    saldo -= valorTransferir;
                    System.out.println("Saldo atualizado " + saldo);

                }
            } else if (opcao != 4) {
                System.out.println("Opção Invalida");
                
            }
        }
    }
}
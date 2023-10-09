
     // Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. Utilize variáveis para representar os valores das temperaturas e
    // imprima no console o valor convertido de Celsius para Fahrenheit.
   // Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para exibir a temperatura em
  //  Fahrenheit sem casas decimais. Lembre-se que provavelmente você precisará fazer um casting de valores.

public class DesafioTemperatura {
    public static void main(String[] args) {

        double temperatura = 30.4;
        int fahrenheit = (int) ((temperatura * 1.8) + 32);
        String mensagem = """
                A temperatura está 30.4º Celsius
                Convertendo para Fahrenheit fica:
                """;
        System.out.println(mensagem +fahrenheit);
    }
}

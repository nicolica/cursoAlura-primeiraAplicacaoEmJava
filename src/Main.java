public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Nicoli Flix");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de Lançamento: " + ano);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota do Filme: " +notaDoFilme);

        String sinopse = """
                        Filme de aventura com galã dos anos 80
                        Muito bom!
                        Você vai gostar!
                        """;
        System.out.println("Sinopse do filme: " +sinopse);

        int classificacao = (int) (notaDoFilme /2);
        System.out.println("Estrelas do filme de 0 a 5: " +classificacao);
    }
}

// Esta é uma linha de comentário que será ignorada pelo compilador

/* Este é um exemplo de comentário
de várias linhas em Java
que será ignorado pelo compilador */
package exercicios.metodos;

public class Main {

    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercicios calculadora");
        Calculadora.soma(10, 9);
        Calculadora.subtracao(30, 7);
        Calculadora.multiplicacao(90, 76);
        Calculadora.divisao(5, 25);

        System.out.println(); //pular linha

        //mensagem
        System.out.println("Exercicios mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(99);

        System.out.println(); //pular linha

        //emprestimo
        System.out.println("Exercicios Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1479, 2);
        Emprestimo.calcular( 107, 3);
        Emprestimo.calcular(795, 8);

    }

}

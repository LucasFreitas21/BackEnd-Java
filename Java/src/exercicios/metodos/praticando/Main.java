package exercicios.metodos.praticando;

public class Main {

    public static void main(String[] args) {

        //calculadora
        System.out.println("Praticando Calculadora");
        Calculadora.soma(4, 8);
        Calculadora.multiplicacao(3, 7);
        Calculadora.divisao(56, 8000);
        Calculadora.subtracao(70, 23);

        System.out.println(); // pular linha

        //mensagem
        System.out.println("Praticando Mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(80);

    }
}

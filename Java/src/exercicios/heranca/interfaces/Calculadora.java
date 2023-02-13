package exercicios.heranca.interfaces;

public class Calculadora implements Operacaomatematica {

    @Override
    public void soma(double operador1, double operador2) {
        System.out.println("Soma: " + (operador1 + operador2));
    }  @Override
    public void subtracao(double operador1, double operador2) {
        System.out.println("Subtracão: " + (operador1 - operador2));
    }  @Override
    public void multiplicacao(double operador1, double operador2) {
        System.out.println("Multiplicacão: " + (operador1 * operador2));
        }  @Override
      public void divisao(double operador1, double operador2) {
        System.out.println("Divisão: " + (operador1 + operador2));
    }
}

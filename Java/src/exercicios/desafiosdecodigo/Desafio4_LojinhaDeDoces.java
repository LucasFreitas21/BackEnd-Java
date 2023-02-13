package exercicios.desafiosdecodigo;

import java.util.Scanner;

/*
Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. Para aumentar as vendas o dono resolveu
colocar uma máquina onde os clientes, principalmente as crianças que estão muito acostumadas com a tecnologia,
poderiam colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios.
Entrada
A entrada será a quantidade de dinheiro que cada cliente, um por vez, possui.
Saída
A saída deverá ser a quantidade de doces que cada cliente conseguiu obter.
 */
public class Desafio4_LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dinheiro = scan.nextInt();
        int doce = 2;

        int resultado = dinheiro * doce;

        System.out.println("O cliente obteve " + resultado + " doces");
    }
}

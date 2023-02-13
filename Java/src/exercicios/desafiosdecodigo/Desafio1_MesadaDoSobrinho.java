package exercicios.desafiosdecodigo;

import java.util.Scanner;
/*
Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos recebendo 50 reais por mês,
ele quer saber quanto terá se juntar todo o dinheiro, sem gastar nada, durante alguns meses.
E você, como um bom tio com habilidades de programação, vai criar um programa que com as entradas do seu sobrinho
vai calcular automaticamente a quantidade de dinheiro que ele terá em X meses.
 */
public class Desafio1_MesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mesada = 50;
        int mes = 0;


            System.out.println("Quantos meses acumulados? ");
            mes = scan.nextInt();
            int multiplica = mes * mesada;
            System.out.println("Seu saldo é de: " + multiplica);

    }
}

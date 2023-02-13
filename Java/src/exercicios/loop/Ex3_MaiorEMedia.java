package exercicios.loop;

import java.util.Scanner;
/*
Faça um programa que leia 5 números e informe o maior número
e a média desses números.
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
//      int media; para coletar a média, precisamos somar todos os números e dividir pela quantidade de números informado, no caso, 5.
        int soma = 0;
        int count = 0;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            count  = count + 1;
//          System.out.println("Maior é: " + maior);  Colocando o maior após a contagem, ele vai validar qual seria o maior número todas as vezes que adicionar um novo dado.
        } while(count < 5);

        System.out.println("Maior é: " + maior); // informar o maior número apenas após informar os 5 números solicitados.
        System.out.println("A Média é: " + (soma / 5));

    }
}

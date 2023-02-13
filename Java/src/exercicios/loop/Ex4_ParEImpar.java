package exercicios.loop;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();
                                            // irei criar um laço onde vai pedir números inteiros de acordo com a quantidade de números que informei em "quantNumeros"
        int count = 0;                      // Vai contar quantas vezes o laço vai se repetir
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++; // Se o resto da divisão da variavel numero for 0, o número é par.
            else quantImpares++;

            count++;                        // Se não colocar o contador, fica em loop infinito
        } while (count < quantNumeros); // aqui vai ser o limite/quantidade que informei em "quatnúmeros".

        System.out.println("Quantidade de Par é: " + quantPares);
        System.out.println("Quantidade de Ímpar é: " + quantImpares);
    }

}



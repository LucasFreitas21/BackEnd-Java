package exercicios.arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatórios ente 0 e 100
e armazene-os num vetor.
Ao final, mostre os números e seus sucessorires.
 */
//existe na java uma classe chamada random que gera números aleatorios
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++ ) {
            int numero = random.nextInt(100);
            numerosAleatorios [i] = numero;
        }
        // extra: antecessor dos números aleatórios
        System.out.println("Antecessor dos números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print((numero - 1) + ", ");
        }
        System.out.println("\nNúmeros aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + ", ");
        }
        System.out.println("\nSucessor dos números aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print((numero + 1) + ", ");
        }
    }
}


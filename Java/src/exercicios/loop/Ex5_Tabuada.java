package exercicios.loop;

import java.util.Scanner;
/*
Desenvolva um gerador de yabuada,
Capaz de gerar tabuada de qualquer número inteiro entre 1 a 10.
o usuário deve informar qual número ele deseja ver a tabiada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));

        }


    }
}

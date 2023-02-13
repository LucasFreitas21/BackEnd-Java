package exercicios.loop;

import java.util.Scanner;
/*
Faça um fatoriaç que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 x 4 x 3 x 2 x 1 = 120)
 */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int fatorial = scan.nextInt();



        System.out.print(fatorial + "! = ");

        int multiplicacao = 1;

        for(int i = fatorial; i >=1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);

    }
}

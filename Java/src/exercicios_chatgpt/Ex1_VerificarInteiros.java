package exercicios_chatgpt;

/*
Desafio: Escreva um programa que imprima todos os números inteiros de 1 a 100. Para cada número impresso, se ele for
divisível por 3, imprima "Fizz" ao invés do número, e se for divisível por 5, imprima "Buzz" ao invés do número.
Se o número for divisível por ambos, 3 e 5, imprima "FizzBuzz".
Dica: Para verificar se um número é divisível por outro, você pode usar o operador de módulo (%) no Java.
 */
public class Ex1_VerificarInteiros {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else if (i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}


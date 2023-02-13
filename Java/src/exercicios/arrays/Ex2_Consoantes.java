package exercicios.arrays;

import java.util.Scanner;

/*
faça um programa que leia um vetor de 6 caracteres
e diga quantas consuantes foram lidas.
Imprimas as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Uma string é um objeto
        String[] consoantes = new String[6]; // Criando um String e definindo o seu tamanho
        //Vou criar uma variavel para ler quantas consoantes foram lidas
         int quantidadeConsoantes = 0;

         int count = 0;
         do{
             System.out.println("Letra: ");
             String letra = scan.next();

             if (!(letra.equalsIgnoreCase("a") |
                     letra.equalsIgnoreCase("e") |
                     letra.equalsIgnoreCase("i") |
                     letra.equalsIgnoreCase("o") |
                     letra.equalsIgnoreCase("u") ) ) {
                 consoantes[count] = letra;
                 quantidadeConsoantes++;
             }

             count++;

         } while (count < consoantes.length);// definir até quando eu quero que esse laço se repita

        System.out.println("Consoantes: ");

        for (String consoante: consoantes) { // para cada elemento dentro desse meu array de consoantes,
            // quero que imprima esse elemento.
            if (consoante != null) // para não imprimir null no resultado
                System.out.print(consoante + ",");
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);


    }
}


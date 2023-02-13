package exercicios.arrays;
/*
Crie um vetor de 6 números inteiros e mostreos na ordem inversa.
 */
public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {9, -5, 10, 6, -80, 1};

        System.out.println("vetor: ");

        int count = 0;

        while(count < (vetor.length)) { // propriedade lenght retorna o tamanho do nosso array.
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nvetor: ");
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
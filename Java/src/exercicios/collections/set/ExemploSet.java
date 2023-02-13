package exercicios.collections.set;

import javax.sound.midi.Soundbank;
import java.util.*;

/*
Treinando metodos - Set

1 - Crie um conjunto e adicione as notas
2 - Exiba a posição da nota 5.0 // Não tem como trabalhar com posição utilizando set
3 - Adicione na lista a nota 8.0 na posição 4 // Não tem como trabalhar com posição utilizando set
4 - Substitua a nota 5.0 pela nota 6.0 //  não é possivel utilizando set
5 - Confira se a notas 5.0 está na lista
6 - Exiba a terceira nota adicionada // Não tem como trabalhar com posição utilizando set
7 - Exiba a menor nota
8 - Exiba a maior nota
9 - Exiba a soma dos valores
10 - Exiba a média das notas
11 - Remova a nota 0
12 - Remova a nota na posição 0
13 - Remova as notas menores que 7.0 e exiba a lista
14 - Exiba todas as notas na ordem em que foram informadas
15 - Exiba todas as notas na ordem crescente
16 - Apague todo o conjunto
17 - confira se o conjunto está vazio




 */
public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        // System.out.println("Exiba a posição da nota 5.0: "); // Não tem metodo para verificar posição e SET agrupa de forma aleatoria os itens.
        // System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // Não tem como trabalhar com posição utilizando set
        // System.out.println("Substitua a nota 5.0 pela nota 6.0:" ); //
        System.out.println("Confira se a notas 5.0 está na lista: " + notas.contains(5d)); // vai me retornar um valor booleano de acordo com a verificação
        // System.out.println("Exiba a terceira nota adicionada: "); //Não tem como trabalhar com posição utilizando set

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterador1 = notas.iterator();
        Double soma = 0d;
        while (iterador1.hasNext()){
            Double next = iterador1.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // System.out.println("Remova a nota da posição 0: "); //Não tem como trabalhar com posição utilizando set
        System.out.println("Remova as notas menores que 7 e exiba na lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7 ) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: "); // necessário usar treeset, devido organizar as coisa de acordo com a ordem natural dos elementos.
        Set<Double> notas3 = new TreeSet<>(notas2); // TreeSet tem comparable
        System.out.println(notas3);

       System.out.println("Apague todo o conjunto: ");
       notas.clear();
        System.out.println(notas);

       System.out.println("Confira seo conjunto está vazio: " + notas.isEmpty());




    }
}

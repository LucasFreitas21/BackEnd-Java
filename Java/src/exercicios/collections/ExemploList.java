package exercicios.collections;

import java.util.*;

/*
dica: alt + enter  = imports
Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        1 - Crie uma lis e adicione as 7 notas
        2 - Exiba a posição da nota 5.0
        3 - Adicione na lista a nota 8.0 na posição 4
        4 - Substitua a nota 5.0 pela nota 6.0
        5 - Confira se a notas 5.0 está na lista
        6 - Exiba todas as notas na ordem em que fora informados
        7 - Exiba a terceira nota adicionada
        8 - Exiba a menor nota
        9 - Exiba a maior nota
        10 - Exiba a soma dos valores
        11 - Exiba a média das notas
        12 - Remova a nota 0
        13 - Remova a nota na posição 0
        14 - Remova as notas menores que 7.0 e exiba a lista
        15 - Apague toda a lista
        16 - Confira se a lista está vazia
 */
public class ExemploList {
    public static void main(String[] args) {
        //formas de criar uma lista
       // List notas = new ArrayList(); // antes do java 5
      //  List<Double> notas = new ArrayList<Double>(); // Generics(jdk5) - Diamont Operator (jdk 7)
      // ArrayList<Double> notas = new ArrayList<>(); // Instânciando, não é recomendado.
     //   List <Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5, 7, 0d, 3.6)); // Instânciando e passando a lista.
    /*
       List <Double> notas = Arrays.asList(7d, 8.5, 9.3, 5, 7d, 0d, 3.6);
        notas.add(10d);// Limitado pois não posso mais add ou remover itens dessa lista.
        System.out.println(notas);

     */
        /*
        List <Double> notas = List.of(7d, 8.5, 9.3, 5, 7d, 0d, 3.6);
        notas.add(1d); // Limitado pois não posso mais add ou remover itens dessa lista.
        notas.remove(o:5d);// Limitado pois não posso mais add ou remover itens dessa lista.
        System.out.println(notas);
         */

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>(); // criando lista.
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(8d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // Vamos passa o objeto "notas" e ele vai retornar o indice (posição).

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        // usaremos o mesmo argumento que adicionar, mas passando a posição (int i) e o elemento (Double e);
        notas.add(4, 8d);// usaremos o mesmo argumento que adicionar, mas passando a posição (int i) e o elemento (Double e).
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d); // indexOf para saber a posição.
        System.out.println(notas);

        System.out.println("Confira se a notas 5.0 está na lista: " + notas.contains(5d)); // Contains é para verificar. informo o objeto e ele me retorna um boolean.

        System.out.println("Exiba todas as notas na ordem em que fora informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // metoddo get, passamos a posição e recebemos o elemento.

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // A list é uma collection, então eu passo ela como parametro da collection.min
        //não existe um metodo nativo em list para verificar o menor ou maior.

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); // Mesmo procedimento da min., porém, informando max em collections.

        System.out.print("Exiba a soma dos valores: "); // ctrl+alt+v = tria uma variavel
        Iterator<Double> iterator = notas.iterator(); // Vai coletar todos os meus dados e ir iterando dentro da lista.
        Double soma = 0d;
        while (iterator.hasNext()){ // cria um laço de repetição
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size())); // Size vai retornar um inteiro que é a quantidade de elementos (tamanho).

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); // Método para remover
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear(); // Metodo para apagar todos os dados
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // Boolean de verificação se está vazio



        }

    }




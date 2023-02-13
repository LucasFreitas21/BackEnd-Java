package exercicios.collections;

import java.util.LinkedList;
import java.util.List;

/*
Resolva esse exercícios utilizando os métodos da implementação LinkedList.

1 - Crie uma lista chamada notas2
2 - Mostre a primeira nota na nova lista sem removê-lo
3 - Mostre a primeira nota da nova lista removendo-o
 */
public class DesafioList_Notas {

    public static void main(String[] args) {
        List<Double> notas2 = new LinkedList<Double>();
        notas2.add(4d);
        notas2.add(8.1);
        notas2.add(2.6);
        notas2.add(3d);
        notas2.add(9d);
        notas2.add(7.4);
        notas2.add(1.3);
        notas2.add(0d);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota na nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        Double remove = notas2.remove(0);
        System.out.println(remove);
    }
}

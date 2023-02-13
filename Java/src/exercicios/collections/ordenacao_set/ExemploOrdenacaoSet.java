package exercicios.collections.ordenacao_set;

import java.util.*;

/*
Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(NMome - Genero - Tempo de episodio);

Segue 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Segue 1 = Nome: dark, genero: drama, tempoEpisodio: 60
Segue 1 = Nome: the office, genero: comédia, tempoEpisodio: 25
 */
public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("theOffice", "comédia", 25));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("theOffice", "comédia", 25));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1); // precisa criar um camparable
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());


        System.out.println("--\tOrdem nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        //teste
        /*
        System.out.println("--\tOrdem gênero\t--");

        System.out.println("--\tOrdem TempoEpisodio\t--");
         */



    }
           static class Serie implements Comparable<Serie> {
                private  String nome;
                private  String genero;
                private  Integer tempoEpisodio;

                public Serie(String nome, String genero, Integer tempoEpisodio) {
                    this.nome = nome;
                    this.genero = genero;
                    this.tempoEpisodio = tempoEpisodio;
                }

                public String getNome() {
                    return nome;
                }

                public String getGenero() {
                    return genero;
                }

                public Integer getTempoEpisodio() {
                    return tempoEpisodio;
                }

                @Override
                public String toString() {
                    return "{" +
                            "neome='" + nome + '\'' +
                            ", genero='" + genero + '\'' +
                            ", tempoEpisodio=" + tempoEpisodio +
                            '}';
                }

                @Override
                public boolean equals(Object o) {
                    if (this == o) return true;
                    if (o == null || getClass() != o.getClass()) return false;
                    Serie serie = (Serie) o;
                    return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
                }

                @Override
                public int hashCode() {
                    return Objects.hash(nome, genero, tempoEpisodio);
                }

               @Override
               public int compareTo(Serie serie) { //criando critério para o set retornar 2 valores iguais.
                    int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
                    if (tempoEpisodio != 0) return tempoEpisodio;
                    return this.getGenero().compareTo(serie.getGenero());
               }
           }
        static class ComparatorNomeGeneroTempoEpisodio implements Comparator <Serie> {

            @Override
            public int compare(Serie s1, Serie s2) {
               int nome = (s1.getNome().compareTo(s2.getNome()));
                if (nome != 0) return nome;

                int genero = (s1.getGenero().compareTo(s2.getGenero()));
                if (genero != 0) return genero;


                return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
            }
        }
}

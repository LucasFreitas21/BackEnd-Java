package exercicios.sobrecargas;

public class Main {

    public static void main(String[] args) {

        //quadrilatero
        System.out.println("Exercicios quadrilatero: ");
        Quadrilatero.area(10);
        Quadrilatero.area(5d, 7d); // identificado como double
        Quadrilatero.area(4,7,9);
        Quadrilatero.area(4f, 6f); // identificado como float, para evitar conflito devido já conter um método com 2 parâmetros

    }


}

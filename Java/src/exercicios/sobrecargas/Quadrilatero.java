package exercicios.sobrecargas;

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retândulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio: " + ((baseMaior * baseMenor) * altura) / 2);
    }

    public static void area(float losango1, float losango2) {

        System.out.println("Área do losango: " + losango1 * losango2);
    }
}
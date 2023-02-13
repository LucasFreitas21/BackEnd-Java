package exercicios.metodos;

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.28;
    }
    public static double getTaxaTresParcelas(){
        return 0.41;
    }

    public static void calcular (double valor, int parcela) {


        if (parcela == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("O valor do emprestimo em duas parcelas é: " + valorFinal);
        } else if (parcela == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("O valor do emprestimo em três parcelas é: " + valorFinal);
        } else {
            System.out.println("Quantidade de parcela não disponível");
        }
    }

}

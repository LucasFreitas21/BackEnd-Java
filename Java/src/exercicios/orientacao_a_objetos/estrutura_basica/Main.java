package exercicios.orientacao_a_objetos.estrutura_basica;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

       carro1.setCor("Preto");
       carro1.setModelo("Fusca");
       carro1.setCapacidadeTanque(40);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.59));

        System.out.println(); // Pular linha

        Carro carro2 = new Carro();
        carro2.setCor("Rosa");
        carro2.setModelo("Supra");
        carro2.setCapacidadeTanque(46);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.80));

        System.out.println(); // Pular linha

        Carro carro3 = new Carro("verde", "mazda", 50);
        System.out.println(carro3.getCor());
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getCapacidadeTanque());
        System.out.println(carro3.totalValorTanque(5.80));
    }

}

package exercicios.orientacao_a_objetos.estrutura_basica;

/*
Ex1_Classe
Classe de exemplo para o exercicios da aula 3 de orientação a objetos.
 */

public class Carro {

//Ex2_ atributos: defina 3 atributos par a classe "carro".
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor aqui (Sempre a baixo dos atributor, depois os get/sets

    Carro () {

    }
    Carro (String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    /*Ex3_ Defina um metodo para calcular o valor total para encher o tanque. Este deve receber como parametro o valor
    da gasolina. Faça também duas sobrecargas do construtor e crie metodos especificos para obter os valores dos
    atributos get/set.

    */

    void setCor (String cor){
        this.cor = cor;
    }
    void setModelo (String modelo) {
        this.modelo = modelo;
    }

    void setCapacidadeTanque (int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor(){
        return cor;
    }

    String getModelo(){
        return modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    double totalValorTanque(double valorGasolina) {
        return capacidadeTanque * valorGasolina;
    }

}

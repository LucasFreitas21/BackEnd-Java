package exercicios.heranca.polimorfismo_sobrescrita;

public class ClasseFilha1 extends ClasseMae {

    @Override // palavra reservada para sobrescrever
    void metodo1() {
        System.out.println("Método 1 da classe Filha 1");
    }

}

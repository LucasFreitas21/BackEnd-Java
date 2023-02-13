package exercicios.heranca.upcast_downcast;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // instanciei a classe.

        //Realizar Upcasts (implicito) - Facilita o polimorfismo.
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new  Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast (evitar em P.O.O)
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}

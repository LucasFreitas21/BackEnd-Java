package exercicios.heranca.polimorfismo_sobrescrita;

public class Main {

    public static void main(String[] args) {
        //Criar um vetor
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
        //Sobrescrita com polimorfismo
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }
        System.out.println("");

        for (ClasseMae classe : classes) {
            classe.metodo2();
        }
        System.out.println("");

        //Sobrescrita "pura"
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}

package classes.banco;

public class DemoContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Arthur");
        System.out.println(conta1);
        ContaBancaria conta2 = new ContaBancaria("Arthur", 1244.20, true);
        System.out.println(conta2);
    }
}

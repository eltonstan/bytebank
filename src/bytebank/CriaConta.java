package bytebank;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        // aqui ambas as contas apontam para a mesma referencia
        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        
        System.out.println("Referencia " + primeiraConta);
        System.out.println("Referencia " + segundaConta);
        
        System.out.println("valor default que o java cria automaticamente " + segundaConta.agencia);

    }
}
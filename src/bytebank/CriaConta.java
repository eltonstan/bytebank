package bytebank;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(100, 100);
        primeiraConta.deposita(200);
        System.out.println(primeiraConta.getSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.getSaldo());

        // aqui ambas as contas apontam para a mesma referencia
        Conta segundaConta = primeiraConta;
        segundaConta.deposita(50);

        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());
        
        System.out.println("Referencia " + primeiraConta);
        System.out.println("Referencia " + segundaConta);
        
        System.out.println("valor default que o java cria automaticamente " + segundaConta.getAgencia());

    }
}
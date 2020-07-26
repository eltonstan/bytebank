package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println("Saldo inicial: " + conta.getSaldo());
		conta.deposita(50);
		System.out.println("Depositou 50, saldo: " + conta.getSaldo());
		boolean conseguiuRetirar = conta.saca(100);
		System.out.println("tentou sacar 100, conseguiu? " + conseguiuRetirar +", saldo:" + conta.getSaldo());
		conseguiuRetirar = conta.saca(100);
		System.out.println("tentou sacar 100, conseguiu? " + conseguiuRetirar +", saldo:" + conta.getSaldo());
		
		Conta conta2 = new Conta();
		conta2.deposita(10);
		System.out.println("Saldo conta1: " + conta.getSaldo() + " saldo conta2: " + conta2.getSaldo());
		
		if(conta.transfere(30, conta2)) {
			System.out.println("Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.getSaldo() + ", saldo conta2: " + conta2.getSaldo());	
		} else {
			System.out.println("Não Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.getSaldo() + ", saldo conta2: " + conta2.getSaldo());
		}
		
		if(conta.transfere(30, conta2)) {
			System.out.println("Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.getSaldo() + ", saldo conta2: " + conta2.getSaldo());	
		} else {
			System.out.println("Não Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.getSaldo() + ", saldo conta2: " + conta2.getSaldo());
		}
		
	}

}

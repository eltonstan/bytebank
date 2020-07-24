package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		System.out.println("Saldo inicial: " + conta.saldo);
		conta.deposita(50);
		System.out.println("Depositou 50, saldo: " + conta.saldo);
		boolean conseguiuRetirar = conta.saca(100);
		System.out.println("tentou sacar 100, conseguiu? " + conseguiuRetirar +", saldo:" + conta.saldo);
		conseguiuRetirar = conta.saca(100);
		System.out.println("tentou sacar 100, conseguiu? " + conseguiuRetirar +", saldo:" + conta.saldo);
		
		Conta conta2 = new Conta();
		conta2.saldo = 10;
		System.out.println("Saldo conta1: " + conta.saldo + " saldo conta2: " + conta2.saldo);
		
		if(conta.transfere(30, conta2)) {
			System.out.println("Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.saldo + ", saldo conta2: " + conta2.saldo);	
		} else {
			System.out.println("Não Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.saldo + ", saldo conta2: " + conta2.saldo);
		}
		
		if(conta.transfere(30, conta2)) {
			System.out.println("Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.saldo + ", saldo conta2: " + conta2.saldo);	
		} else {
			System.out.println("Não Conseguiu transferir 30 da conta 1 pra 2, saldo conta1: " + conta.saldo + ", saldo conta2: " + conta2.saldo);
		}
		
	}

}

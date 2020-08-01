package bytebank;

public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		System.out.println("Agencia: " + conta.getAgencia() + " Numero: " + conta.getNumero());
		System.out.println("Total de contas: " + Conta.getTotal());
		
		Conta conta2 = new Conta(1338, 24227);
		System.out.println("Agencia: " + conta2.getAgencia() + " Numero: " + conta2.getNumero());
		System.out.println("Total de contas: " + Conta.getTotal());
		
	}

}

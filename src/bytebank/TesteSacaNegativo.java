package bytebank;

public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(100, 100);
		conta.deposita(100.0);
		conta.saca(200.0);
		System.out.println(conta.getSaldo());
		
	}

}

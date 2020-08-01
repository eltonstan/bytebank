package bytebank;

public class TestaBanco {
	
    public static void main(String[] args) { 
        Cliente paulo = new Cliente(); 
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("222.222.222-22");
        paulo.setProfissao("programador");

        Conta contaDoPaulo = new Conta(100, 100); 
        contaDoPaulo.deposita(100);

        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getSaldo());
        System.out.println(contaDoPaulo.getTitular().getNome());
        System.out.println(contaDoPaulo.getTitular());
    }

}

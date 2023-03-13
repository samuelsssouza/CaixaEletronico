public class Main
{
	public static void main(String[] args) {
		Banco bradesco = new Banco();
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();
		Cliente cliente5 = new Cliente();
		Cliente cliente6 = new Cliente();
		Cliente cliente7 = new Cliente();
		
		cliente1.setNome("Samuel");
		cliente1.setCartao("ade2396");
		cliente1.setSenha(12345);
		cliente1.setDinheiro(103.23);
		
		cliente2.setNome("Eliseu");
		cliente2.setCartao("ad4444");
		cliente2.setSenha(123456);
		cliente2.setDinheiro(323.23);
		
		cliente3.setNome("Paulo");
		cliente3.setCartao("d333444");
		cliente3.setSenha(987654);
		cliente3.setDinheiro(543.60);
		
		cliente4.setNome("Larissa");
		cliente4.setCartao("hhh33");
		cliente4.setSenha(1234);
		cliente4.setDinheiro(90.45);
		
		cliente5.setNome("Bea");
		cliente5.setCartao("12333");
		cliente5.setSenha(1266);
		cliente5.setDinheiro(75.0);
		
		cliente6.setNome("Adm");
		cliente6.setCartao("54323");
		cliente6.setSenha(4322);
		cliente6.setDinheiro(235.0);
		
		cliente7.setNome("Sudosu");
		cliente7.setCartao("14233");
		cliente7.setSenha(8234);
		cliente7.setDinheiro(794.0);
		
	bradesco.adicionar(cliente1, cliente2,cliente3,cliente4,cliente5,cliente6, cliente7);
	CaixaEletronico caixa = new CaixaEletronico(5);
	caixa.identificarCliente("12333",1266,bradesco);
		
	//	itau.remover(cliente1);
	// System.out.println("Você foi removido " + cliente1.getNome());
		 
		
	}   
}
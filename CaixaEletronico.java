
import java.util.Scanner;
public class CaixaEletronico{
	 Scanner scan = new Scanner(System.in);
    private int saldoCaixa;
    private int n2,n5,n10,n20,n50,n100;
    private int senha;
    private String cartao;
    private Cliente cliente;
    private Banco  banco;
    private double transferencia;
    private double dinheiro;
    int o;
    public CaixaEletronico(int qtd){
        n2=qtd;
        n5=qtd;
        n10=qtd;
        n20=qtd;
        n50=qtd;
        n100=qtd;
        calcularSaldoCaixa();
        
    }
    
    private void calcularSaldoCaixa(){
        saldoCaixa = (n2*2+n5*5+n10*10+n20*20+n50*50+n100*100);
        System.out.println("O saldo do CaixaEletronico é: "+saldoCaixa);
    }
    public void identificarCliente(String cartao, int senha, Banco  banco){
        this.cartao = cartao;
        Scanner scan = new Scanner(System.in);
        this.senha = senha;
        this.banco = banco;
        
        
        cliente = banco.consultarCliente(this.cartao, this.senha);
        if(cliente == null){
            System.out.println("Cliente ou senha não identificado");
        }
        else {
            int op;
            System.out.println("Seja bem vindo "+cliente.getNome());
            do{
                System.out.println("Digite 1 para consultar seu dinheiro, 2 para transferência/Pix, 3 para deposito ou -1 para sair");    
                op = scan.nextInt();
                if(op == 1){
                    System.out.println("Estamos trabalhando apenas com saldo em tela");
                    System.out.println("Seu dinheiro é: "+consultar());
                }
                else if(op == 2){
                	 transferencia(op);
                    
                }
                else if(op == 3) {
                	deposito(op);
                }
            }while(op!=-1);
            
        }
        
        
    }

    private double deposito(double deposito) {
        do {
        	System.out.println("Para Quem você deseja fazer o Deposito?");
        	System.out.println("(1) Samuel  (2) Eliseu (3) Paulo");
            System.out.println("(4) Larissa (5) Bea  (6) Adm  7 (Sudosu)");
            dinheiro = scan.nextInt();
            System.out.println("Digite o valor do Deposito: ");
    		deposito = scan.nextInt();
    		if(transferencia > 1000 || transferencia > saldoCaixa){
                System.out.println("Valor de saque excedido ou caixa sem notas suficientes!");
            }
    		 else{
    	            
    	            cliente.setDinheiro(cliente.getDinheiro() - deposito);
    	            saldoCaixa -= deposito;
    	            
    	        }
            System.out.println("Deseja continuar? (1) sim (2) não: ");
            transferencia = scan.nextInt();
            }while(o == 2);
        return transferencia;
        }
    
    
    private double transferencia(double transferencia) {
    do {
    	System.out.println("Para quem deseja fazer a transferência?");
    	System.out.println("(1) Samuel  (2) Eliseu (3) Paulo");
        System.out.println("(4) Larissa (5) Bea (6) Adm  7 (Sudosu) ");
        dinheiro = scan.nextInt();
        System.out.println("Digite o valor da transferência: ");
		transferencia = scan.nextInt();
		if(transferencia > 1000 || transferencia > saldoCaixa){
            System.out.println("Valor de saque excedido ou caixa sem notas suficientes!");
        }
		 else{
	            
	            cliente.setDinheiro(cliente.getDinheiro() - transferencia);
	            saldoCaixa -= transferencia;
	            
	        }
        System.out.println("Deseja continuar? (1) sim (2) não: ");
        transferencia = scan.nextInt();
        }while(o == 2);
    return transferencia;
    }
    	
        
    	
    
    private double consultar(){
         if(cliente == null || banco ==null){
            System.out.println("Cliente não identificado, favor executar identificarCliente()");
        }
        
        
        return cliente.getDinheiro();
        
        
        
    }
    
    
}
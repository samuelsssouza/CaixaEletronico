import java.util.ArrayList;

public class Banco{
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    public void adicionar(Cliente cliente1){
        clientes.add(cliente1);
    }
    
    public void adicionar(Cliente cliente1,Cliente cliente2,Cliente cliente3,Cliente cliente4,Cliente cliente5,Cliente cliente6,Cliente cliente7){
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        clientes.add(cliente6);
        clientes.add(cliente7);
    }
    
    public void remover(Cliente cliente1){
        clientes.remove(cliente1);
    }
    
    public double consultarDinheiro(Cliente cliente1){
        return 0.0;
    }
    
    public Cliente consultarCliente(String cartao, int senha){
        Cliente cliente1;
       for(int i=0; i<clientes.size(); i++){
           cliente1 = clientes.get(i);
           
           if(cliente1.getCartao()==cartao){
               if(cliente1.getSenha()==senha){
                   return cliente1;
               }
           }
       }
       return null;
    }
    
}
public class Cliente{
    private String nome;
    private String cartao;
    private int senha;
    private double dinheiro;
    
    public void setNome(String nome){
        this.nome = nome;
        
    }
    public String getNome(){
        return nome;
    }
    public void setCartao(String cartao){
        this.cartao = cartao;
        
    }
    public String getCartao(){
        return cartao;
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public int getSenha(){
        return senha;
    }
    
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
    
    public double getDinheiro(){
        return dinheiro;
    }
    
}
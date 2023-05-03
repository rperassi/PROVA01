package prova01;

public interface ContaBanco {
    
    public void Deposita(double valor);
    
    public String Sacar(double valor);
    
    public String Tranferir(Conta conta, double valor);
    
}

package prova01;

public class Conta implements ContaBanco{
    protected double saldo;
    protected double limite;
    
    public void Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }
    
    public void Depositar(double valor){
        this.saldo = valor;
    }
    
    @Override
    public String Sacar(double valor){
        if(valor < (saldo + limite)){
            this.saldo -= valor;
            return "ok";
        }else{
            return "Valor insuficiente";
        }
 
    }
    
    @Override
    public String Tranferir(Conta conta, double valor){
        Sacar(valor);
        conta.Depositar(valor);
        return "OK";
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void atualiza(double taxa){
        saldo = saldo + (saldo*taxa);
    }

    @Override
    public void Deposita(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

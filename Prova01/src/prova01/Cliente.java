package prova01;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    ArrayList<Conta> Contas = new ArrayList<>();
    
    public Cliente(){
        
    }
    
    public void setConta(Conta conta){
        Contas.add(conta);
    }
    
    public ArrayList getConta(){
        return Contas;
    }
    
    public void cadastrarConta(double saldo, double limite){
        Conta conta = new Conta();
        conta.Conta(saldo, limite);
        Contas.add(conta);
    }
    
    
}

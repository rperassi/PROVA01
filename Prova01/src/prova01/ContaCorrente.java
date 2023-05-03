package prova01;

public class ContaCorrente extends Conta{
    
   
   @Override
   public void Depositar(double valor){
        this.saldo = valor - 0.10;
    }
   
   
   @Override
    public void atualiza(double taxa){
        saldo = (saldo + (saldo*taxa))*2;
    }
}

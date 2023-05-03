package prova01;

public class ContaPoupanca extends Conta{
    
    @Override
    public void atualiza(double taxa){
        saldo = (saldo + (saldo*taxa))*3;
    }
    
    
}

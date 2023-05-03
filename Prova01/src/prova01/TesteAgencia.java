package prova01;

public class TesteAgencia {
    public static void main(String[] args) {
        Agencia ag = new Agencia();
        Cliente c1 = new Cliente();
        Conta ct1 = new Conta();
        ct1.limite = 100;
        ct1.saldo = 1500;
        c1.setConta(ct1);
        c1.cpf = "515545";
        c1.email = "hirad@da";
        c1.nome = "Hiro";
        c1.telefone = "18184";
        ag.cadastrarCliente(c1);
        
        Cliente c2 = new Cliente();
        Conta ct2 = new Conta();
        
        ct2.limite = 1000;
        ct2.saldo = 150;
        c2.setConta(ct2);
        c2.cpf = "5145545";
        c2.email = "hioad@da";
        c2.nome = "Rafa";
        c2.telefone = "181854";       
        ag.cadastrarCliente(c2);
        
        System.out.println(ag.valorTotalAgencia());
        
        
    }
}

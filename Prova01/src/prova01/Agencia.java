package prova01;

import java.util.ArrayList;

public class Agencia  {
    
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();
    
    private String nome;
    private String endereco;

    public void CadastrarFuncionarios(Funcionario Funcionarios) {
       funcionarios.add(Funcionarios);
    }

    public void cadastrarCliente(Cliente Clientes) {
        clientes.add(Clientes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double valorTotalAgencia(){
        double total = 0;
        for (Cliente cliente : clientes) {
            for (Conta conta : cliente.Contas) {
                total += conta.getSaldo();
            }
        }
        return total;
    }
    
}

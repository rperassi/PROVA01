package prova01;

public class Gerente extends Funcionario {
    private String senha;
    
    public String cadastrarSenha(String senha){
        
        if(senha.length() <= 5){
            return "Sua senha deve conter no minimo 5 caractere!";
        }else{
            this.senha = senha;
            return "Senha cadastrada com sucesso!";        
        }   
    }
    
    public boolean Autentica(String Senha){
        if(senha.equals(Senha)){
            return true;
        }else{
            return false;
        }   
    }

    @Override
    public void setBonificacao(double salario){
        setSalario(salario * 1.20);
    }
}

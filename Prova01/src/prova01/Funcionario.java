package prova01;
import java.util.Random;

public class Funcionario extends Pessoa {
    private int chapa;
    private double salario;
    
    public Funcionario(){
        Random rand = new Random();
        chapa = rand.nextInt(1001);
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
           this.salario = salario;    
        }         
    }
    
    public void setBonificacao(double salario){
        this.salario = salario * 1.10;
    }
  
}

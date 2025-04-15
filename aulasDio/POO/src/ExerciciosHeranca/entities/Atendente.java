package ExerciciosHeranca.entities;

public class Atendente extends Funcionario{
    
    private final boolean admin = false;
    private double valorCaixa;
    
    public Atendente() {
    }

    public Atendente(String nome, String email, String senha, double valorCaixa) {
        super(nome, email, senha);
        this.valorCaixa = valorCaixa;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }
    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public void ReceberPagamentos(double x){
        valorCaixa += x;
        System.out.printf("O valor do caixa é de: %.2f %n",valorCaixa);
    }

    public void FecharCaixa(){
         System.out.println("Caixa Fechado!");
    }
    
}

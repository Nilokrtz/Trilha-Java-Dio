package ExerciciosHeranca.entities;

public class Vendendor extends Funcionario{
    
    private final boolean admin = false;
    private int quantVendas;

    public Vendendor() {
    }

    public Vendendor(String nome, String email, String senha, int quantVendas) {
        super(nome, email, senha);
        this.quantVendas = quantVendas;
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    } 

    public void RealizarVenda(int NumVendas){
        quantVendas += NumVendas;
        System.out.println("Venda realizada com sucesso !");
    }  

    public void ConsultarVendas(){
        System.out.printf("Foram feitas: %d vendas !%n",quantVendas);
    }



}


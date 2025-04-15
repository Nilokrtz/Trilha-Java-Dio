package ExerciciosHeranca.entities;

public class Gerente extends Funcionario{
    
    private final boolean admin = true;

    public Gerente() {
    }

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void GerarRelatorioFinanceiro(Atendente atendente, Vendendor vendedor){
        double lucro = atendente.getValorCaixa() * vendedor.getQuantVendas();
        System.out.printf("Lucro das vendas: %.2f%n", lucro);
    }
    
    public void ConsultarVendas(Vendendor vendendor){
        System.out.println("Numero de vendas realizadas: " + vendendor.getQuantVendas());
    }

}
package ExerciciosHeranca;

import java.util.Scanner;

import ExerciciosHeranca.entities.Atendente;
import ExerciciosHeranca.entities.Gerente;
import ExerciciosHeranca.entities.Vendendor;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        Gerente g = new Gerente("bernardo", "bernardo@gmail.com", "bernardo123");
        Vendendor v = new Vendendor("nilo", "nilo@gmail.com", "nilo123", 5);
        Atendente a = new Atendente("macha", "macha@gmail.com", "macha123", 10.4);

        g.AlterarDados();
        g.RealizarLogin();        
        g.AlterarSenha();
        v.AlterarDados();        
        v.RealizarLogin();        
        v.AlterarSenha();        
        a.AlterarDados();        
        a.RealizarLogin();
        a.AlterarSenha();

        v.RealizarVenda(2);
        v.ConsultarVendas();

        a.ReceberPagamentos(23.4);

        g.ConsultarVendas(v);
        g.GerarRelatorioFinanceiro(a,v);

        a.FecharCaixa();
        
        g.RealizarLogOff();        
        v.RealizarLogOff();        
        a.RealizarLogOff();        

        sc.close();


    }
}

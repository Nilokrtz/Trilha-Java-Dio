import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        selecaoCandidatos();

    }

    

    static void selecaoCandidatos(){

        String [] candidatos = {"Nilo","Gabriel","Sofia","Dudu","Marco","Caio","Rafael","Macharet"};

        int candidatosSelecionados = 0; 
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();  
            String texto = String.format("%nO candidato %s %nSolicitou este valor de salário %.2f %n", candidato,salarioPretendido);
            System.out.println(texto);
            
            if (salarioBase >= salarioPretendido) {
                
                texto = String.format("%nO candidato %s foi selecionado para a vaga%n", candidato);    
                System.out.println(texto);
                candidatosSelecionados++;

            }
            candidatosAtual++;

        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
    
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO");
        else if(salarioBase == salarioPretendido)     
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    
    }

}

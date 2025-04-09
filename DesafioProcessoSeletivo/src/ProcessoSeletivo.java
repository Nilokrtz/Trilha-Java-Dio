import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);

        // selecaoCandidatos();
        //imprimirSelecionados();

        String [] candidatos = {"Nilo","Gabriel","Sofia","Dudu"};
        for(String candidato:candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativaRealizadas < 3);

        if (atendeu) 
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativaRealizadas + " TENTATIVA");    
            else 
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NÚMERO MAXIMO DE TENTATIVAS " + tentativaRealizadas + " REALIZADAS");    
            
    }

    static  boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Nilo","Gabriel","Sofia","Dudu"};

        System.out.println("Imprimindo a lista de candidatos unformando o índice do elemento\n");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + i + " é " + candidatos[i]);
            // nesse for each conseguimos pegar o indice de cada elemento
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
            // ja nesse for each nãom conseguimos pegar o indice
        }
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

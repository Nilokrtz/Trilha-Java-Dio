package ExercicioInterface.entities;

import java.util.List;

import ExercicioInterface.interfaces.ServicoMensagem;

public class EnviadorMarketing {
    private List<ServicoMensagem> servicos;

    public EnviadorMarketing(List<ServicoMensagem> servicos) {
        this.servicos = servicos;
    }

    public void enviarParaTodos(String mensagem) {
        // expressão lambda
        servicos.forEach(s -> s.enviarMensagem(mensagem));
    }
}
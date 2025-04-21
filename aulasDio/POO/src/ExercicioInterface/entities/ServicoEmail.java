package ExercicioInterface.entities;

import ExercicioInterface.interfaces.ServicoMensagem;

public class ServicoEmail implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}
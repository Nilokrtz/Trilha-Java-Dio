package ExercicioInterface.entities;

import ExercicioInterface.interfaces.ServicoMensagem;

public class ServicoRedesSociais implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Postando nas Redes Sociais: " + mensagem);
    }
}
package ExercicioInterface.entities;

import ExercicioInterface.interfaces.ServicoMensagem;

public class ServicoWhatsApp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando no WhatsApp: " + mensagem);
    }
}

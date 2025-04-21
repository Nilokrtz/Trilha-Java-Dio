package ExercicioInterface;

import java.util.Arrays;

import ExercicioInterface.entities.EnviadorMarketing;
import ExercicioInterface.entities.ServicoEmail;
import ExercicioInterface.entities.ServicoRedesSociais;
import ExercicioInterface.entities.ServicoSMS;
import ExercicioInterface.entities.ServicoWhatsApp;
import ExercicioInterface.interfaces.ServicoMensagem;

public class Main {
    public static void main(String[] args) {
        ServicoMensagem sms = new ServicoSMS();
        ServicoMensagem email = new ServicoEmail();
        ServicoMensagem redesSociais = new ServicoRedesSociais();
        ServicoMensagem whatsApp = new ServicoWhatsApp();

        sms.enviarMensagem("Mensagem enviada do sms");
        email.enviarMensagem("Mensagem enviada do email");
        redesSociais.enviarMensagem("Mensagem enviada do redesSociais");
        whatsApp.enviarMensagem("Mensagem enviada do whatsApp");
        System.out.println("-------------------------------------------");
        EnviadorMarketing enviador = new EnviadorMarketing(
            Arrays.asList(sms, email, redesSociais, whatsApp)
        );

        enviador.enviarParaTodos("Promoção imperdível! Só hoje!");
    }
}

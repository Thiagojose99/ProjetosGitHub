import java.util.ArrayList;
import java.util.List;

public class App {
    public static void enviarParaTodos(String mensagem, List<Mensagens> servicos) {
        for (Mensagens mensagens : servicos) {
            mensagens.enviar(mensagem);
        }
    }
        public static void main (String[]args){


            String mensagem = "Aproveite nossa promoção imperdível até o fim do mês!";

            List<Mensagens> mensagens = new ArrayList<>();  // Essa parte vou  adicionar todas as instacia em uma LISTA
            mensagens.add(new Sms());
            mensagens.add(new Email());
            mensagens.add(new RedesSociais());
            mensagens.add(new WhatsApp());

            enviarParaTodos(mensagem,mensagens );


        }
    }


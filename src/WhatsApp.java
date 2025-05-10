public class WhatsApp implements Mensagens {

    @Override
    public void enviar(String mensagem) {
        System.out.println("[ WhatsApp] Enviando mensagens: "+ mensagem);
    }
}

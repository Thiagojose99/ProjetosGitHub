public class Sms implements Mensagens {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[ Sms ] Enviando mensagens: "+ mensagem);
    }

}

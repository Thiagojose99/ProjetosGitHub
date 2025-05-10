public class Email implements Mensagens{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[ E-Mail] Enviando mensagens: "+ mensagem);
    }
}

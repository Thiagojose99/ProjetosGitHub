public class RedesSociais implements Mensagens{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[ Redes Sociais] Enviando mensagens: "+ mensagem);
    }
}

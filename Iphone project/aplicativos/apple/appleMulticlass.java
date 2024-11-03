package src;
import ReprodutorMusical;
import navegadorInternet;
import AparelhoTelefonico;

public class appleMulticlass implements ReprodutorMusical, navegadorInternet, AparelhoTelefonico {
    @Override
    public void Tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(string musica) {
        System.out.println("musica trocada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Telefone Ligado");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }

    @Override
    public void Ligar(String numero) {
        System.out.println("Telefone Ligado");
    }
    
    @Override
    public void atender() {
        System.out.println("chamada atendida");
    }
    
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Sua chamada foi enviada para caixa postal");
    }

}



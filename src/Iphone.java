public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void ligar() {
        System.out.println("Aparelho telefonico: ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Aparelho telefonico: atendendo...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Aparelho telefonico: Iniciando correio de voz...");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Navegador: Exibindo Pagina...");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador: Adicionando Aba...");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador: Atualizando Pagina...");

    }

    @Override
    public void tocar() {
        System.out.println("Reprodutor musical: Reproduzinho musica...");

    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor musical: Pausando musica...");

    }

    @Override
    public void selecionarMusica() {
        System.out.println("Reprodutor musical: Selecionando musica...");

    }
}

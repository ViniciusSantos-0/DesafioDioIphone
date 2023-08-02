package src;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.exibirPagina();
        iphone.adcionarAba();
        iphone.atualizarPagina();

        iphone.ligar();
        iphone.atender();
        iphone.iniciaCorreioVoz();

        iphone.tocar();
        iphone.selecionarMusica();
        iphone.pausar();
    }
}

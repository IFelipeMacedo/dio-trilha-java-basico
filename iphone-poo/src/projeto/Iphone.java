package projeto;

import interfaces.AparelhoTelefonico;
import interfaces.ReprodutorMusical;
import interfaces.NavegadorDeInternet;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet {
    public void ligar() {
        System.out.println("Ligando o iPhone...");
    }

    public void atender() {
        System.out.println("Atendendo uma ligação no iPhone...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz no iPhone...");
    }

    public void tocar() {
        System.out.println("Tocando uma música no iPhone...");
    }

    public void pausar() {
        System.out.println("Pausando uma música no iPhone...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando uma música no iPhone...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo uma página no iPhone...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no iPhone...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando uma página no iPhone...");
    }

}

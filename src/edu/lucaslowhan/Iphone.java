package edu.lucaslowhan;

import edu.lucaslowhan.internet.Internet;
import edu.lucaslowhan.music.MusicApp;
import edu.lucaslowhan.telefone.Telefone;

import java.util.Scanner;

public class Iphone implements MusicApp, Telefone , Internet {


    public void exibirPagina(String url) {
        System.out.println("Qual site deseja acessar?");
        Scanner input = new Scanner(System.in);
        url = input.next();
        System.out.println("Pagina exibida com sucesso.");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada com sucesso.");
    }

    public void tocar() {
        System.out.println("Você deu Play na música.");
    }

    public void pausar() {
        System.out.println("Você pausou a música.");
    }

    public void selecionarMusica() {
        System.out.println("Você selecionou a música que está tocando");
    }

    public void proximaMusica() {
        System.out.println("Você pulou para proxima música.");
    }

    public void ligar(String numero) {
        System.out.println("Qual numero deseja ligar?");
        Scanner input = new Scanner(System.in);
        numero = input.next();
        System.out.println("Você está ligando para " +numero);

    }

    public void atender() {
        System.out.println("Você atendeu a ligação.");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Grave seu recado.");
    }
}

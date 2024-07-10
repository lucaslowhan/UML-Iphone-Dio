package edu.lucaslowhan.music;

public class MusicReprodutor implements MusicApp{
    public String nome;
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
}

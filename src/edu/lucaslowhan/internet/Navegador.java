package edu.lucaslowhan.internet;

import java.util.Scanner;

public class Navegador implements Internet{
    public String nome;
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
}

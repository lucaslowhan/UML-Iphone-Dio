package edu.lucaslowhan.telefone;

import java.util.Scanner;

public class Phone implements Telefone{
    public String nome;
    @Override
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

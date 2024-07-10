package edu.lucaslowhan;
import java.util.Scanner;

public class Usuario {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("Escolha uma opção abaixo:");
        System.out.println("1- Telefone\n2- MusicAPP\n3- Navegador\n4- Desligar Iphone");
        int opcao = input.nextInt();
        switch (opcao){
            case 1:
                System.out.println("\nTelefone\n\nEscolha as opções abaixo:");
                System.out.println("\n1- Ligar\n2- Atender\n3- Iniciar correio de voz");
                int opcaoTelefone = input.nextInt();
                switch (opcaoTelefone){
                    case 1:
                        String numero ="0";
                        iphone.ligar(numero);
                        break;
                    case 2:
                        iphone.atender();
                        break;
                    case 3:
                        iphone.iniciarCorreioVoz();
                        break;
                    default:
                        System.out.println("Opção incorreta.");
                }
                break;
            case 2:
                System.out.println("\nMusicAPP\n\nEscolha as opções abaixo:");
                System.out.println("\n1- Tocar\n2- Pausar\n3- Selecionar Musica\n4- Proxima Musica");
                int opcaoMusic = input.nextInt();
                switch (opcaoMusic){
                    case 1:
                        iphone.tocar();
                        break;
                    case 2:
                        iphone.pausar();
                        break;
                    case 3:
                        iphone.selecionarMusica();
                        break;
                    case 4:
                        iphone.proximaMusica();
                        break;
                    default:
                        System.out.println("Opção incorreta.");
                }
                break;
            case 3:
                System.out.println("\nNavegador\n\nEscolha as opções abaixo:");
                System.out.println("\n1- Exibir página\n2- Abrir nova aba\n3- Atualizar página");
                int opcaoNavegador = input.nextInt();
                switch (opcaoNavegador){
                    case 1:
                        String url ="0";
                        iphone.exibirPagina(url);
                        break;
                    case 2:
                        iphone.adicionarNovaAba();
                        break;
                    case 3:
                        iphone.atualizarPagina();
                        break;
                    default:
                        System.out.println("Opção invalida");
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida.");
        }
    }

}

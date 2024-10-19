package br.senac.exercicios;

import java.io.File;
import javax.sound.sampled.*;
import java.util.Scanner;

public class SistemaVotacao {
    public static void tocarSomConfirmacao(){
        try {
            File audioFile = new File("audio/confirma.wav");
            Clip oClip = AudioSystem.getClip();
            AudioInputStream oStream = AudioSystem.getAudioInputStream(audioFile);

            oClip.open(oStream);
            oClip.start();

            long duration = oClip.getMicrosecondLength();
            Thread.sleep(duration / 1000);

            oClip.close();
            oStream.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // CRIAR SENHA
        System.out.print("[ SISTEMA DE VOTAÇÃO ]: primeiro uso, crie uma senha: ");
        String senha = teclado.next();

        boolean permitidoVotar = true;
        while (permitidoVotar) {

            System.out.println("Digite o n° para votar ou \"A\" para ajuda: ");
            String opcao = teclado.next().toUpperCase();

            // ENCERRAR VOTAÇÃO
            if (opcao.equals("7")) {
                System.out.print("Digite a senha: ");
                String tentativaSenha = teclado.next();
                
                if (tentativaSenha.equals(senha)) {
                    permitidoVotar = false;
                }else{
                    System.out.println("Senha incorreta!!");
                }
            }
        }
    }
    
}

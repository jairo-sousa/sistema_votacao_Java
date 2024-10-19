package br.senac.exercicios;

import java.net.URL;
import javax.sound.sampled.*;

public class SistemaVotacao {
    public static void tocarSomConfirmacao(){
        new Thread (() -> {
            try {
                URL audioUrl = new URL("https://raw.githubusercontent.com/jairo-sousa/sistema_votacao_Java/refs/heads/main/audio/confirma.wav");
                Clip oClip = AudioSystem.getClip();
                AudioInputStream oStream = AudioSystem.getAudioInputStream(audioUrl);
    
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

        ).start();
    }
    public static void main(String[] args) {
        tocarSomConfirmacao();
    }
    
}

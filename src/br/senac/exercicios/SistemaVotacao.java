package br.senac.exercicios;

import java.io.File;
import javax.sound.sampled.*;

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
        // TODO
    }
    
}

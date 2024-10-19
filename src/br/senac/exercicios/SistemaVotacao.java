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

        // CANDIDATOS
        int votosCandidatoA = 0;
        int votosCandidatoB = 0;
        int votosCandidatoC = 0;
        int votosCandidatoD = 0;
        
        // BRANCOS E NULOS
        int votosBrancos = 0;
        int votosNulos = 0;
        
        String vencedor = "";
        int maiorQtdVotos = 0;

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
            
             // MOSTRAR AJUDA
             else if (opcao.equals("A")) {
                System.out.println("As opções são:\n" +
                                   "OPÇÃO               |   NÚMERO\n" +
                                   "Candidato A         |   1\n" +
                                   "Candidato B         |   2\n" +
                                   "Candidato C         |   3\n" +
                                   "Candidato D         |   4\n" +
                                   "Voto Branco         |   5\n" +
                                   "Voto Nulo           |   6\n" +
                                   "Encerrar votação    |   7");
            }
        
            // CANDIDATOS
            else if (opcao.equals("1")) {
                votosCandidatoA++;
                System.out.println("Voto no candidato A registrado!");

                if (votosCandidatoA > maiorQtdVotos) {
                    maiorQtdVotos = votosCandidatoA;
                    vencedor = "A";
                } 
                tocarSomConfirmacao();
                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (opcao.equals("2")) {
                votosCandidatoB++;
                System.out.println("Voto no candidato B registrado!");

                if (votosCandidatoB > maiorQtdVotos) {
                    maiorQtdVotos = votosCandidatoB;
                    vencedor = "B";
                } 
                tocarSomConfirmacao();
                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (opcao.equals("3")) {
                votosCandidatoC++;
                System.out.println("Voto no candidato C registrado!");

                if (votosCandidatoC > maiorQtdVotos) {
                    maiorQtdVotos = votosCandidatoC;
                    vencedor = "C";
                } 
                tocarSomConfirmacao();
                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (opcao.equals("4")) {
                votosCandidatoD++;
                System.out.println("Voto no candidato D registrado!");

                if (votosCandidatoD > maiorQtdVotos) {
                    maiorQtdVotos = votosCandidatoD;
                    vencedor = "D";
                } 
                tocarSomConfirmacao();
                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // BRANCOS E NULOS
            else if (opcao.equals("5")) {
                votosBrancos++;
                System.out.println("Voto registrado como BRANCO!");
                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else if (opcao.equals("6")) {
                votosNulos++;
                System.out.println("Voto registrado como NULO!");
                try {
                    Thread.sleep(1100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else{
                System.out.println("Opção inválida!!");
            }
        }
        
        // LIDAR COM EMPATES
        String candidatosEmpatados = "";

        if (votosCandidatoA == maiorQtdVotos && !vencedor.equals("A")) {
            candidatosEmpatados += ", A";
        }
        if (votosCandidatoB == maiorQtdVotos && !vencedor.equals("B")) {
            candidatosEmpatados += ", B";
        }
        if (votosCandidatoC == maiorQtdVotos && !vencedor.equals("C")) {
            candidatosEmpatados += ", C";
        }
        if (votosCandidatoD == maiorQtdVotos && !vencedor.equals("D")) {
            candidatosEmpatados += ", D";
        }
        
        boolean aconteceuEmpate = !candidatosEmpatados.equals("");

        
    }
}
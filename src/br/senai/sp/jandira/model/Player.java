package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Player {
    private String nome, skin;
    private int vida = 100;

    Scanner scanner = new Scanner(System.in);

    public void subtrairVida(int danoEnemy){
        this.vida -= danoEnemy;

        if(this.vida < 0){
            this.vida = 0;
        }

    }

    public void cadastrarPlayer(){
        System.out.println("/---------- Cadastro Player ---------/");
        System.out.print("Informe o nome do Player: ");
        nome = scanner.nextLine();
        System.out.print("Informe a skin do Player: ");
        skin = scanner.nextLine();
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/--/-/-/");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

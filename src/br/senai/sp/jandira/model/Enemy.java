package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Enemy {
    String nome, skin;

    int vida = 100;

    Scanner scanner = new Scanner(System.in);



    public void subtrairVida(int danoPlayer){
        this.vida -= danoPlayer;

        if(this.vida < 0){
            this.vida = 0;
        }

    }

    public void cadastrarEnemy(){
        System.out.println("/---------- Cadastrar Enemy ----------/");
        System.out.print("Informe o nome do Enemy: ");
        nome = scanner.nextLine();
        System.out.print("Informe a skin do Enemy: ");
        skin = scanner.nextLine();
        System.out.println("/-------------------------------------/");
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

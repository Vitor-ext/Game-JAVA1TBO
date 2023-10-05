package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Battle {

    String scenarioBattle;

    Scanner scanner = new Scanner(System.in);

    public void startBattle(Player player, Enemy enemy) {

        boolean continuar = true;

        while (true) {

            int lifePlayer = player.getVida();
            int lifeEnemy = enemy.getVida();

            if (lifeEnemy <= 0) {
                System.out.println("O player " + player.getNome() + " é o Vencedor !!!");
                break;

            } else if (lifePlayer <= 0) {
                System.out.println("O enemy " + enemy.getNome() + " é o Vencedor !!!");
                break;
            }


            System.out.println("/---------------------------    Battle    -------------------------/");
            System.out.println(" Ataque Player [ V ] " + player.getNome() + " Life: " + lifePlayer);
            System.out.println(" Ataque Enemy  [ A ] " + enemy.getNome() + " Life: " + lifeEnemy);
            System.out.println("/------------------------------------------------------------------/");

            String attack = scanner.nextLine();

            if (attack.equalsIgnoreCase("V")) {
                System.out.println("/--------  O Player Atacou  --------/");

                int danoPlayer = ((int) (Math.random() * 20) + 1);

                int chanceDefesa = ((int) (Math.random() * 2) + 1);

                System.out.println("Informe um numero para tentar defesa [1-5]");
                int userDefesa = scanner.nextInt();
                scanner.nextLine();

                if (chanceDefesa == userDefesa) {
                    int valorDefesa = ((int) (Math.random() * 20) + 1);

                    if (valorDefesa > danoPlayer) {
                        System.out.println("A defesa bloqueou 100%");

                    } else {
                        danoPlayer -= valorDefesa;
                        enemy.subtrairVida(danoPlayer);
                    }

                } else {
                    System.out.println("Errou a Defesa !!!");
                    enemy.subtrairVida(danoPlayer);
                    System.out.println("O dano gerado foi de: " + danoPlayer);
                    System.out.println("/----------------------------------/");
                }

            } else if (attack.equalsIgnoreCase("A")) {
                System.out.println("/---------- O Enemy Atacou ---------/");

                int danoEnemy = (int) (Math.random() * 20 + 1);


                int chanceDefesaPlayer = ((int) (Math.random() * 5) + 1);

                System.out.println("Informe um numero para tentar defesa [1-5]");
                int playerDefesa = scanner.nextInt();
                scanner.nextLine();

                if (chanceDefesaPlayer == playerDefesa) {
                    int valorDefesaPlayer = ((int) (Math.random() * 20) + 1);

                    if (valorDefesaPlayer > danoEnemy) {
                        System.out.println("A defesa bloqueou 100%");

                    } else {
                        danoEnemy -= valorDefesaPlayer;
                        player.subtrairVida(danoEnemy);
                    }

                } else {
                    System.out.println("Errou o Bloqueio !!");
                    player.subtrairVida(danoEnemy);
                    System.out.println("O dano gerado foi de: " + danoEnemy);
                    System.out.println("/-----------------------------------/");
                }

            } else {
                System.out.println("Digite uma tecla válida !!!");
            }


        }


    }


}

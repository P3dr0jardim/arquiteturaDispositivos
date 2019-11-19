/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * @author Turma A
 */
//parte1
public class Game {

    Army player;
    Army enemy;
    private int powerAtack = 0;
    private int powerDefense = 0;
    int infantaria;
    int cavalaria;
    int catapultas;

    public enum Commands {
        create, inspect, play, quit;
    }

    public void Create() {

        int side;
        int tropas;

        Scanner tropa = new Scanner(System.in);

        tropas = 0;

        System.out.println("Tenha em atenção que o maximo de tropas é 100!");
        infantaria = verification.IntVerify("Introduza a quantidade de infantaria: ");

        tropas = infantaria;
        cavalaria = verification.IntVerify("Introduza a quantidade de cavalaria: ");

        tropas = infantaria + cavalaria;
        catapultas = verification.IntVerify("Introduza a quantidade de catapultas: ");

        tropas = infantaria + cavalaria + catapultas;
        side = verification.IntVerify("Introduza a percentagem de tropas que quer para ataque!");

        System.out.println("As tropas introduzidas foram:" + catapultas + " catapultas ," + cavalaria + " cavalaria, " + infantaria + " infantaria");
        System.out.println("Num total de " + tropas + " tropas");
        if (tropas > 100) {
            System.out.println("Ultrapassou as 100 unidades!");
            System.out.println("Volte a introduzir tropas!");
            Create();
        }

        player = new Army(catapultas, cavalaria, infantaria, side);


    }

    public void CreateBot() {
        Random random = new Random();


        int infantariaBot = random.nextInt(100 + 1);
        int cavalariaBot = random.nextInt(100 + 1);
        int catapultasBot = random.nextInt(100 + 1);
        int sideBot = random.nextInt(100 + 1);
        ;
        int tropasBot = catapultasBot + infantariaBot + cavalariaBot;

        if (tropasBot > 100) {
            CreateBot();
        } else {
            enemy = new Army(infantariaBot, cavalariaBot, catapultasBot, sideBot);
        }


    }


    public void inspectArmy() {
        int quantCataDef = 0;
        int quantInfatDef = 0;
        int quantCavaDef = 0;
        int quantCataAtk = 0;
        int quantInfatAtk = 0;
        int quantCavaAtk = 0;


        for (int i = 0; i < player.getAttackForce().size(); i++) {
            if (player.getAttackForce().get(i).getAtaque() == 100) {
                quantCataAtk++;
                powerAtack += 100;
            } else if (player.getAttackForce().get(i).getAtaque() == 50) {
                quantCavaAtk++;
                powerAtack += 50;
            } else {
                quantInfatAtk++;
                powerAtack += 25;
            }

        }
        System.out.println("Catapultas ofensivas-> " + quantCataAtk);
        System.out.println("Cavalaria ofensiva->" + quantCavaAtk);
        System.out.println("Infantaria ofensiva->" + quantInfatAtk);

        for (int i = 0; i < player.getDefenseForce().size(); i++) {
            if (player.getDefenseForce().get(i).getDefesa() == 1) {
                quantCataDef++;
                powerDefense += 1;
            } else if (player.getDefenseForce().get(i).getDefesa() == 50) {
                quantCavaDef++;
                powerDefense += 50;
            } else {
                quantInfatDef++;
                powerDefense += 75;
            }

        }
        System.out.println("Catapultas defensivas-> " + quantCataDef);
        System.out.println("Cavalaria defensivas->" + quantCavaDef);
        System.out.println("Infantaria defensiva->" + quantInfatDef);


        int quantCataDefBot = 0;
        int quantInfatDefBot = 0;
        int quantCavaDefBot = 0;
        int quantCataAtkBot = 0;
        int quantInfatAtkBot = 0;
        int quantCavaAtkBot = 0;

        for (int i = 0; i < enemy.getDefenseForce().size(); i++) {
            if (enemy.getDefenseForce().get(i).getDefesa() == 1) {
                quantCataDefBot++;

            } else if (enemy.getDefenseForce().get(i).getDefesa() == 50) {
                quantCavaDefBot++;

            } else {
                quantInfatDefBot++;

            }

        }
        System.out.println("\n-----------ARMY BOT----------");
        System.out.println("Catapultas defensivas-> " + quantCataDefBot);
        System.out.println("Cavalaria defensivas->" + quantCavaDefBot);
        System.out.println("Infantaria defensiva->" + quantInfatDefBot);

        for (int i = 0; i < enemy.getAttackForce().size(); i++) {
            if (enemy.getAttackForce().get(i).getAtaque() == 1) {
                quantCataAtkBot++;

            } else if (enemy.getAttackForce().get(i).getAtaque() == 50) {
                quantCavaAtkBot++;

            } else {
                quantInfatAtkBot++;

            }

        }
        System.out.println("Catapultas ofensivas-> " + quantCataAtkBot);
        System.out.println("Cavalaria ofensiva->" + quantCavaAtkBot);
        System.out.println("Infantaria ofensiva->" + quantInfatAtkBot);


    }

    public void play() {
        System.out.println("O JOGO COMEÇOU!");
        System.out.println("Exercito humano:");
        System.out.println("Poder atacante-> " + powerAtack);
        System.out.println("Poder defensivo-> " + powerDefense);

         /*while(player.getDefenseForce().size()!=0 || enemy.getDefenseForce().size()!=0){
        if(turn==0){
            player.atack(enemy);
        }else{
            enemy.atack(player);
        }*/
    }


    public static void main(String[] args) {

        Game game = new Game();
        System.out.println(Commands.values());

        boolean run = true;

        while (run) {
            System.out.println("Bem vindo ao jogo!!");
            System.out.println("----- Menu -----");
            System.out.println("1- Criar Exécito(create)");
            System.out.println("2- Inspecionar Exécito(inspect)");
            System.out.println("3- Jogar(play)");
            System.out.println("4- Sair(quit)");





            Scanner scanner = new Scanner(System.in);
            String line;
            do {
                System.out.println("Introduza um comando: ");
                line = scanner.nextLine();
            } while (verification.isInEnum(line.toLowerCase(), Commands.class));
            Commands command = Commands.valueOf(line.toLowerCase());

            switch (command) {
                case create:
                    System.out.println("Criar Exércitos");
                    game.Create();
                    game.CreateBot();
                    System.out.println("Press any key to continue");
                    scanner.nextLine();

                    break;

                case inspect:
                    System.out.println("Inspecionar exercito");
                    game.inspectArmy();
                    System.out.println("Press any key to continue");
                    scanner.nextLine();
                    break;
                case play:
                    System.out.println("Jogar");
                    game.play();
                    System.out.println("Press any key to continue");
                    scanner.nextLine();

                    break;
                case quit:
                    System.out.println("Quit");
                    run = false;
                    break;

            }

        }
    }
}

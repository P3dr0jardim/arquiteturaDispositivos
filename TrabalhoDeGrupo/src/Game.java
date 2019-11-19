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
// Criar exercito do jogador
    public void Create() {

        int side;
        int tropas;

        Scanner tropa = new Scanner(System.in);

        tropas = 0;

        System.out.println("Tenha em atenção que o maximo de tropas é 100!");
        //atraves da funçao IntVerify verificamos se o valor introduzido é um numero
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
//Função para criar o bot atraves de randoms
    public void CreateBot() {
        Random random = new Random();

        int infantariaBot = random.nextInt(100 + 1);
        int cavalariaBot = random.nextInt(100 + 1);
        int catapultasBot = random.nextInt(100 + 1);
        int sideBot = random.nextInt(100 + 1);

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

            } else if (player.getAttackForce().get(i).getAtaque() == 50) {
                quantCavaAtk++;
                ;
            } else {
                quantInfatAtk++;

            }

        }
        System.out.println("Catapultas ofensivas-> " + quantCataAtk);
        System.out.println("Cavalaria ofensiva->" + quantCavaAtk);
        System.out.println("Infantaria ofensiva->" + quantInfatAtk);

        for (int i = 0; i < player.getDefenseForce().size(); i++) {
            if (player.getDefenseForce().get(i).getDefesa() == 1) {
                quantCataDef++;

            } else if (player.getDefenseForce().get(i).getDefesa() == 50) {
                quantCavaDef++;

            } else {
                quantInfatDef++;

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

        Scanner scanner = new Scanner(System.in);
        int opcao = 1;
        if (enemy.getDefenseForce().isEmpty()) {
            CreateBot();
        }
        if (player == null) {
            System.out.println("Sem Exercito Criado.");
        } else {
            if (player.getDefenseForce().isEmpty()) {
                System.out.println("O seu exercito encontra sem defesa.");

                opcao = verification.IntVerify("Pretende continuar?Sim(1),Nao(0)->");

            }
            if (opcao == 1) {
                System.out.println("Poder do seu Exercito:");
                System.out.println("Poder Maximo de ataque->" + player.forceAtackRound());
                System.out.println("Poder Defensivo->" + player.forceDefenseRound());
                System.out.println("Poder do Bot");
                System.out.println("Poder Máximo de ataque->" + enemy.forceAtackRound());
                System.out.println("Poder Defensivo->" + enemy.forceDefenseRound());
                int Rounds = 0;
                if ((Math.random() * 100) < 50) {
                    do {
                        Rounds++;
                        System.out.println("----------------Round " + Rounds + "-----------------------");
                        System.out.println("Defesa Atual->" + player.forceDefenseRound());
                        System.out.println("Player Attack");


                        player.Ataque(enemy);
                        System.out.println("Dano dado->" + player.realAtack());
                        if (enemy.forceDefenseRound() > 0) {
                            System.out.println("Enemy Attack");
                            enemy.Ataque(player);
                            System.out.println("Dano recebido->" + enemy.realAtack());

                        }
                    } while (player.forceDefenseRound() > 0 && enemy.forceDefenseRound() > 0);
                    if (enemy.forceDefenseRound() <= 0) {
                        System.out.println("Voce ganhou!!");
                    } else if (player.forceDefenseRound() <= 0) {
                        System.out.println("O bot ganhou!!");
                    }
                } else {
                    do {
                        Rounds++;
                        System.out.println("----------------Round " + Rounds + "-----------------------");
                        System.out.println("Defesa Atual->" + player.forceDefenseRound());
                        System.out.println("Enemy Attack");

                        enemy.Ataque(player);
                        System.out.println("Dano recebido->" + enemy.realAtack());
                        if (player.forceDefenseRound() > 0) {
                            System.out.println("Player Attack");

                            player.Ataque(enemy);
                            System.out.println("Dano dado->" + player.realAtack());
                        }

                    } while (player.forceDefenseRound() > 0 && enemy.forceDefenseRound() > 0);
                    if (player.forceDefenseRound() <= 0) {
                        System.out.println("O bot ganhou!!");
                    } else if (enemy.forceDefenseRound() <= 0) {
                        System.out.println("Voce ganhou!!");
                    }
                }
            }
        }
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

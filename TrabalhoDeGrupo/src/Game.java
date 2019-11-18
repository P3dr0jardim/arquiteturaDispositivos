/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
//parte1
public class Game {

    Army player;
    Army enemy;
    private int powerAtack = 0;
    private int powerDefense = 0;

    public enum Commands {
        create, inspect, play, quit;
    }

    public void Create() {
        int infantaria;
        int cavalaria;
        int catapultas;
        int side;
        int tropas;

        Scanner tropa = new Scanner(System.in);

        tropas = 0;

        System.out.println("Tenha em atenção que o maximo de tropas é 100!");
        System.out.println("Introduza a quantidade de infantaria desejada!");
        infantaria = tropa.nextInt();
        tropas = infantaria;
        System.out.println("Introduza a quantidade de cavalaria desejada!");
        cavalaria = tropa.nextInt();
        tropas = infantaria + cavalaria;
        System.out.println("Introduza a quantidade de catsapultas desejada!");
        catapultas = tropa.nextInt();
        tropas = infantaria + cavalaria + catapultas;
        System.out.println("Introduza a percentagem de tropas que quer para ataque!");
        side = tropa.nextInt();

        System.out.println("As tropas introduzidas foram:" + catapultas + " catapultas ," + cavalaria + " cavalaria, " + infantaria + " infantaria");
        System.out.println("Num total de " + tropas + " tropas");
        if (tropas > 100) {
            System.out.println("Ultrapassou as 100 unidades!");
            System.out.println("Volte a introduzir tropas!");
            Create();
        }

        player = new Army(catapultas, cavalaria, infantaria, side);


    }


    public void inspectArmy(){
        int quantCataDef=0;
        int quantInfatDef=0;
        int quantCavaDef=0;
        int quantCataAtk=0;
        int quantInfatAtk=0;
        int quantCavaAtk=0;


        for(int i=0;i<player.getAttackForce().size();i++){
            if(player.getAttackForce().get(i).getAtaque()==100){
                quantCataAtk++;
                powerAtack+=100;
            }else if(player.getAttackForce().get(i).getAtaque()==50){
                quantCavaAtk++;
                powerAtack+=50;
            }else{
                quantInfatAtk++;
                powerAtack+=25;
            }

        }
        System.out.println("Catapultas ofensivas-> "+quantCataAtk);
        System.out.println("Cavalaria ofensiva->"+quantCavaAtk);
        System.out.println("Infantaria ofensiva->"+quantInfatAtk);

        for(int i=0;i<player.getDefenseForce().size();i++){
            if(player.getDefenseForce().get(i).getDefesa()==1){
                quantCataDef++;
                powerDefense+=1;
            }else if(player.getDefenseForce().get(i).getDefesa()==50){
                quantCavaDef++;
                powerDefense+=50;
            }else{
                quantInfatDef++;
                powerDefense+=75;
            }

        }
        System.out.println("Catapultas defensivas-> "+quantCataDef);
        System.out.println("Cavalaria defensivas->"+quantCavaDef);
        System.out.println("Infantaria defensiva->"+quantInfatDef);
        System.out.println("Sorte dsdsa: "+FightForce.sorte());

    }
    public void play(){
        System.out.println("O JOGO COMEÇOU!");
        System.out.println("Exercito humano:");
        System.out.println("Poder atacante-> "+powerAtack);
        System.out.println("Poder defensivo-> "+powerDefense);

         /*while(player.getDefenseForce().size()!=0 || enemy.getDefenseForce().size()!=0){
        if(turn==0){
            player.atack(enemy);
        }else{
            enemy.atack(player);
        }*/
    }



    public static void main(String[] args)
    {

        Game game = new Game();
        System.out.println(Commands.values());

        boolean run=true;

        while(run){
            System.out.println("Bem vindo ao jogo!!");
            System.out.println("----- Menu -----");
            System.out.println("1- Criar Exécito(create)");
            System.out.println("2- Inspecionar Exécito(inspect)");
            System.out.println("3- Jogar(play)");
            System.out.println("4- Sair(quit)");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduza um comando:");
            String line = scanner.nextLine();
            Commands commands = Commands.valueOf(line);


            switch (commands) {
                case create:
                    System.out.println("Criar Exércitos");
                    game.Create();
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
                    run=false;
                    break;

            }

        }
    }
}

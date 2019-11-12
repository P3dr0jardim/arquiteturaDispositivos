/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhogrupo;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Game {

    Army player;
    Army enemy;
 
    public enum Commands {
        create, inspect, play, quit;
    }
    
     private void Create() {
        player = new Army(30, 20, 50, 50);
    }

    public static void main(String[] args) 
    {

        Game game = new Game();
        System.out.println(Commands.values());

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
               
                break;
            case inspect:
                System.out.println("Inspecionar exercito");
                /*inspectArmy();
                player.toString();
                enemy.toString();*/
                break;
            case play:
                System.out.println("Jogar");
                //game.play();
                break;
            case quit:
                System.out.println("Quit");
                break;

        }

    }

}

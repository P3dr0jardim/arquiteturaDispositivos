/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha7;

import java.util.Scanner;
import Rational.Rational;

/**
 *
 * @author Turma A
 
 */
public class Menu{
    

public enum Commands {
      Start,SaveGame,LoadGame,HighScores,Quit;
}
public static void options(){
Scanner scanner =new Scanner (System.in);
System.out.println("Introduza um comando:");
String line=scanner.nextLine();
Commands commands = Commands.valueOf(line);

if(commands==Commands.Start){
System.out.println("Start");
}else if(commands==Commands.SaveGame){
    System.out.println("Game Saved");  
}else if(commands==Commands.LoadGame){
    System.out.println("Loading");
}else if(commands==Commands.HighScores){
    System.out.println("High Scores");
}else if(commands==Commands.Quit){
    System.out.println("Exiting");
}
}
public static void optionSwitch(){
Scanner scanner =new Scanner (System.in);
System.out.println("Introduza um comando:");
String line=scanner.nextLine();
Commands commands = Commands.valueOf(line);

switch(commands){
    case Start:
        System.out.println("Starting");
        break;
        case SaveGame:
        System.out.println("Game Saved");
        break;
        case LoadGame:
        System.out.println("Loading");
        break;
        case HighScores:
        System.out.println("Scores");
        break;
        case Quit:
        System.out.println("Quit");
        break; 
    
}

}

}



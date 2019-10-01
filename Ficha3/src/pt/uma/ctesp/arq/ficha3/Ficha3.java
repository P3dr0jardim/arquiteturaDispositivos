/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha3;
import java.util.Arrays;
/**
 *
 * @author Turma A
 */
public class Ficha3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("-----------------------------CharacterUtilities---------------------------");
        System.out.println("lowerLetterSuccesorOf->"+CharacterUtilities.lowerLetterSuccesorOf('z'));
        System.out.println("lowerLetterPredecessorOf->"+CharacterUtilities.lowerLetterPredecessorOf('b'));
        System.out.println("lowerLetterSuccesorStepsOf->"+CharacterUtilities.lowerLetterSuccesorStepsOf(2,'z'));
    }
    
}

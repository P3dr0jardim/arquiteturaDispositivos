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
        System.out.println("lowerLetterSuccesorStepsOf->"+CharacterUtilities.lowerLetterSuccessorStepsOf('z', 2));
        System.out.println("lowerLetterPredecessorStepsOf->"+CharacterUtilities.lowerLetterPredecessorStepsOf('b', 2));
        char[] letras={'n','c','b','p','m'};
        char[] letras2={'a','b','c','e','g','k'};
        String msg="Ola";
        System.out.println("occurencesOfCharacteIn->"+CharacterUtilities.occurencesOfCharacterIn(letras,'d'));
        System.out.println("replaceCharacterIn->"+Arrays.toString(CharacterUtilities.replaceCharacterIn(letras,'d','a')));
        System.out.println("concatenationOf->"+Arrays.toString(CharacterUtilities.concatenationOf(letras,letras2)));
        System.out.println("copyOfPartOf->"+Arrays.toString(CharacterUtilities.copyOfPartOf(letras, 0,4)));
        System.out.println("Cipher->"+Arrays.toString(CaesarCipherDecipher.cipher(letras,2)));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha3;


/**
 *
 * @author Turma A
 */
public class CaesarCipherDecipher {
    public static char[] cipher(char[] inicial, int steps){
        char[] resut = new char[inicial.length]; 
        for (int i = 0; i < inicial.length; i++) {
            resut[i]=CharacterUtilities.lowerLetterSuccessorStepsOf(inicial[i], steps);
            
        }
        return resut;
    }
    
}

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
public class CharacterUtilities {
    public static char lowerLetterSuccesorOf(char n){
        char letra1= n;
        letra1++;
        if(n=='z'){
            return 'a';
        }
        return letra1;
    }
      public static char lowerLetterPredecessorOf(char n){
        char letra1= n;
        letra1--;
        if(n=='a'){
            return 'z';
        }
        return letra1;
    }
      public static char lowerLetterSuccesorStepsOf(int x, char n){
        char letraF=n;
        char res;
        res=letraF+x;
        
       
        return letraF;
    }
    
}

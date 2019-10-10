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
     public static String toString(int[] a){
        int i;
        String frase ="";
        for(i=0;i<a.length-1;i++){
            frase+=a[i]+",";
        }
        frase+=a[i];
        return frase;
    }

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
 public static char lowerLetterSuccessorStepsOf(char a, int val) {
        for (int i = 0; i < val; i++) {
            a++;
            if (a == '{') {
                a = 'a';
            }
        }
        return a;
    }

    public static char lowerLetterPredecessorStepsOf(char a, int val) {
        for (int i = 0; i < val; i++) {
            a--;
            if (a == '`') {
                a = 'z';
            }
        }
        return a;
    }
    
      public static int occurencesOfCharacterIn(char x[], char n){
          int valor=0;
          for(int i=0;i<x.length;i++){
            if(x[i]==n){
                valor++;
            }  

          }
         return valor;
      }
      public static char[] replaceCharacterIn(char array[], char letra1,char letra2){
        
          for(int i=0;i<array.length;i++){
             if(letra1==letra2){
                 array[i]=letra2;
             }
  
      }
     return array;     
      }
      public static char[] concatenationOf(char[] array1,char[] array2){
        char[] resultado=new char[array1.length+array2.length];
        int i;
        for(i=0;i<array1.length;i++){
            resultado[i]=array1[i];
        }
        for(int j=0;j<array2.length;j++){
            resultado[i+j]=array2[j];
        }
        return resultado;
    }
      public static char[] copyOfPartOf(char[] array, int pi, int fi){
          char[] resultado=new char[fi-pi+1];
          int count=0;
          for (int i = pi; i<=fi ; i++) {
              resultado[count]=array[i];
                  count++;
              }
          return resultado;
          }
}

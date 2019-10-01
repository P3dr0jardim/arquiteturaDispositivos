/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctest.arq.ficha2;
/**
 *
 * @author Turma A
 */
public class NumericalUtilities {
    public static int powerOf(int a,int b){
        return (int) (Math.pow(a, b));
    }
    public static int sumOfNaturalNumbersUpTo(int a){
        int result=0;
        for(int i=0;i<a;i++){
            result+=i;
        }
        return result;
    }
    public static int sumOfNaturalNumbersBetween(int a,int b){
        int result=0;
        for(int i=a;i<b;i++){
            result+=i;
        }
        return result;
    }
    public static int sumOfEvenNumbersBetween(int a,int b){
        int result=0;
        for(int i=a;i<b;i++){
            if((i%2)==0){
                result+=i;
            }
        }
        return result;
    }
    public static int numberOfDivisorsOf(int a){
        int result=0;
        for(int i=a;i>0;i--){
            if((a%i)==0){
                ++result;
            }
        }
        return result;
    }
    public static boolean isPrime(int a){
        if(2==numberOfDivisorsOf(a)){
            return true;
        }
        return false;
    }
}

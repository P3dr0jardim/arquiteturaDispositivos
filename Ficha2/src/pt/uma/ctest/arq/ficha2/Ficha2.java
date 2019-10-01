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
public class Ficha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-----------------------------NumericalUtilities---------------------------");
        System.out.println("powerOf->"+NumericalUtilities.powerOf(2,5));
        System.out.println("sumOfNaturalNumbersUpTo->"+NumericalUtilities.sumOfNaturalNumbersUpTo(5));
        System.out.println("sumOfNaturalNumbersBetween->"+NumericalUtilities.sumOfNaturalNumbersBetween(1,5));
        System.out.println("sumOfEvenNumbersBetween->"+NumericalUtilities.sumOfEvenNumbersBetween(3, 10));
        System.out.println("numberOfDivisorsOf->"+NumericalUtilities.numberOfDivisorsOf(8));
        System.out.println("isPrime->"+NumericalUtilities.isPrime(1));
        System.out.println("---------------------------ArrayUtilities-------------------------------");
        int[] array={2,3,5,2,4,2,56,2,64,3};
        String[] array1={"asdasdasd","gkhmfgkhfgkh","klhmfgokn","eqeqeqeq","high"};
        char[] array2={'d','s','f','d','f'};
        System.out.println("toString->"+ArrayUtilities.toString(array));
        System.out.println("maximumOf->"+ArrayUtilities.maximumOf(array));
        System.out.println("minimumOf->"+ArrayUtilities.minimumOf(array));
        System.out.println("copyOf->"+ArrayUtilities.copyOf(array));
        System.out.println("contains->"+ArrayUtilities.contains(5,array));
        System.out.println("containsDuplicates->");
        System.out.println("indexOf->");
        System.out.println("add->");
        System.out.println("remove->");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctest.arq.ficha2;
import java.util.Arrays;
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
        System.out.println("isPrime->"+NumericalUtilities.isPrime(2));
        System.out.println("---------------------------ArrayUtilities-------------------------------");
        int[] array={2,3,5,4,2,56,26,43};
        String[] array1={"asdasdasd","gkhmfgkhfgkh","klhmfgokn","eqeqeqeq","high"};
        char[] array2={'d','s','f','d','f'};
        System.out.println("toString->"+ArrayUtilities.toString(array));
        System.out.println("maximumOf->"+ArrayUtilities.maximumOf(array));
        System.out.println("minimumOf->"+ArrayUtilities.minimumOf(array));
        System.out.println("copyOf->"+Arrays.toString(ArrayUtilities.copyOf(array)));
        System.out.println("contains->"+ArrayUtilities.contains(5,array));
        System.out.println("containsDuplicates->"+ArrayUtilities.containsDuplicates(array));
        System.out.println("indexOf->"+ArrayUtilities.indexOf(200));
        System.out.println("add->"+Arrays.toString(ArrayUtilities.add(500,array)));
        System.out.println("remove->"+Arrays.toString(ArrayUtilities.remove(500,array)));
    }
    
}

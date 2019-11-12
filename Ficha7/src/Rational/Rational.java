/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rational;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Turma A
 */
public class Rational implements Comparable<Rational>{
    private int numerator;
    private int denominator;
    
    public boolean equal (final Object obj){
        if(this==obj)
            return true;
        if(obj==null || getClass()!= obj.getClass())
            return false;
        
        final Rational other=(Rational) obj;
        return denominator== other.denominator&&numerator==other.numerator;
    }
    @Override
    public int hashCode(){
        return Objects.hash(numerator,denominator);
    }
    List<Rational>racionais=new ArrayList<Rational>();
    
    

    @Override
    public int compareTo(Rational t) {
        return 0;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha5;
import pt.uma.ctesp.arq.ficha6.Triangle;
import pt.uma.ctesp.arq.ficha6.Rectangle;
import pt.uma.ctesp.arq.ficha5.*;

/**
 *
 * @author Turma A
 */
public class Ficha5 {

    public static void main(String[] args) {
        Point a = new Point(1.0,3.0);
        Point b = new Point(1.0,1.0);
        Point c = new Point(3.0,1.0);
        
   
        
        System.out.println("VALOR A: "+a.getx()+", "+a.gety());
        System.out.println("VALOR B: "+b.getx()+", "+b.gety());
        
        double dist = a.distanceTo(b);
        System.out.println(dist);
        
        Triangle t = new Triangle(a, b, c);
        System.out.println("----------TRIANGULO-----------");
        System.out.println("VALOR : "+ t.getA().toString() +", "+t.getB().toString()+t.getC().toString());
        System.out.println("Comprimento da base: "+t.base());
        System.out.println("Altura: "+t.altura());
        System.out.println("Area: "+t.area());
        
        
        Rectangle x = new Rectangle(new Point(0,3),5,3);
        
        System.out.println("----------RETANGULO-----------");
        System.out.println("Area : "+x.areaRetangulo());
        System.out.println("Perimetro : "+x.perimetroRetangulo());
        System.out.println(x.contains(b));

    }

   
    
}

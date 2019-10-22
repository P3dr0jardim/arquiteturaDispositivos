package pt.uma.ctesp.arq.ficha5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    
     public Triangle() {
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }
     public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }
    
    
    public double base(){
       return b.distanceTo(c);
        
    }
    public double altura(){
       return b.distanceTo(a);
        
    }
     public double area(){
         double res=0.0;
         res=base()*altura()/2;
         return res;
    }
    
    
}

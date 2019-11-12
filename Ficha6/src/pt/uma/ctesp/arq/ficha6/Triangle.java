package pt.uma.ctesp.arq.ficha6;

import pt.uma.ctesp.arq.ficha5.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public abstract class Triangle extends Shape{
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
        this.b = b
                ;
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
    public double hipotenusa(){
       double hipo=0.0;
       Math.pow(hipo,2)=Math.pow(base(),2)+Math.pow(altura(),2);
       return hipo;
        
    }
  
     @Override
    public double getArea(){
        return base()*altura()/2;
    }

    @Override
    public  double getPerimeter(){
      return base()+altura()+hipotenusa() ;
    }
    
    
}

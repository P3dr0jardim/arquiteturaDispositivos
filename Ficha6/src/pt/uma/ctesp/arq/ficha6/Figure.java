/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha6;

import java.util.ArrayList;

/**
 *
 * @author Turma A
 */
public class Figure {
    private ArrayList<Shape> shapes;

   public void add (Shape shape){
       this.shapes.add(shape);
 
   }
 Circle c=new Circle();
 Triangle t= new Triangle();
 Rectangle r=new Rectangle();
 
 Figure fig=new Figure();
 fig.add(c);
 fig.add(t);
 fig.add(r);

    public Figure(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public Circle getC() {
        return c;
    }

    public Triangle getT() {
        return t;
    }

    public Rectangle getR() {
        return r;
    }

    public Figure getFig() {
        return fig;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void setC(Circle c) {
        this.c = c;
    }

    public void setT(Triangle t) {
        this.t = t;
    }

    public void setR(Rectangle r) {
        this.r = r;
    }

    public void setFig(Figure fig) {
        this.fig = fig;
    }
    
 

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha6;

import pt.uma.ctesp.arq.ficha5.Point;

/**
 *
 * @author Turma A
 */
public abstract class Circle extends Shape{
    private double radius;

    public Circle(double radius, Point position) {
        super(position);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public  double getPerimeter(){
        return 2.0* Math.PI*getRadius();
    }
    
}

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
public class Point {

    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    

    public double distanceTo(Point other) {
        double res = 0.0;
       res= Math.sqrt(Math.pow(other.x-this.x,2)+Math.pow(other.y-this.y, 2));
        return res;
    }

    @Override
    public String toString() {
        return "X: " + this.x + ", Y: " + this.y;
    }
    
    



}

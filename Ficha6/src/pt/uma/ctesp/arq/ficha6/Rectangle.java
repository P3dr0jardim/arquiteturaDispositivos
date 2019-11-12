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
public abstract class Rectangle extends Shape{

    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle() {
        this.topLeftPoint = new Point();
        this.height = height;
        this.width = width;
    }

    public Rectangle(Point topLeftPoint, double height, double width) {
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getWidth() {
        return width;
    }
    public double areaRetangulo(){
        double res=0.0;
        res=width*height;
        return res;
    }
     public double perimetroRetangulo(){
        double res=0.0;
        res=2*(width+height);
        return res;
    }
     public boolean contains(Point point){
         boolean contains = false;
         Point topRightPoint= new Point(topLeftPoint.getx()+width, topLeftPoint.gety());
         Point bottomRightPoint=new Point(topLeftPoint.getx()+width,topLeftPoint.gety()-height);
         Point bottomLeftPoint= new Point(topLeftPoint.getx(),topLeftPoint.gety()-height);
         
         if (point.getx() > topLeftPoint.getx() && point.getx() < topRightPoint.getx() && point.gety() > bottomRightPoint.gety() && point.gety() < topRightPoint.gety()) {
            contains = true;
        }
         return contains;
     }
     @Override
    public double getArea(){
        return getWidth()*getHeight();
    }

    @Override
    public  double getPerimeter(){
      return getWidth()+getHeight()+getHeight()+getWidth();
    }

}

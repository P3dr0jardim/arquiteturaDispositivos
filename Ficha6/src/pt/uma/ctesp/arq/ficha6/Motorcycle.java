/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctesp.arq.ficha6;

/**
 *
 * @author Turma A
 */
public abstract class Motorcycle extends Vehicle {
    private double leanAngle;
    
    public Motorcycle() {
        super();
        this.leanAngle=0;
    }
    public Motorcycle(double leanAngle, int year, double price, String brand, String model, String color){
        super(year,price,brand,model,color);
        this.leanAngle=leanAngle;
    }

    @Override
    public String toString() {
        return "Isto é uma Moto com "+leanAngle+ super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

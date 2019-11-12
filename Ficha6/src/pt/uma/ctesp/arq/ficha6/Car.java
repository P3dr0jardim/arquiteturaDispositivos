package pt.uma.ctesp.arq.ficha6;


import pt.uma.ctesp.arq.ficha6.Vehicle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Turma A
 */
public abstract class Car extends Vehicle {
    
    private int doors;
    
    public Car() {
        super();
        this.doors=0;
    }
    public Car(int doors, int year, double price, String brand, String model, String color){
        super(year,price,brand,model,color);
        this.doors=doors;
    }

    @Override
    public String toString() {
        return "Isto é um carro com "+doors+" portas "+ super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

  

   
}

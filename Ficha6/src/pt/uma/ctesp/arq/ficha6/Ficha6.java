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
public class Ficha6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle car=new Car(5, 2000,4000,"Fiat","Seicento","White") {};
        System.out.println(car.toString());
        
        Vehicle motorcycle =new Motorcycle(90, 2019,50000,"Ducati","Fast","red") {};
        System.out.println(motorcycle.toString());
        
        
    }
    
}

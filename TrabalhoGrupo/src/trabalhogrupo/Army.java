/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhogrupo;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Turma A
 */
public class Army{
    
    private ArrayList<FightForce> attackForce;
    private ArrayList<FightForce> defenseForce;

    public Army() {
        attackForce = new ArrayList<FightForce>();
        defenseForce = new ArrayList<FightForce>();
    }
    
    Army(int catapulta, int cavalaria, int infantaria, int side) {
        Random random= new Random();
    for(int i=0;i<catapulta;i++){
    if(random.nextDouble()*100<side){
        attackForce.add(new catapult());
    }else{
        defenseForce.add(new catapult());
        
        }
    }
    for(int i=0;i<cavalaria;i++){
    if(random.nextDouble()*100<side){
        attackForce.add(new cavalary());
    }else{
        defenseForce.add(new cavalary());
        
        }
    }
    for(int i=0;i<infantaria;i++){
    if(random.nextDouble()*100<side){
        attackForce.add(new infantary());
    }else{
        defenseForce.add(new infantary());
        
        }
    }
    }

   
    
    
    
    
}

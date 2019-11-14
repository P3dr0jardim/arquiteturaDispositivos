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
    
    public Army(int catapulta, int cavalaria, int infantaria, int side) {
        attackForce = new ArrayList<FightForce>();
        defenseForce = new ArrayList<FightForce>();
        Random random= new Random();
    for(int i=0;i<catapulta;i++){
    if(random.nextFloat()*100<side){
        attackForce.add(new catapult());
    }else{
        defenseForce.add(new catapult());
        
        }
    }
    for(int i=0;i<cavalaria;i++){
    if(random.nextFloat()*100<side){
        attackForce.add(new cavalary());
    }else{
        defenseForce.add(new cavalary());
        
        }
    }
    for(int i=0;i<infantaria;i++){
    if(random.nextFloat()*100<side){
        attackForce.add(new infantary());
    }else{
        defenseForce.add(new infantary());
        
        }
    }
    }

    public ArrayList<FightForce> getAttackForce() {
        
        return attackForce;
    }

    public ArrayList<FightForce> getDefenseForce() {
        return defenseForce;
    }

    public void setAttackForce(ArrayList<FightForce> attackForce) {
        this.attackForce = attackForce;
    }

    public void setDefenseForce(ArrayList<FightForce> defenseForce) {
        this.defenseForce = defenseForce;
    }

    public Army(ArrayList<FightForce> attackForce, ArrayList<FightForce> defenseForce) {
        this.attackForce = attackForce;
        this.defenseForce = defenseForce;
    }
   
 @Override
    public String toString() {
        return "Tropas de Ataque->"+getAttackForce()+"\nTropas de defesa->"+getDefenseForce();
    }
   
    
    
    
    
}

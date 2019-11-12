/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhogrupo;

/**
 *
 * @author Turma A
 */
public abstract class FightForce {
    public int ataque;
    public int defesa;
    public double sorte;

    public FightForce(int ataque, int defesa, double sorte) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.sorte = sorte;
    }
       public double sorte(){
        double res=0.0;
        res=Math.random();
        return res;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public double getSorte() {
        return sorte;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setSorte(double sorte) {
        this.sorte = sorte;
    }

    
   
    

    
    
    
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Turma A
 */
public abstract class FightForce {
    public int ataque;
    public int defesa;
    public float sorte;


    public FightForce(int ataque, int defesa) {
        this.ataque = ataque;
        this.defesa = defesa;

    }



    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }
    public float getSorte() {
        return sorte;
    }


    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setSorte(float sorte) {
        this.sorte = sorte;
    }



}


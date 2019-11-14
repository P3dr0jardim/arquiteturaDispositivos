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
public class cavalary extends FightForce {
     public cavalary() {
        super(50,50);
    }
     @Override
    public String toString() {
        return "Cavalaria:ataque->"+super.getAtaque()+"\tDefesa->"+super.getDefesa();
    }
}

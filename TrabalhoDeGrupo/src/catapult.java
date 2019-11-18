

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Turma A
 */
public class catapult extends FightForce{

    public catapult() {
        super(100,1);
    }

    @Override
    public String toString() {
        return "Catapulta:ataque->"+super.getAtaque()+"\tDefesa->"+super.getDefesa();
    }





}

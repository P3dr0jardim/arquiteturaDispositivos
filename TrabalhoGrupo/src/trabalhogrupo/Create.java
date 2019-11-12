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
public class Create extends Army{
   private int Player;
   private int Enemy;

    public Create(int Player, int Enemy) {
        this.Player = Player;
        this.Enemy = Enemy;
    }

    public int getPlayer() {
        return Player;
    }

    public int getEnemy() {
        return Enemy;
    }

    public void setPlayer(int Player) {
        this.Player = Player;
    }

    public void setEnemy(int Enemy) {
        this.Enemy = Enemy;
    }
   
   
    
    
    
    
}

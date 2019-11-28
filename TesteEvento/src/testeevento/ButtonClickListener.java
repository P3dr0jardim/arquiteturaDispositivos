/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeevento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Turma A
 */
public class ButtonClickListener implements ActionListener{
    
    private JFrameExample frame;
    
    ButtonClickListener(JFrameExample frame){
        this.frame=frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        System.out.println(button.getText());
        frame.getJLabelTop().setText(button.getText()+ " was clicked!");
        frame.getJLabelBottom().setText(e.paramString());
    }
    
    
}

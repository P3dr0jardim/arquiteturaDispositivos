/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeevento;

import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

/**
 *
 * @author Turma A
 */
public class JFrameExample extends javax.swing.JFrame {

    /**
     * Creates new form JFrameExample
     */
    public JFrameExample() {
        initComponents();
        JButtonOk.addActionListener(new ButtonClickListener(this));
        JButtonSubmit.addActionListener(new ButtonClickListener(this));
        JButtonCancel.addActionListener(new ButtonClickListener(this));
    }
  
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonOk = new javax.swing.JButton();
        JButtonSubmit = new javax.swing.JButton();
        JButtonCancel = new javax.swing.JButton();
        JLabelTop = new javax.swing.JLabel();
        JLabelBottom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JButtonOk.setText("Ok");

        JButtonSubmit.setText("Submit");

        JButtonCancel.setText("Cancel");

        JLabelTop.setText("Control in action:");

        JLabelBottom.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(JButtonOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelBottom)
                    .addComponent(JLabelTop)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JButtonSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButtonCancel)))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JLabelTop)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonOk)
                    .addComponent(JButtonSubmit)
                    .addComponent(JButtonCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(JLabelBottom)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameExample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCancel;
    private javax.swing.JButton JButtonOk;
    private javax.swing.JButton JButtonSubmit;
    private javax.swing.JLabel JLabelBottom;
    private javax.swing.JLabel JLabelTop;
    // End of variables declaration//GEN-END:variables

    public JLabel getJLabelTop() {
        return JLabelTop;
    }

    public JLabel getJLabelBottom() {
        return JLabelBottom;
    }

    
}

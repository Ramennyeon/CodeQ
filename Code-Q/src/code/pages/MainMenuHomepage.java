/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code.pages;


public class MainMenuHomepage extends javax.swing.JFrame {

    
    public MainMenuHomepage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtPlay = new javax.swing.JButton();
        jBtExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLbBackgroundpic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtPlay.setText("PLAY");
        jBtPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jBtPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 340, 60));

        jBtExit.setText("EXIT");
        jBtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtExitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 340, 60));

        jLabel2.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("©Copyright 2025 Sepsun | Code-Q");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, -1, 20));
        getContentPane().add(jLbBackgroundpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtPlayActionPerformed
        selectLesson sl = new selectLesson();
        sl.setVisible(true);
        setVisible(false);        
    }//GEN-LAST:event_jBtPlayActionPerformed

    private void jBtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtExit;
    private javax.swing.JButton jBtPlay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbBackgroundpic;
    // End of variables declaration//GEN-END:variables
}


package code.pages;


public class selectLesson extends javax.swing.JFrame {

    public selectLesson() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtLesson1 = new javax.swing.JButton();
        jBtLesson2 = new javax.swing.JButton();
        jBtLesson3 = new javax.swing.JButton();
        jBtLesson4 = new javax.swing.JButton();
        jBtLesson5 = new javax.swing.JButton();
        jBtLesson6 = new javax.swing.JButton();
        jBtLesson7 = new javax.swing.JButton();
        jBtLesson8 = new javax.swing.JButton();
        jBtLesson9 = new javax.swing.JButton();
        jBtBackButton = new javax.swing.JButton();
        jlbCopyrightInfringement = new javax.swing.JLabel();
        jlbBackgroundPhoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtLesson1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 1 button.jpg"))); // NOI18N
        jBtLesson1.setText("  ");
        jBtLesson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtLesson1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtLesson1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 340, 70));

        jBtLesson2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 2 button.jpg"))); // NOI18N
        jBtLesson2.setText("jButton2");
        jBtLesson2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtLesson2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtLesson2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 340, 70));

        jBtLesson3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 3 button.jpg"))); // NOI18N
        jBtLesson3.setText("jButton3");
        getContentPane().add(jBtLesson3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 340, 70));

        jBtLesson4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 4 button.jpg"))); // NOI18N
        jBtLesson4.setText("jButton4");
        getContentPane().add(jBtLesson4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 340, 70));

        jBtLesson5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 5 button.jpg"))); // NOI18N
        jBtLesson5.setText("jButton5");
        getContentPane().add(jBtLesson5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 340, 70));

        jBtLesson6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 6 button.jpg"))); // NOI18N
        jBtLesson6.setText("jButton6");
        getContentPane().add(jBtLesson6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 330, 70));

        jBtLesson7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 7 button.jpg"))); // NOI18N
        jBtLesson7.setText("jButton7");
        getContentPane().add(jBtLesson7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 330, 70));

        jBtLesson8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 8 button.jpg"))); // NOI18N
        jBtLesson8.setText("jButton8");
        getContentPane().add(jBtLesson8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 330, 70));

        jBtLesson9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/lesson 9 button.jpg"))); // NOI18N
        jBtLesson9.setText("jButton9");
        getContentPane().add(jBtLesson9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 330, 70));

        jBtBackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/final back button.png"))); // NOI18N
        getContentPane().add(jBtBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        jlbCopyrightInfringement.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        jlbCopyrightInfringement.setForeground(new java.awt.Color(255, 255, 255));
        jlbCopyrightInfringement.setText("©Copyright 2025 Sepsun | Code-Q");
        getContentPane().add(jlbCopyrightInfringement, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, -1, 20));

        jlbBackgroundPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/bgMainMenuHomepage.jpg"))); // NOI18N
        getContentPane().add(jlbBackgroundPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtLesson2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtLesson2ActionPerformed
         CorePage Fr1 = new CorePage(2);
        Fr1.setVisible(true);
        setVisible(false); 
    }//GEN-LAST:event_jBtLesson2ActionPerformed

    private void jBtLesson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtLesson1ActionPerformed
   CorePage Fr1 = new CorePage(1);
        Fr1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBtLesson1ActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(selectLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectLesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectLesson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtBackButton;
    private javax.swing.JButton jBtLesson1;
    private javax.swing.JButton jBtLesson2;
    private javax.swing.JButton jBtLesson3;
    private javax.swing.JButton jBtLesson4;
    private javax.swing.JButton jBtLesson5;
    private javax.swing.JButton jBtLesson6;
    private javax.swing.JButton jBtLesson7;
    private javax.swing.JButton jBtLesson8;
    private javax.swing.JButton jBtLesson9;
    private javax.swing.JLabel jlbBackgroundPhoto;
    private javax.swing.JLabel jlbCopyrightInfringement;
    // End of variables declaration//GEN-END:variables
}

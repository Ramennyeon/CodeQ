
package code.pages;
import code.content.Questionnaire;


public class CorePage extends javax.swing.JFrame {

   
    public CorePage() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopBar = new javax.swing.JPanel();
        lblLogoIcon = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        jBtOptionA = new javax.swing.JButton();
        jBtOptionB = new javax.swing.JButton();
        jBtOptionC = new javax.swing.JButton();
        jBtOptionD = new javax.swing.JButton();
        jBtSubmit = new javax.swing.JButton();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code-Q");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTopBar.setBackground(new java.awt.Color(57, 38, 101));

        lblLogoIcon.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/logo.png"))); // NOI18N
        lblLogoIcon.setText("jLabel1");

        javax.swing.GroupLayout pnlTopBarLayout = new javax.swing.GroupLayout(pnlTopBar);
        pnlTopBar.setLayout(pnlTopBarLayout);
        pnlTopBarLayout.setHorizontalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(646, Short.MAX_VALUE))
        );
        pnlTopBarLayout.setVerticalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopBarLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lblLogoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 700, 80));

        lblQuestion.setBackground(new java.awt.Color(255, 243, 246));
        lblQuestion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Question Holder");
        lblQuestion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblQuestion.setOpaque(true);
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 610, 60));

        jBtOptionA.setBackground(new java.awt.Color(125, 178, 200));
        jBtOptionA.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jBtOptionA.setText("Option Holder A");
        jBtOptionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionAActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 290, -1));

        jBtOptionB.setBackground(new java.awt.Color(204, 204, 255));
        jBtOptionB.setText("Option Holder B");
        jBtOptionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionBActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 290, -1));

        jBtOptionC.setBackground(new java.awt.Color(125, 178, 200));
        jBtOptionC.setText("Option Holder C");
        getContentPane().add(jBtOptionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 290, -1));

        jBtOptionD.setBackground(new java.awt.Color(204, 204, 255));
        jBtOptionD.setText("Option Holder D");
        getContentPane().add(jBtOptionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 290, -1));

        jBtSubmit.setBackground(new java.awt.Color(57, 38, 101));
        jBtSubmit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jBtSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jBtSubmit.setText("SUBMIT");
        jBtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 110, 30));

        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/bgCorePage.jpg"))); // NOI18N
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtSubmitActionPerformed

    private void jBtOptionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOptionAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtOptionAActionPerformed

    private void jBtOptionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOptionBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtOptionBActionPerformed

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
            java.util.logging.Logger.getLogger(CorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtOptionA;
    private javax.swing.JButton jBtOptionB;
    private javax.swing.JButton jBtOptionC;
    private javax.swing.JButton jBtOptionD;
    private javax.swing.JButton jBtSubmit;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblLogoIcon;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JPanel pnlTopBar;
    // End of variables declaration//GEN-END:variables
}

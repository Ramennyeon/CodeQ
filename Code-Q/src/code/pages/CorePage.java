
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
        jlbTitleIcon = new javax.swing.JLabel();
        jPnlBackgroundScore = new javax.swing.JPanel();
        jlbScore = new javax.swing.JLabel();
        jBtSettingsIcon = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        jBtOptionA = new javax.swing.JButton();
        jBtOptionB = new javax.swing.JButton();
        jBtOptionC = new javax.swing.JButton();
        jBtOptionD = new javax.swing.JButton();
        jBtSubmit = new javax.swing.JButton();
        jlbCopyrightInfringement = new javax.swing.JLabel();
        jlbPixelGirlIcon = new javax.swing.JLabel();
        lblBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code-Q");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTopBar.setBackground(new java.awt.Color(57, 38, 101));

        lblLogoIcon.setForeground(new java.awt.Color(255, 255, 255));
        lblLogoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/LogoIcon.jpg"))); // NOI18N

        jlbTitleIcon.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jlbTitleIcon.setForeground(new java.awt.Color(255, 255, 255));
        jlbTitleIcon.setText("CODE-Q");

        jPnlBackgroundScore.setBackground(new java.awt.Color(255, 243, 246));
        jPnlBackgroundScore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlbScore.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlbScore.setText("Score:");

        javax.swing.GroupLayout jPnlBackgroundScoreLayout = new javax.swing.GroupLayout(jPnlBackgroundScore);
        jPnlBackgroundScore.setLayout(jPnlBackgroundScoreLayout);
        jPnlBackgroundScoreLayout.setHorizontalGroup(
            jPnlBackgroundScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBackgroundScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbScore)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPnlBackgroundScoreLayout.setVerticalGroup(
            jPnlBackgroundScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlBackgroundScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbScore, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jBtSettingsIcon.setBackground(new java.awt.Color(57, 38, 101));
        jBtSettingsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/setting.png"))); // NOI18N
        jBtSettingsIcon.setBorder(null);

        javax.swing.GroupLayout pnlTopBarLayout = new javax.swing.GroupLayout(pnlTopBar);
        pnlTopBar.setLayout(pnlTopBarLayout);
        pnlTopBarLayout.setHorizontalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLogoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbTitleIcon)
                .addGap(472, 472, 472)
                .addComponent(jPnlBackgroundScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                .addComponent(jBtSettingsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlTopBarLayout.setVerticalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtSettingsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnlBackgroundScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jlbTitleIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 120));

        lblQuestion.setBackground(new java.awt.Color(255, 243, 246));
        lblQuestion.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Question Holder");
        lblQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblQuestion.setOpaque(true);
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 1410, 140));

        jBtOptionA.setBackground(new java.awt.Color(125, 178, 200));
        jBtOptionA.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jBtOptionA.setText("Option Holder A");
        jBtOptionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionAActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 1160, 70));

        jBtOptionB.setBackground(new java.awt.Color(204, 204, 255));
        jBtOptionB.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jBtOptionB.setText("Option Holder B");
        jBtOptionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionBActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 1160, 70));

        jBtOptionC.setBackground(new java.awt.Color(125, 178, 200));
        jBtOptionC.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jBtOptionC.setText("Option Holder C");
        getContentPane().add(jBtOptionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 1160, 70));

        jBtOptionD.setBackground(new java.awt.Color(204, 204, 255));
        jBtOptionD.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jBtOptionD.setText("Option Holder D");
        getContentPane().add(jBtOptionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, 1160, 70));

        jBtSubmit.setBackground(new java.awt.Color(57, 38, 101));
        jBtSubmit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jBtSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jBtSubmit.setText("SUBMIT");
        jBtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 760, 220, 60));

        jlbCopyrightInfringement.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jlbCopyrightInfringement.setForeground(new java.awt.Color(255, 255, 255));
        jlbCopyrightInfringement.setText("©Copyright 2025 Sepsun | Code-Q");
        getContentPane().add(jlbCopyrightInfringement, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 870, -1, 20));

        jlbPixelGirlIcon.setForeground(new java.awt.Color(255, 255, 255));
        jlbPixelGirlIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/pixelgirl.png"))); // NOI18N
        getContentPane().add(jlbPixelGirlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 737, 140, -1));

        lblBackGround.setBackground(new java.awt.Color(0, 0, 255));
        lblBackGround.setForeground(new java.awt.Color(255, 255, 255));
        lblBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/bgCorePage.jpg"))); // NOI18N
        getContentPane().add(lblBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1600, 880));

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
    private javax.swing.JButton jBtSettingsIcon;
    private javax.swing.JButton jBtSubmit;
    private javax.swing.JPanel jPnlBackgroundScore;
    private javax.swing.JLabel jlbCopyrightInfringement;
    private javax.swing.JLabel jlbPixelGirlIcon;
    private javax.swing.JLabel jlbScore;
    private javax.swing.JLabel jlbTitleIcon;
    private javax.swing.JLabel lblBackGround;
    private javax.swing.JLabel lblLogoIcon;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JPanel pnlTopBar;
    // End of variables declaration//GEN-END:variables
}

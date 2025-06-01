
package code.pages;
import code.content.Questionnaire;
import code.model.Option; 
import code.model.Question; 
import java.util.List;
import javax.swing.ImageIcon;


public class CorePage extends javax.swing.JFrame {

   private int score = 0; 
   private Option selectedOption;
   private int currentQuestionIndex = 0; 
   private int lessonNumber;
   private String[] health = {"picture#1","picture#2","picture#3","picture#4","picture#5"};
   private int healthIndex = 0;
   private String healthImagePath = health[healthIndex];
   private boolean questionCorrect;
   
   public List<Question> QuestionList;
   ImageIcon Icon = new ImageIcon(healthImagePath);

   
   
   
    public CorePage(int lessonNumber) {
        initComponents();
  
        setLocationRelativeTo(null);
        this.lessonNumber = lessonNumber;
       
        QuestionList = Questionnaire.lessonQuestion(lessonNumber);
        updateScoreDisplay();
        loadQuestion(currentQuestionIndex);
        
        jLabel3.setIcon(Icon);
    }
      private void loadQuestion(int index) {
        if (index < 0 || index >= QuestionList.size()) { 
            endQuiz();
            return;
        }
        
            Question q = QuestionList.get(index); 
            lblQuestion.setText(q.getText());
            jBtOptionA.setText(q.getOptions().get(0).getText());
            jBtOptionB.setText(q.getOptions().get(1).getText());
            jBtOptionC.setText(q.getOptions().get(2).getText());
            jBtOptionD.setText(q.getOptions().get(3).getText());
            jLabel2.setText("Current Difficulty: " + q.getDifficulty());
          
            selectedOption = null;  
        } 

        private void endQuiz() {
            lblQuestion.setText("Quiz Finished!"); 
            jBtOptionA.setEnabled(false); 
            jBtOptionB.setEnabled(false);
            jBtOptionC.setEnabled(false);
            jBtOptionD.setEnabled(false);
            jBtSubmit.setEnabled(false);
        }
       private void gameOver(){
            lblQuestion.setText("Bobo mo kupal!"); 
            jBtOptionA.setEnabled(false); 
            jBtOptionB.setEnabled(false);
            jBtOptionC.setEnabled(false);
            jBtOptionD.setEnabled(false);
            jBtSubmit.setEnabled(false);
       }



    private void selectOption(int optionIndex) {
        selectedOption = QuestionList.get(currentQuestionIndex).getOptions().get(optionIndex); 
    }
   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopBar = new javax.swing.JPanel();
        lblLogoIcon = new javax.swing.JLabel();
        jlbTitleIcon = new javax.swing.JLabel();
        jPnlBackgroundScore = new javax.swing.JPanel();
        jlbScore = new javax.swing.JLabel();
        jBtSettingsIcon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblQuestion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtOptionA = new javax.swing.JButton();
        jBtOptionB = new javax.swing.JButton();
        jBtOptionC = new javax.swing.JButton();
        jBtOptionD = new javax.swing.JButton();
        jBtSubmit = new javax.swing.JButton();
        jlbCopyrightInfringement = new javax.swing.JLabel();
        jlbPixelGirlIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Code-Q");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTopBar.setBackground(new java.awt.Color(57, 38, 101));

        lblLogoIcon.setForeground(new java.awt.Color(255, 255, 255));

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
        jBtSettingsIcon.setBorder(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/img/pixelgirl.png"))); // NOI18N

        javax.swing.GroupLayout pnlTopBarLayout = new javax.swing.GroupLayout(pnlTopBar);
        pnlTopBar.setLayout(pnlTopBarLayout);
        pnlTopBarLayout.setHorizontalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLogoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitleIcon)
                .addGap(173, 173, 173)
                .addGroup(pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlBackgroundScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(jBtSettingsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlTopBarLayout.setVerticalGroup(
            pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtSettingsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTopBarLayout.createSequentialGroup()
                        .addComponent(jPnlBackgroundScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(pnlTopBarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlbTitleIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 120));

        lblQuestion.setBackground(new java.awt.Color(255, 243, 246));
        lblQuestion.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Question Holder");
        lblQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblQuestion.setOpaque(true);
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 690, 80));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, -1));

        jBtOptionA.setBackground(new java.awt.Color(125, 178, 200));
        jBtOptionA.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jBtOptionA.setText("Option Holder A");
        jBtOptionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionAActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 320, 70));

        jBtOptionB.setBackground(new java.awt.Color(204, 204, 255));
        jBtOptionB.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jBtOptionB.setText("Option Holder B");
        jBtOptionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionBActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 320, 70));

        jBtOptionC.setBackground(new java.awt.Color(125, 178, 200));
        jBtOptionC.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jBtOptionC.setText("Option Holder C");
        jBtOptionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionCActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 320, 70));

        jBtOptionD.setBackground(new java.awt.Color(204, 204, 255));
        jBtOptionD.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jBtOptionD.setText("Option Holder D");
        jBtOptionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtOptionDActionPerformed(evt);
            }
        });
        getContentPane().add(jBtOptionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 320, 70));

        jBtSubmit.setBackground(new java.awt.Color(57, 38, 101));
        jBtSubmit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jBtSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jBtSubmit.setText("SUBMIT");
        jBtSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, 130, 50));

        jlbCopyrightInfringement.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jlbCopyrightInfringement.setForeground(new java.awt.Color(255, 255, 255));
        jlbCopyrightInfringement.setText("©Copyright 2025 Sepsun | Code-Q");
        getContentPane().add(jlbCopyrightInfringement, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 870, -1, 20));

        jlbPixelGirlIcon.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlbPixelGirlIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 737, 140, -1));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSubmitActionPerformed
   
        if (healthIndex == 4){
            gameOver();
        }
        
        else if (selectedOption != null && healthIndex < 4 && !selectedOption.isCorrect()) {
            
        currentQuestionIndex++;   
        healthIndex++;
        jLabel1.setText("minusHealth /Current Picture: " + health[healthIndex]);
        jLabel3.setIcon(Icon);  
           
        }
        else if (selectedOption.isCorrect()&& healthIndex < 4 ){
            
        currentQuestionIndex++;   
        Question currentQuestion = QuestionList.get(currentQuestionIndex); 
        jLabel1.setText("Health Remain");
        score += currentQuestion.getPoints();
        
        }
        
         loadQuestion(currentQuestionIndex);       
         updateScoreDisplay(); 
         
    }//GEN-LAST:event_jBtSubmitActionPerformed
        
    private void jBtOptionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOptionBActionPerformed
        selectOption(1);
    }//GEN-LAST:event_jBtOptionBActionPerformed

    private void jBtOptionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOptionAActionPerformed
        selectOption(0);
    }//GEN-LAST:event_jBtOptionAActionPerformed

    private void jBtOptionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOptionDActionPerformed
       selectOption(2);
    }//GEN-LAST:event_jBtOptionDActionPerformed

    private void jBtOptionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtOptionCActionPerformed
        selectOption(3);
    }//GEN-LAST:event_jBtOptionCActionPerformed
   
    private void updateScoreDisplay() {
        jlbScore.setText("Score: " + score); 
    }
 
    public static void main(String args[]) {

               /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtOptionA;
    private javax.swing.JButton jBtOptionB;
    private javax.swing.JButton jBtOptionC;
    private javax.swing.JButton jBtOptionD;
    private javax.swing.JButton jBtSettingsIcon;
    private static javax.swing.JButton jBtSubmit;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPnlBackgroundScore;
    private javax.swing.JLabel jlbCopyrightInfringement;
    private javax.swing.JLabel jlbPixelGirlIcon;
    private javax.swing.JLabel jlbScore;
    private javax.swing.JLabel jlbTitleIcon;
    private javax.swing.JLabel lblLogoIcon;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JPanel pnlTopBar;
    // End of variables declaration//GEN-END:variables
}

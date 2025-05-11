/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;

import code.content.Questionnaire;
import code.pages.CorePage;

public class CodeQ {
    
    public static void main(String[] args) {
        System.out.print("panget si kuya");
        Questionnaire.initialize();
        java.awt.EventQueue.invokeLater(() -> {new CorePage().setVisible(true);});
        
    }
    
}

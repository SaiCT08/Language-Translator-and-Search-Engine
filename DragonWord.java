package dragonshoutproject;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Sai Thupakula 2B
 */
public class DragonWord extends javax.swing.JFrame {
    
    private DragonTranslator translator;
    
    /**
     * Creates new form DragonWord
     */
    public DragonWord() {
        initComponents();
        ImageIcon backgroundImage = new ImageIcon("dragonword.jpg");
        imageLabel.setIcon(backgroundImage);
        translator = new DragonTranslator();
    }

    /**
     * adds new translation to database and updates status label
     * Precondition: both fields must be filled with real words
     * Post condition: if word doesn't exist, its added
     */
    private void addTranslation() {
        String englishWord = englishField.getText().trim();
        String dragonWord = dragonField.getText().trim();

        boolean success = translator.addTranslation(englishWord, dragonWord);

        if (success) {
            englishField.setText("");
            dragonField.setText("");
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        englishLabel = new javax.swing.JLabel();
        dragonLabel = new javax.swing.JLabel();
        englishField = new javax.swing.JTextField();
        dragonField = new javax.swing.JTextField();
        translateButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        englishLabel.setText("Enter English Word:");
        getContentPane().add(englishLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        dragonLabel.setText("Enter Dragon Translation:");
        getContentPane().add(dragonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        englishField.setMaximumSize(new java.awt.Dimension(100, 30));
        englishField.setMinimumSize(new java.awt.Dimension(100, 30));
        englishField.setName(""); // NOI18N
        englishField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(englishField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        dragonField.setMaximumSize(new java.awt.Dimension(100, 30));
        dragonField.setMinimumSize(new java.awt.Dimension(100, 30));
        dragonField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(dragonField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        translateButton.setText("Create Translation");
        translateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(translateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        statusLabel.setMaximumSize(new java.awt.Dimension(30, 16));
        statusLabel.setMinimumSize(new java.awt.Dimension(30, 16));
        statusLabel.setPreferredSize(new java.awt.Dimension(30, 16));
        getContentPane().add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 30, -1));
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        StartPage startPage = new StartPage();
        startPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateButtonActionPerformed
        addTranslation();
    }//GEN-LAST:event_translateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dragonField;
    private javax.swing.JLabel dragonLabel;
    private javax.swing.JTextField englishField;
    private javax.swing.JLabel englishLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton translateButton;
    // End of variables declaration//GEN-END:variables
}

package dragonshoutproject;

import javax.swing.ImageIcon;

/**
 * @author Sai Thupakula 2B
 */
public class DragonShout extends javax.swing.JFrame 
{
private DragonTranslator translator;
    
    /**
     * Creates new form DragonShout
     */
    public DragonShout() 
    {
        initComponents();
        ImageIcon backgroundImage = new ImageIcon("dragonshout.jpeg");
        imageLabel.setIcon(backgroundImage);
        translator = new DragonTranslator();
    }

    /**
     * Translates entered words and displays Dragon Shout version. 
     * Post condition: shout is displayed with a "!"
     */
    private void generateShout() 
    {
        String word1 = firstField.getText().trim();
        String dragonWord1 = translator.getTranslation(word1);
        
        String word2 = secondField.getText().trim();
        String dragonWord2 = translator.getTranslation(word2);
        
        String word3 = thirdField.getText().trim();
        String dragonWord3 = translator.getTranslation(word3);

        String shout = capitalizeFirst(dragonWord1) + " " + capitalizeFirst(dragonWord2) + " " + capitalizeFirst(dragonWord3) + "!";
        shoutField.setText(shout);
    }

    /**
     * Capitalizes first letter of word while keeping the rest lowercase
     *
     * @param word the word that needs to be formatted
     * @return the formatted word with first letter being capitalized
     * Precondition: The word is valid string 
     * Post condition: Returns word with first letter in uppercase.
     */
    private String capitalizeFirst(String shout) 
    {
        if (shout.equals("??")) {
            return "??";
        }
        return shout.substring(0, 1).toUpperCase() + shout.substring(1).toLowerCase();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeButton = new javax.swing.JButton();
        firstLabel = new javax.swing.JLabel();
        secondLabel = new javax.swing.JLabel();
        thirdLabel = new javax.swing.JLabel();
        firstField = new javax.swing.JTextField();
        secondField = new javax.swing.JTextField();
        thirdField = new javax.swing.JTextField();
        dragonShoutButton = new javax.swing.JButton();
        shoutField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        firstLabel.setText("Enter first word:");
        getContentPane().add(firstLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        secondLabel.setText("Enter second word:");
        getContentPane().add(secondLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        thirdLabel.setText("Enter third word:");
        getContentPane().add(thirdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        firstField.setMaximumSize(new java.awt.Dimension(100, 30));
        firstField.setMinimumSize(new java.awt.Dimension(100, 30));
        firstField.setPreferredSize(new java.awt.Dimension(100, 30));
        firstField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 110, -1));

        secondField.setMaximumSize(new java.awt.Dimension(100, 30));
        secondField.setMinimumSize(new java.awt.Dimension(100, 30));
        secondField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(secondField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, -1));

        thirdField.setMaximumSize(new java.awt.Dimension(100, 30));
        thirdField.setMinimumSize(new java.awt.Dimension(100, 30));
        thirdField.setName(""); // NOI18N
        thirdField.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(thirdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, -1));

        dragonShoutButton.setText("Dragon Shout!");
        dragonShoutButton.setMaximumSize(new java.awt.Dimension(100, 30));
        dragonShoutButton.setMinimumSize(new java.awt.Dimension(100, 30));
        dragonShoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dragonShoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dragonShoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 180, 70));

        shoutField.setEditable(false);
        shoutField.setMaximumSize(new java.awt.Dimension(200, 30));
        shoutField.setMinimumSize(new java.awt.Dimension(200, 30));
        shoutField.setPreferredSize(new java.awt.Dimension(200, 30));
        getContentPane().add(shoutField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 190, -1));
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        StartPage startFrame = new StartPage();
        startFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void dragonShoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dragonShoutButtonActionPerformed
        generateShout();
    }//GEN-LAST:event_dragonShoutButtonActionPerformed

    private void firstFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dragonShoutButton;
    private javax.swing.JTextField firstField;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField secondField;
    private javax.swing.JLabel secondLabel;
    private javax.swing.JTextField shoutField;
    private javax.swing.JTextField thirdField;
    private javax.swing.JLabel thirdLabel;
    // End of variables declaration//GEN-END:variables
}

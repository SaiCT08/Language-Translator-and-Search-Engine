package dragonshoutproject;

import javax.swing.ImageIcon;

/**
 * @author Sai Thupakula 2B
 */
public class StartPage extends javax.swing.JFrame 
{

    /**
     * Creates homepage
     */
    public StartPage() {
        initComponents();
        ImageIcon backgroundImage = new ImageIcon("startpage 2.png");
        imageLabel.setIcon(backgroundImage);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createShoutButton = new javax.swing.JButton();
        addWordButton = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createShoutButton.setText("Create a Dragon Shout");
        createShoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createShoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createShoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 300, 150));

        addWordButton.setText("Add a Dragon Word");
        addWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addWordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 300, 150));
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createShoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createShoutButtonActionPerformed
        DragonShout shoutPage = new DragonShout();
        shoutPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createShoutButtonActionPerformed

    private void addWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordButtonActionPerformed
        DragonWord wordPage = new DragonWord();
        wordPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addWordButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addWordButton;
    private javax.swing.JButton createShoutButton;
    private javax.swing.JLabel imageLabel;
    // End of variables declaration//GEN-END:variables
}

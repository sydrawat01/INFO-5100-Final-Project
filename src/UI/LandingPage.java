/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import ChemoCare.Account.Account;
import ChemoCare.DB4OUtil.DB4OUtil;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.NetworkSystem.NetworkSystem;
import ChemoCare.Org.Org;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author harshita
 */
public class LandingPage extends javax.swing.JFrame {

    /**
     * Creates new form LandingPage
     */
    private Ecosystem ecosystem;
    private DB4OUtil db4oUtil = DB4OUtil.getInstance();
    
    public LandingPage() {
        initComponents();
        ecosystem = db4oUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jSplitPane2 = new javax.swing.JSplitPane();
    rightJPanel = new javax.swing.JPanel();
    txtUserName = new javax.swing.JTextField();
    btnLogin = new javax.swing.JButton();
    btnLogout = new javax.swing.JButton();
    usernameJLabel = new javax.swing.JLabel();
    usernameJLabel1 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtPassword = new javax.swing.JPasswordField();
    leftJPanel = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jSplitPane2.setDividerLocation(1200);

    rightJPanel.setBackground(new java.awt.Color(190, 194, 224));

    btnLogin.setBackground(new java.awt.Color(250, 218, 209));
    btnLogin.setText("Login");
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoginActionPerformed(evt);
      }
    });

    btnLogout.setBackground(new java.awt.Color(250, 218, 209));
    btnLogout.setText("Logout");

    usernameJLabel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
    usernameJLabel.setForeground(new java.awt.Color(255, 255, 255));
    usernameJLabel.setText("User Name");

    usernameJLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
    usernameJLabel1.setForeground(new java.awt.Color(255, 255, 255));
    usernameJLabel1.setText("Password");

    txtPassword.setText("jPasswordField1");

    javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
    rightJPanel.setLayout(rightJPanelLayout);
    rightJPanelLayout.setHorizontalGroup(
      rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(rightJPanelLayout.createSequentialGroup()
        .addContainerGap(419, Short.MAX_VALUE)
        .addGroup(rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addGroup(rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(rightJPanelLayout.createSequentialGroup()
              .addGap(32, 32, 32)
              .addGroup(rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightJPanelLayout.createSequentialGroup()
              .addComponent(jLabel4)
              .addGap(8, 8, 8)
              .addComponent(usernameJLabel)
              .addGap(50, 50, 50)))
          .addGroup(rightJPanelLayout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGap(8, 8, 8)
            .addComponent(usernameJLabel1)))
        .addContainerGap(144, Short.MAX_VALUE))
    );

    rightJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogin, btnLogout, txtUserName});

    rightJPanelLayout.setVerticalGroup(
      rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(rightJPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26)
        .addGroup(rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(usernameJLabel)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightJPanelLayout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(usernameJLabel1)
            .addGap(17, 17, 17))
          .addGroup(rightJPanelLayout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabel3)
            .addGap(22, 22, 22)))
        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(21, 21, 21)
        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(29, 29, 29)
        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(270, Short.MAX_VALUE))
    );

    jSplitPane2.setRightComponent(rightJPanel);

    javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
    leftJPanel.setLayout(leftJPanelLayout);
    leftJPanelLayout.setHorizontalGroup(
      leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    leftJPanelLayout.setVerticalGroup(
      leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    jSplitPane2.setLeftComponent(leftJPanel);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    // TODO add your handling code here:
    
    // Get username
    String username = txtUserName.getText();
    
    // Get Password
    char[] passwordCharArray = txtPassword.getPassword();
    String password = String.valueOf(passwordCharArray);
    
  }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogin;
  private javax.swing.JButton btnLogout;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JSplitPane jSplitPane2;
  private javax.swing.JPanel leftJPanel;
  private javax.swing.JPanel rightJPanel;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtUserName;
  public javax.swing.JLabel usernameJLabel;
  public javax.swing.JLabel usernameJLabel1;
  // End of variables declaration//GEN-END:variables
}

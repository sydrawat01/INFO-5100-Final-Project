/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.GovtFinancialOfficial;

import ChemoCare.JobQueue.GovtFundJob;
import ChemoCare.Map.SMS;
import ChemoCare.Map.SendEmail;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author harshita
 */
public class FinancialProcessRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinancialProcessRequestsJPanel
     */
    
    private JPanel jPanel;
    private GovtFundJob governmentFundRequest;
    
    public FinancialProcessRequestsJPanel(JPanel jPanel, GovtFundJob fundRequest) {
        initComponents();
        this.jPanel = jPanel;
        this.governmentFundRequest = fundRequest;
        txtAmount.setText(String.valueOf(governmentFundRequest.getRequestAmount()));
        txtLocation.setText(governmentFundRequest.getLocation());
        txtPopulation.setText(String.valueOf(governmentFundRequest.getPopulation()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMessage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        txtPopulation = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDisburseAmount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 123, 255));
        jLabel4.setText("Location");

        txtLocation.setEnabled(false);
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        txtPopulation.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 123, 255));
        jLabel5.setText("Population");

        txtAmount.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 123, 255));
        jLabel3.setText("Amount");

        btnDisburseAmount.setBackground(new java.awt.Color(64, 123, 255));
        btnDisburseAmount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDisburseAmount.setForeground(new java.awt.Color(255, 255, 255));
        btnDisburseAmount.setText("Disburse Amount");
        btnDisburseAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisburseAmountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 123, 255));
        jLabel1.setText("Treasurer Work Area");

        btnBack.setBackground(new java.awt.Color(64, 123, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(64, 123, 255));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 123, 255));
        jLabel2.setText("Message");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/image 36.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDisburseAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDisburseAmount, btnReject});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3))
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5))
                            .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(btnDisburseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDisburseAmount, btnReject});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDisburseAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisburseAmountActionPerformed

        btnDisburseAmount.setEnabled(true);
        String message = txtMessage.getText();
        String sub="Your Fund request is Disbursed";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        }
        else
        {
        governmentFundRequest.setMessage(message);
         int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
         if (dialogResult == JOptionPane.YES_OPTION) {
        governmentFundRequest.setStatus("Accepted");
        try{
                SendEmail.send(governmentFundRequest.getAdminEmail(),"\nHi "+governmentFundRequest.getAdminName()+","+"\n\nYour funding request for Location "+ governmentFundRequest.getLocation()+
                        " is approved and now disbursed"
                +"\n\n\nThanks\nGovenrment",sub);
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                    System.out.println(ex.getMessage());
                }
        //Send SMS
                try{
                    SMS.SendSMS("+14793190560","Hi "+governmentFundRequest.getAdminName()+","+"\nYour Funds are disbursed for location: "+governmentFundRequest.getLocation()+
                        "\n\nThanks,\nGovernment");
                }catch (Exception e){
                     System.out.println(e.getMessage());
                }
         //Send SMS end
        JOptionPane.showMessageDialog(null, "Funds Disbursed Successfully!!!");
        btnDisburseAmount.setEnabled(false);
        txtMessage.setText("");
        btnReject.setEnabled(false);
        }
         txtMessage.setText("");
        }

    }//GEN-LAST:event_btnDisburseAmountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FinancialOfficialWorkArea dwjp = (FinancialOfficialWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        String message = txtMessage.getText();
        String sub="Your Fund request is Rejected by Treasurer";
        if (message.equals("")) {
            JOptionPane.showMessageDialog(null, "Message is mandatory!");
            return;
        } else {
        governmentFundRequest.setMessage(message);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            
            
            if (dialogResult == JOptionPane.YES_OPTION) {
        governmentFundRequest.setStatus("Rejected");
        try{
                SendEmail.send(governmentFundRequest.getAdminEmail(),"\nHi "+governmentFundRequest.getAdminName()+","+"\n\nYour funding request for Location "+ governmentFundRequest.getLocation()+
                        " is Rejected by: "+governmentFundRequest.getReceiver().getEmployee().getEmpName()+"\n\n\n Message: "+message+"\n\n\nThanks\nGovenrment",sub);
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                    System.out.println(ex.getMessage());
                }
        //Send SMS
                try{
                    SMS.SendSMS("+14793190560","Hi "+governmentFundRequest.getAdminName()+","+"\nYour Funds request is rejected for location: "+governmentFundRequest.getLocation()+
                        "\nMessage: "+message+"\n\nThanks,\nGovernment");
                }catch (Exception e){
                     System.out.println(e.getMessage());
                }
         //Send SMS end
        JOptionPane.showMessageDialog(null, "Rejected!");
         txtMessage.setText("");
            btnReject.setEnabled(false);
            btnDisburseAmount.setEnabled(false);
        }
         txtMessage.setText("");   
        }

    }//GEN-LAST:event_btnRejectActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDisburseAmount;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtPopulation;
    // End of variables declaration//GEN-END:variables
}

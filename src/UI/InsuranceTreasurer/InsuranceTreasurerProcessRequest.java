/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.InsuranceTreasurer;

import ChemoCare.Account.Account;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.JobQueue.InsuranceJob;
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
public class InsuranceTreasurerProcessRequest extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceTreasurerProcessRequest
     */
  private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Account userAccount;
    private InsuranceJob insuranceJob;
    public InsuranceTreasurerProcessRequest(JPanel userProcessContainer, Account userAccount, InsuranceJob insuranceJob, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.insuranceJob = insuranceJob;
        txtPolicyNumber.setText(insuranceJob.getPolicyNumber());
        txtSSN.setText(insuranceJob.getSsn());
        txtPolicyName.setText(insuranceJob.getPolicyName());
        txtClaimAmount.setText(String.valueOf(insuranceJob.getClaimAmount()));
        txtBillingAmount.setText(String.valueOf(insuranceJob.getBillAmount()));
        txtCoverage.setText(String.valueOf(insuranceJob.getInsuranceCustomer().getInsurance().getReimbursement()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDisburse = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblPolicyNumber = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        txtPolicyNumber = new javax.swing.JTextField();
        txtPolicyName = new javax.swing.JTextField();
        lblPolicyName = new javax.swing.JLabel();
        txtBillingAmount = new javax.swing.JTextField();
        lblPolicyAmount = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        lblClaimAmount = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblCoverage = new javax.swing.JLabel();
        txtCoverage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnDisburse.setBackground(new java.awt.Color(64, 123, 255));
        btnDisburse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDisburse.setForeground(new java.awt.Color(255, 255, 255));
        btnDisburse.setText("Disburse Amount");
        btnDisburse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisburseActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(64, 123, 255));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject Claim");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(64, 123, 255));
        lblTitle.setText("Insurance Finance Request Process area ");

        lblPolicyNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPolicyNumber.setForeground(new java.awt.Color(64, 123, 255));
        lblPolicyNumber.setText("Policy Number");

        backBtn.setBackground(new java.awt.Color(64, 123, 255));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblPolicyName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPolicyName.setForeground(new java.awt.Color(64, 123, 255));
        lblPolicyName.setText("PolicyName");

        lblPolicyAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPolicyAmount.setForeground(new java.awt.Color(64, 123, 255));
        lblPolicyAmount.setText("Billing Amount");

        lblClaimAmount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClaimAmount.setForeground(new java.awt.Color(64, 123, 255));
        lblClaimAmount.setText("Claim Amount");

        lblSSN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSSN.setForeground(new java.awt.Color(64, 123, 255));
        lblSSN.setText("SSN");

        lblCoverage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCoverage.setForeground(new java.awt.Color(64, 123, 255));
        lblCoverage.setText("Coverage %");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/image 28.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPolicyAmount)
                                .addGap(38, 38, 38)
                                .addComponent(txtBillingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblClaimAmount)
                                .addGap(38, 38, 38)
                                .addComponent(txtClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPolicyName)
                                .addGap(38, 38, 38)
                                .addComponent(txtPolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPolicyNumber)
                                .addGap(38, 38, 38)
                                .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSSN)
                                .addGap(38, 38, 38)
                                .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCoverage)
                                .addGap(38, 38, 38)
                                .addComponent(txtCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(203, 203, 203)
                            .addComponent(btnDisburse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDisburse, btnReject});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblTitle)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPolicyNumber)
                            .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSSN)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCoverage)
                            .addComponent(txtCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPolicyName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBillingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPolicyAmount))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblClaimAmount))
                        .addGap(37, 37, 37)
                        .addComponent(btnDisburse, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDisburse, btnReject});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDisburseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisburseActionPerformed
      btnDisburse.setEnabled(true);
        String sub="Your Insurance claim is disbursed";
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceJob.setStatus("Insurance Claim Approved");
            try{
                SendEmail.send(insuranceJob.getCustomerEmail(),"\nHi "+insuranceJob.getInsuranceCustomer().getCustomerFName()+","+"\n\nYour Insurance claim of amount: "+ insuranceJob.getClaimAmount()+
                        " is disbursed"+"\n\n\nThanks\n"+insuranceJob.getInsuranceCompany(),sub);
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                    System.out.println(ex.getMessage());
                }
        //Send SMS
                try{
                    SMS.SendSMS("+14793190560","Hi "+insuranceJob.getInsuranceCustomer().getCustomerFName()+","+"\n\nYour Insurance claim of amount: "+ insuranceJob.getClaimAmount()+
                        " is disbursed"+"\n\nThanks,\n"+insuranceJob.getInsuranceCompany());
                }catch (Exception e){
                     System.out.println(e.getMessage());
                }
         //Send SMS end
            JOptionPane.showMessageDialog(null, "Claim Approved Successfully!!!");
            btnDisburse.setEnabled(false);
            btnReject.setEnabled(false);
        }
    }//GEN-LAST:event_btnDisburseActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
      String sub="Your Insurance claim is rejected";
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceJob.setStatus("Insurance Claim Rejected");
            try{
                SendEmail.send(insuranceJob.getCustomerEmail(),"\nHi "+insuranceJob.getInsuranceCustomer().getCustomerFName()+","+"\n\nYour Insurance claim of amount: "+ insuranceJob.getClaimAmount()+
                        " is rejected"+"\n\n\nThanks\n"+insuranceJob.getInsuranceCompany(),sub);
            }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                    System.out.println(ex.getMessage());
                }
        //Send SMS
                try{
                    SMS.SendSMS("+14793190560","Hi "+insuranceJob.getInsuranceCustomer().getCustomerFName()+","+"\n\nYour Insurance claim of amount: "+ insuranceJob.getClaimAmount()+
                        " is rejected"+"\n\nThanks,\n"+insuranceJob.getInsuranceCompany());
                }catch (Exception e){
                     System.out.println(e.getMessage());
                }
         //Send SMS end
            btnReject.setEnabled(false);
            btnDisburse.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Claim Rejected");
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InsuranceTreasurerWorkArea iwjp = (InsuranceTreasurerWorkArea) component;
        iwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDisburse;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblClaimAmount;
    private javax.swing.JLabel lblCoverage;
    private javax.swing.JLabel lblPolicyAmount;
    private javax.swing.JLabel lblPolicyName;
    private javax.swing.JLabel lblPolicyNumber;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBillingAmount;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtCoverage;
    private javax.swing.JTextField txtPolicyName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}

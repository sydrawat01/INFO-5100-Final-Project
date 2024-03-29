/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminRole;


import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.NetworkSystem.NetworkSystem;
import ChemoCare.Org.HealthOfficialOrg;
import ChemoCare.Org.LabAttendantOrg;
import ChemoCare.Org.Org;
import ChemoCare.Account.Account;
import ChemoCare.JobQueue.GovtFundJob;
import ChemoCare.JobQueue.LabTestJob;
import ChemoCare.JobQueue.JobRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeelpatel
 */
public class RequestFundsJPanel extends javax.swing.JPanel {
    
        private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Account account;
    private Ecosystem ecosystem;

    /**
     * Creates new form RequestFunds
     */
    public RequestFundsJPanel(JPanel jPanel, Enterprise enterprise, Account account, Ecosystem ecosystem) {
        initComponents();
           this.userProcessContainer = jPanel;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = ecosystem;
        populateRequestTable();
    }
        public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        double totalFunds = 0;
        model.setRowCount(0);
        for (JobRequest request : account.getJobQueue().getJobRequestList()) {
            if(request instanceof GovtFundJob){
            Object[] row = new Object[4];
            row[0] = String.valueOf(((GovtFundJob) request).getLocation());
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            row[3] = String.valueOf(((GovtFundJob) request).getRequestAmount());
            model.addRow(row);
            if (request.getStatus().equalsIgnoreCase("Accepted")) {
                totalFunds += ((GovtFundJob) request).getRequestAmount();
            }
        }
       }
        txtFundsReceived.setText(String.valueOf(totalFunds));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRequestFunds = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpopulation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnSendFundRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFundsReceived = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblRequestFunds.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRequestFunds.setForeground(new java.awt.Color(64, 123, 255));
        lblRequestFunds.setText("Request Funds");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 123, 255));
        jLabel1.setText("Location: ");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 123, 255));
        jLabel2.setText("Population:");

        txtpopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpopulationActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 123, 255));
        jLabel3.setText("Amount:");

        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        btnSendFundRequest.setBackground(new java.awt.Color(64, 123, 255));
        btnSendFundRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendFundRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSendFundRequest.setText("Send Fund Request");
        btnSendFundRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFundRequestActionPerformed(evt);
            }
        });

        workRequestJTable.setBackground(new java.awt.Color(209, 223, 241));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Location", "Receiver", "Status", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 123, 255));
        jLabel4.setText("All Funds Requests");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 123, 255));
        jLabel5.setText("Total Funds Received :");

        txtFundsReceived.setEditable(false);

        backJButton.setBackground(new java.awt.Color(64, 123, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/image 37.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(44, 44, 44)
                                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel2)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(jLabel1)
                                                            .addGap(37, 37, 37)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtpopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(txtFundsReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSendFundRequest))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(lblRequestFunds)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(lblRequestFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(btnSendFundRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFundsReceived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void txtpopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpopulationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpopulationActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void btnSendFundRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFundRequestActionPerformed

        String location = txtLocation.getText().trim();
        String population = txtpopulation.getText();
        String amount = txtAmount.getText();
        if (location.equals("") || population.equals("") || amount.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else {
            try {
                Integer.parseInt(population);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type an Integer for population");
                return;
            }
            try {
                Double.parseDouble(amount);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type an Integer value for amount");
                return;
            }
            GovtFundJob governmentFundRequest = new GovtFundJob(location, Integer.parseInt(population), Double.parseDouble(amount));
            governmentFundRequest.setSender(account);
            governmentFundRequest.setStatus("Sent");
            governmentFundRequest.setAdminEmail(account.getEmployee().getEmpEmail());
            governmentFundRequest.setAdminName(account.getEmployee().getEmpName());

            Org org = null;

            List<NetworkSystem> networks = ecosystem.getNetworkSystems();
            int zip = enterprise.getZipcode();
            //

            for (NetworkSystem network : networks) {
                if(network.getZipcode()==zip)
                {
                    List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                    for (Enterprise enter : enterprises) {

                        List<Org> organizations = enter.getOrgDirectory().getOrganizations();
                        for (Org organization : organizations) {
                            if (organization instanceof HealthOfficialOrg) {
                                org = organization;
                                break;
                            }
                        }
                    }
                }
            }

            if (org != null) {
                org.getJobQueue().getJobRequestList().add(governmentFundRequest);
                account.getJobQueue().getJobRequestList().add(governmentFundRequest);
            }
            populateRequestTable();
        }
    }//GEN-LAST:event_btnSendFundRequestActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSendFundRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRequestFunds;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtFundsReceived;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtpopulation;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

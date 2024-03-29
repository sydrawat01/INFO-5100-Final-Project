package UI.GovtFinancialOfficial;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Org.HealthOfficialOrg;
import ChemoCare.Org.Org;
import ChemoCare.Org.FinancialOfficialOrg;
import ChemoCare.Account.Account;
import ChemoCare.JobQueue.GovtFundJob;
import ChemoCare.JobQueue.LabTestJob;
import ChemoCare.JobQueue.JobRequest;

/**
 *
 * @author sid
 */
public class FinancialOfficialWorkArea extends javax.swing.JPanel {
   private JPanel jPanel;
    private Account account;
    private FinancialOfficialOrg financialOfficialOrg;
    private Enterprise enterprise;
  /**
   * Creates new form FinancialOfficialWorkArea
   */
  public FinancialOfficialWorkArea(JPanel jpanel, Account account, Org organization, Enterprise enterprise) {
    initComponents();
        this.enterprise = enterprise;
        this.jPanel = jpanel;
        this.financialOfficialOrg = (FinancialOfficialOrg) organization;
        this.account = account;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnRequestGovSecretary = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 123, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Treasurer Work Area ");

        tblWorkRequest.setBackground(new java.awt.Color(209, 223, 241));
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Amount", "Message", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        btnAssign.setBackground(new java.awt.Color(64, 123, 255));
        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnRequestGovSecretary.setBackground(new java.awt.Color(64, 123, 255));
        btnRequestGovSecretary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRequestGovSecretary.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestGovSecretary.setText("Process Request");
        btnRequestGovSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestGovSecretaryActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/Layers.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnAssign)
                        .addGap(66, 66, 66)
                        .addComponent(btnRequestGovSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAssign, btnRequestGovSecretary});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestGovSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAssign, btnRequestGovSecretary});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        
        int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            JobRequest request = (GovtFundJob) tblWorkRequest.getValueAt(selectedRow, 5);
            if (request.getStatus().equals("Sent to Treasurer")) {
                request.setReceiver(account);
                request.setStatus("Pending on " + request.getReceiver().getEmployee().getEmpName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRequestGovSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestGovSecretaryActionPerformed
        // TODO add your handling code here:
    
        int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            GovtFundJob request = (GovtFundJob) tblWorkRequest.getValueAt(selectedRow, 5);
            if (request.getStatus().equalsIgnoreCase("Sent to Treasurer")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request already completed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!account.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!account.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!account.getEmployee().equals(request.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //request.setStatus("Processing");
            FinancialProcessRequestsJPanel financialProcessWorkRequestJPanel = new FinancialProcessRequestsJPanel (jPanel, request);
            jPanel.add("TreasurerProcessWorkRequestJPanel", financialProcessWorkRequestJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
        }
        
    }//GEN-LAST:event_btnRequestGovSecretaryActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        model.setRowCount(0);

        for (JobRequest request : financialOfficialOrg.getJobQueue().getJobRequestList()) {
            String status = request.getStatus();
            Object[] row = new Object[6];
            row[0] = request.getSender().getEmployee().getEmpName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[1] = null;
            } else {
                row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmpName();
            }
            //row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = status;
            row[3] = ((GovtFundJob) request).getRequestAmount();
            row[4] = ((GovtFundJob) request).getMessage();
            row[5] = request;

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnRequestGovSecretary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}

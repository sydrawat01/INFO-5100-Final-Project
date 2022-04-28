/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientRole;

import ChemoCare.Account.Account;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.CancerCenterEnterprise;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Map.MapViewer;
import ChemoCare.NetworkSystem.NetworkSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshita, sid
 */
public class PatientVisitPlan extends javax.swing.JPanel {

    /**
     * Creates new form PatientVisitPlan
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Account account;
    private Ecosystem ecosystem;
    
    public PatientVisitPlan(JPanel userProcessContainer, Account account, Enterprise enterprise,Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = business;
        patientId.setText(account.getCustomer().getPatientID());
        patientName.setText(account.getCustomer().getPatientFName()+" "+account.getCustomer().getPatientLName());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        lblPatientId = new javax.swing.JLabel();
        patientId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnMap = new javax.swing.JButton();
        btnDir = new javax.swing.JButton();
        btnEmail = new javax.swing.JButton();
        btnWeb = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setBackground(new java.awt.Color(209, 223, 241));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospital", "Network", "Address", "Email", "WebSite"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        lblPatientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientId.setForeground(new java.awt.Color(64, 123, 255));
        lblPatientId.setText("Patient Id:");

        patientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientId.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 123, 255));
        jLabel2.setText("Patient Name:");

        patientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        patientName.setForeground(new java.awt.Color(255, 255, 255));

        btnBack.setBackground(new java.awt.Color(250, 218, 209));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnMap.setBackground(new java.awt.Color(250, 218, 209));
        btnMap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMap.setText("View on Map");
        btnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapActionPerformed(evt);
            }
        });

        btnDir.setBackground(new java.awt.Color(250, 218, 209));
        btnDir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDir.setText("View Directions");
        btnDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirActionPerformed(evt);
            }
        });

        btnEmail.setBackground(new java.awt.Color(250, 218, 209));
        btnEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEmail.setText("Send Email Query");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        btnWeb.setBackground(new java.awt.Color(250, 218, 209));
        btnWeb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnWeb.setText("View Website");
        btnWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWebActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(64, 123, 255));
        lblTitle.setText("Plan Your Next Visit Portal ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1102, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(lblTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lblPatientId)
                            .addGap(24, 24, 24)
                            .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(jLabel2)
                            .addGap(14, 14, 14)
                            .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMap)
                            .addGap(45, 45, 45)
                            .addComponent(btnDir)
                            .addGap(49, 49, 49)
                            .addComponent(btnEmail)
                            .addGap(39, 39, 39)
                            .addComponent(btnWeb)))
                    .addGap(0, 344, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(771, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 372, Short.MAX_VALUE)
                    .addComponent(lblTitle)
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(patientId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPatientId)
                                .addComponent(jLabel2))))
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnMap)
                        .addComponent(btnDir)
                        .addComponent(btnEmail)
                        .addComponent(btnWeb))
                    .addGap(0, 115, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      userProcessContainer.remove(this);
      Component[] componentArray = userProcessContainer.getComponents();
      Component component = componentArray[componentArray.length - 1];
      PatientWorkArea patientWA = (PatientWorkArea) component;
      patientWA.populateTable();
      patientWA.populateInsuranceTable();
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapActionPerformed
      // TODO add your handling code here:
      int selectedRow = workRequestJTable.getSelectedRow();
      if (selectedRow < 0) {
        JOptionPane.showMessageDialog(null, "Please select a row first");
        return;
      }
      String location = workRequestJTable.getValueAt(selectedRow, 2).toString();
      if (location.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Select a row first");
      } else {
        SwingUtilities.invokeLater(new Runnable() {
          @Override
          public void run() {
            MapViewer browser = new MapViewer();
            browser.setVisible(true);
            browser.loadURL("https://www.google.com/maps/search/?api=1&query=" + location.trim());
          }
        });
      }
    }//GEN-LAST:event_btnMapActionPerformed

    private void btnDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirActionPerformed
      // TODO add your handling code here:
      int selectedRow = workRequestJTable.getSelectedRow();
      if (selectedRow < 0) {
        JOptionPane.showMessageDialog(null, "Please select a row first");
        return;
      }
      String location = workRequestJTable.getValueAt(selectedRow, 2).toString();
      if (location.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Select a row first");
      } else {
        SwingUtilities.invokeLater(new Runnable() {
          @Override
          public void run() {
            MapViewer browser = new MapViewer();
            browser.setVisible(true);
            browser.loadURL("https://www.google.com/maps/dir/?api=1&destination=" + location.trim());
          }
        });
      }
    }//GEN-LAST:event_btnDirActionPerformed

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        // TODO add your handling code here:
      int selectedRow = workRequestJTable.getSelectedRow();
      String to = "";
      if (selectedRow < 0) {
        JOptionPane.showMessageDialog(null, "Please select a row first");
        return;
      } else {
        to = workRequestJTable.getValueAt(selectedRow, 3).toString();
        SendEmailJPanel emailJPanel = new SendEmailJPanel(userProcessContainer, to, "Customer");
        userProcessContainer.add("emailJPanel", emailJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
      }
    }//GEN-LAST:event_btnEmailActionPerformed

    private void btnWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWebActionPerformed
      // TODO add your handling code here:
      int selectedRow = workRequestJTable.getSelectedRow();
      if (selectedRow < 0) {
        JOptionPane.showMessageDialog(null, "Please select a row first");
        return;
      }
      String location = workRequestJTable.getValueAt(selectedRow, 4).toString();
      if (location.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Select a row first");
      } else {
        SwingUtilities.invokeLater(new Runnable() {
          @Override
          public void run() {
            MapViewer browser = new MapViewer();
            browser.setVisible(true);
            browser.loadURL(location.trim());
          }
        });
      }
    }//GEN-LAST:event_btnWebActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDir;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnMap;
    private javax.swing.JButton btnWeb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel patientId;
    private javax.swing.JLabel patientName;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

  public void populateTable() {
    DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
    model.setRowCount(0);
    for (NetworkSystem ns : ecosystem.getNetworkSystems()) {
      for (Enterprise e : ns.getEnterpriseDirectory().
          getEnterpriseList()) {
        if ((e instanceof CancerCenterEnterprise) && (ns.getZipcode() == e.getZipcode())) {
          String website = "https://www.google.com";
          Object[] row = new Object[5];
          row[0] = e.getOrgName();
          row[1] = ns.getName();
          row[2] = e.getAddress();
          row[3] = e.getEmail();
          row[4] = website;
          model.addRow(row);
        }
      }

    }
  }
}

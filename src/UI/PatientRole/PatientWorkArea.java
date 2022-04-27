package UI.PatientRole;

/**
 *
 * @author sid
 */
public class PatientWorkArea extends javax.swing.JPanel {

  /**
   * Creates new form PatientWorkArea
   */
  public PatientWorkArea() {
    initComponents();
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
        tblWorkRequest = new javax.swing.JTable();
        btnPrintInvoice = new javax.swing.JButton();
        lblPatientId = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIns = new javax.swing.JTable();
        lblPatientName = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblPatientNm = new javax.swing.JLabel();
        btnPrescription = new javax.swing.JButton();
        btnViewHospital = new javax.swing.JButton();
        personImageLabels = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblWorkRequest.setBackground(new java.awt.Color(209, 223, 241));
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Reason", "Status", "Amount", "Policy Number", "Assigned Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        btnPrintInvoice.setBackground(new java.awt.Color(250, 218, 209));
        btnPrintInvoice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrintInvoice.setText("Print Invoice");
        btnPrintInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintInvoiceActionPerformed(evt);
            }
        });

        lblPatientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientId.setForeground(new java.awt.Color(64, 123, 255));
        lblPatientId.setText("Patient Id:");

        tblIns.setBackground(new java.awt.Color(209, 223, 241));
        tblIns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Policy Number", "Status", "Bill Amount", "Claim Amount", "Assigned Agent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblIns);

        lblPatientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));

        lblPatientID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientID.setForeground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(64, 123, 255));
        lblTitle.setText("Patients Portal");

        lblPatientNm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientNm.setForeground(new java.awt.Color(64, 123, 255));
        lblPatientNm.setText("Patient Name:");

        btnPrescription.setBackground(new java.awt.Color(250, 218, 209));
        btnPrescription.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrescription.setText("Print Prescription");
        btnPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescriptionActionPerformed(evt);
            }
        });

        btnViewHospital.setBackground(new java.awt.Color(250, 218, 209));
        btnViewHospital.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewHospital.setText("View Hospitals");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(350, 350, 350)
                            .addComponent(lblTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(lblPatientId)
                            .addGap(24, 24, 24)
                            .addComponent(lblPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(lblPatientNm)
                            .addGap(14, 14, 14)
                            .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(personImageLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(btnViewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100, 100)
                            .addComponent(btnPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(btnPrintInvoice)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTitle)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPatientId)
                                .addComponent(lblPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPatientNm))))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(personImageLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnViewHospital)
                        .addComponent(btnPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrintInvoice))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void btnPrintInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintInvoiceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPrintInvoiceActionPerformed

    private void btnPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescriptionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPrescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrescription;
    private javax.swing.JButton btnPrintInvoice;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientNm;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel personImageLabels;
    private javax.swing.JTable tblIns;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}

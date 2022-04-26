/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.PatientRole;

/**
 *
 * @author harshita
 */
public class PatientPrescription extends javax.swing.JPanel {

    /**
     * Creates new form PatientPrescription
     */
    public PatientPrescription() {
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

        lblTitle = new javax.swing.JLabel();
        lblPatientidp = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblConsultedBy = new javax.swing.JLabel();
        lblTreatment = new javax.swing.JLabel();
        txtPatientIdP = new javax.swing.JTextField();
        txtPatientNameP = new javax.swing.JTextField();
        txtConsultedBy = new javax.swing.JTextField();
        txtPrescription = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPrescription = new javax.swing.JTextArea();
        btnPrint = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(190, 194, 224));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Patient Prescription");

        lblPatientidp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientidp.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientidp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientidp.setText("Patient ID:");

        lblPatientName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPatientName.setText("Patient Name:");

        lblConsultedBy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConsultedBy.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultedBy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConsultedBy.setText("Consulted by:");

        lblTreatment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTreatment.setForeground(new java.awt.Color(255, 255, 255));
        lblTreatment.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTreatment.setText("Treatment:");

        txtAreaPrescription.setColumns(20);
        txtAreaPrescription.setRows(5);
        jScrollPane1.setViewportView(txtAreaPrescription);

        btnPrint.setBackground(new java.awt.Color(250, 218, 209));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(250, 218, 209));
        btnback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPatientidp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPatientName)
                                    .addComponent(lblConsultedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatientIdP, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientNameP, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConsultedBy, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(439, 439, 439)
                                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 268, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnback)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnback)
                .addGap(63, 63, 63)
                .addComponent(lblTitle)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblPatientidp)
                        .addGap(16, 16, 16)
                        .addComponent(lblPatientName)
                        .addGap(16, 16, 16)
                        .addComponent(lblConsultedBy)
                        .addGap(14, 14, 14)
                        .addComponent(lblTreatment))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPatientIdP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtPatientNameP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtConsultedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txtPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultedBy;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientidp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTreatment;
    private javax.swing.JTextArea txtAreaPrescription;
    private javax.swing.JTextField txtConsultedBy;
    private javax.swing.JTextField txtPatientIdP;
    private javax.swing.JTextField txtPatientNameP;
    private javax.swing.JTextField txtPrescription;
    // End of variables declaration//GEN-END:variables
}

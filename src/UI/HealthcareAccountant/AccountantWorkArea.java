package UI.HealthcareAccountant;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Enterprise.CancerCenterEnterprise;
import ChemoCare.NetworkSystem.NetworkSystem;
import ChemoCare.Org.AccountantOrg;
import ChemoCare.Org.DoctorOrg;
import ChemoCare.Org.Org;
import ChemoCare.Patient.Patient;
import ChemoCare.Account.Account;
import ChemoCare.JobQueue.AccountsBillingJob;
import ChemoCare.JobQueue.PatientVisitJob;
import ChemoCare.JobQueue.JobRequest;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author sid
 */
public class AccountantWorkArea extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Account account;
    private AccountantOrg accountantOrg;
    private Enterprise enterprise;
    private Ecosystem ecosystem;
    List<Patient> underTreatmentPatients = new ArrayList<>();
    List<Patient> treatedPatients = new ArrayList<>();

  /**
   * Creates new form AccountantWorkArea
   */
    public AccountantWorkArea(JPanel userProcessContainer, Account account, AccountantOrg accountantOrg, Enterprise enterprise, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountantOrg = accountantOrg;
        this.account = account;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;

        populateAllPatientsTable();

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
        tblAllPatients = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnViewAppointmentStatus = new javax.swing.JButton();
        btnCreateAppointments = new javax.swing.JButton();
        btnProcessMedicalBills = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 123, 255));
        jLabel1.setText("Appointment Details");

        tblAllPatients.setBackground(new java.awt.Color(209, 223, 241));
        tblAllPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Patient Name", "Phone Number", "Address", "Treatment Status", "Appointment Date", "Bill Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllPatients);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 123, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Accountant Work Area");

        btnViewAppointmentStatus.setBackground(new java.awt.Color(64, 123, 255));
        btnViewAppointmentStatus.setText("View Appointment Status");
        btnViewAppointmentStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentStatusActionPerformed(evt);
            }
        });

        btnCreateAppointments.setBackground(new java.awt.Color(64, 123, 255));
        btnCreateAppointments.setText("Create Appointments");
        btnCreateAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentsActionPerformed(evt);
            }
        });

        btnProcessMedicalBills.setBackground(new java.awt.Color(64, 123, 255));
        btnProcessMedicalBills.setText("Process Medical Billings");
        btnProcessMedicalBills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessMedicalBillsActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/Layers.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(btnCreateAppointments)
                        .addGap(31, 31, 31)
                        .addComponent(btnProcessMedicalBills))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(btnViewAppointmentStatus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCreateAppointments, btnProcessMedicalBills});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessMedicalBills)
                    .addComponent(btnCreateAppointments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnViewAppointmentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreateAppointments, btnProcessMedicalBills});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAppointmentStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentStatusActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        defaultPieDataset.setValue("In Progress", underTreatmentPatients.size());
        defaultPieDataset.setValue("Completed Successfully", treatedPatients.size());
        JFreeChart chart = ChartFactory.createPieChart("Appointment Status Pie Chart", defaultPieDataset, true, true, true);
        PiePlot piePlot =(PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Appointment Status Pie Chart", chart);
        frame.setVisible(true);
        frame.setSize(500,500);
    }//GEN-LAST:event_btnViewAppointmentStatusActionPerformed

    private void btnCreateAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentsActionPerformed
        // TODO add your handling code here:
        
        String patientId = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CreateAppointmentJPanel", new CreateAppointmentJPanel(userProcessContainer, account, enterprise, ecosystem, patientId));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAppointmentsActionPerformed

    private void btnProcessMedicalBillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessMedicalBillsActionPerformed
        // TODO add your handling code here:
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ProcessMedicalBillsJPanel", new ProcessMedicalBillsJPanel(userProcessContainer, account, enterprise, accountantOrg, ecosystem));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessMedicalBillsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAppointments;
    private javax.swing.JButton btnProcessMedicalBills;
    private javax.swing.JButton btnViewAppointmentStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAllPatients;
    // End of variables declaration//GEN-END:variables
public void populateAllPatientsTable() {
        List<Patient> patients = ((CancerCenterEnterprise) enterprise).getPatientDirectory().getPatientList();
        DefaultTableModel dtm = (DefaultTableModel) tblAllPatients.getModel();
        dtm.setRowCount(0);

    for (Org org : enterprise.getOrgDirectory().
        getOrganizations()) {
      if (org instanceof DoctorOrg) {
        for (JobRequest request : org.getJobQueue().
            getJobRequestList()) {
          String status = request.getStatus();
          Object[] row = new Object[7];
          row[0] = ((PatientVisitJob) request).getPatient().
              getPatientID();
          row[1] = ((PatientVisitJob) request).getPatient().
              getPatientFName();
          row[2] = ((PatientVisitJob) request).getPatient().
              getPhoneNumber();
          row[3] = ((PatientVisitJob) request).getPatient().
              getAddress();
          row[5] = ((PatientVisitJob) request).getPatient().
              getAppointmentDate();
          row[4] = ((PatientVisitJob) request).getIsComplete() ?
              "Treatment Complete" : "Treatment In Progress";
          row[6] = ((PatientVisitJob) request).getBillAmount();
          dtm.addRow(row);
          if (((PatientVisitJob) request).getIsComplete()) {
            treatedPatients.add(((PatientVisitJob) request).getPatient());
          } else {
            underTreatmentPatients.add(((PatientVisitJob) request).getPatient());
          }
        }
      }

    }
  }


}

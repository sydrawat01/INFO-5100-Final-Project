/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.InsuranceAgent;

import ChemoCare.Account.Account;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Enterprise.InsuranceCompanyEnterprise;
import ChemoCare.Insurance.Insurance;
import ChemoCare.InsuranceCustomer.InsuranceCustomer;
import ChemoCare.Map.MapViewer;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author harshita, sid
 */
public class AddNewPolicyInsured extends javax.swing.JPanel {

    /**
     * Creates new form AddNewPolicyInsured
     */
    private JPanel userProcessContainer;
    private Account userAccount;
    private InsuranceCompanyEnterprise insuranceCompanyEnterprise;
    private String planNumber;
    public AddNewPolicyInsured(JPanel userProcessContainer, Account userAccount, Enterprise enterprise, String planNumber) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.insuranceCompanyEnterprise = (InsuranceCompanyEnterprise) enterprise;
        this.userAccount = userAccount;
        this.planNumber = planNumber;
        populateFields();
        populateTable();
        checkSSNPattern();
        checkPhonePattern();
        refreshData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnBack = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtAddress = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtSSN = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    btnViewOnMap = new javax.swing.JButton();
    txtLastNames = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtFirstNames = new javax.swing.JTextField();
    jLabel16 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtPolicyNumbers = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblCustomer = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    cmbGender = new javax.swing.JComboBox();
    jLabel1 = new javax.swing.JLabel();
    txtInsuranceCoverage = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    txtPhone = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    btnAddCustomer = new javax.swing.JButton();
    cmbInsuranceName = new javax.swing.JComboBox();
    dcDOB = new com.toedter.calendar.JDateChooser();

    btnBack.setBackground(new java.awt.Color(255, 204, 51));
    btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btnBack.setText("<<Back");
    btnBack.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBackActionPerformed(evt);
      }
    });

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 255, 255));
    jLabel10.setText("Insurance Plolicy Name");

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    jLabel9.setText("Address");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("gender");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("Date of birth");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    jLabel5.setText("SSN");

    btnViewOnMap.setBackground(new java.awt.Color(255, 204, 0));
    btnViewOnMap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btnViewOnMap.setText("View On Map");
    btnViewOnMap.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnViewOnMapActionPerformed(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Last Name");

    jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(255, 255, 255));
    jLabel16.setText("All Customers");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("First Name");

    tblCustomer.setBackground(new java.awt.Color(204, 255, 153));
    tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Customer Name", "Policy Number", "Policy Name", "Coverage %"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jScrollPane1.setViewportView(tblCustomer);

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Policy Number ");

    cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male", "Other" }));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Add New Customer");

    jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(255, 255, 255));
    jLabel15.setText("Insurance Coverage %");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Phone");

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(255, 255, 255));
    jLabel12.setText("Insurance  Information");

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(255, 255, 255));
    jLabel11.setText("Personal Information");

    btnAddCustomer.setBackground(new java.awt.Color(255, 204, 0));
    btnAddCustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    btnAddCustomer.setText("Add Customer");
    btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddCustomerActionPerformed(evt);
      }
    });

    dcDOB.setMaxSelectableDate(Calendar.getInstance().getTime());

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(401, 401, 401)
            .addComponent(jLabel12))
          .addGroup(layout.createSequentialGroup()
            .addGap(158, 158, 158)
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cmbInsuranceName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(54, 54, 54)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel16)))
          .addGroup(layout.createSequentialGroup()
            .addGap(198, 198, 198)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel6)
              .addComponent(jLabel5)
              .addComponent(jLabel9)
              .addComponent(jLabel3))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel7)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                          .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(txtFirstNames, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(dcDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(txtLastNames)
                  .addComponent(txtPhone)
                  .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(39, 39, 39)
            .addComponent(btnViewOnMap))
          .addGroup(layout.createSequentialGroup()
            .addGap(156, 156, 156)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInsuranceCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(116, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel1)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addGap(316, 316, 316)
              .addComponent(jLabel2)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addComponent(txtPolicyNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addGap(396, 396, 396)
              .addComponent(jLabel11))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnBack))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addComponent(jLabel1))
          .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jLabel11)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtPolicyNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtLastNames, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(txtFirstNames, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3)
            .addComponent(jLabel4)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8))
              .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6))))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dcDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel9)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnViewOnMap)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel12)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel10)
            .addGap(0, 32, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(cmbInsuranceName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtInsuranceCoverage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel15))
        .addGap(30, 30, 30)
        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(59, 59, 59)
        .addComponent(jLabel16)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(313, 313, 313))
    );
  }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewOnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOnMapActionPerformed
        // TODO add your handling code here:
        if (txtAddress.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter address first");
      } else {
        SwingUtilities.invokeLater(new Runnable() {
          @Override
          public void run() {
            MapViewer browser = new MapViewer();
            browser.setVisible(true);
            browser.loadURL("https://www.google.com/maps/search/?api=1&query=" + txtAddress.getText().trim());
          }
        });
      }
    }//GEN-LAST:event_btnViewOnMapActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
      if (txtFirstNames.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide first name");
            return;
        }

        if (txtLastNames.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide last name");
            return;
        }

        if (dcDOB.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please provide Date of birth");
            return;
        }

        if (cmbGender.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide Gender");
            return;
        }

        if (cmbGender.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Please provide Gender");
            return;
        }

        if (txtSSN.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide SSN");
            return;
        }

        if (txtPhone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide phone");
            return;
        }

        if (txtAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide address");
            return;
        }

        if (txtInsuranceCoverage.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide Insurance Coverage");
            return;
        } else {

            String firstName = txtFirstNames.getText().trim();
            String lastName = txtLastNames.getText().trim();
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
            String dateOfBirth = "";
            try {
                dateOfBirth = dateFormat.format(dcDOB.getDate());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please select customer's dob");
            }
            String gender = cmbGender.getSelectedItem().toString();

            String ssn = txtSSN.getText().trim();
            if (!checkSSNPattern()) {
                JOptionPane.showMessageDialog(null, "/* US SSN are 9 digit numbers in the format XXX-XX-XXXX */             \n"
                        + "              \"The first three digits are area number. Area number cannot be 000, 666, or between 900-999\",\n"
                        + "                \" Digits four and five are the group number and between 01-99\",\n"
                        + "              \"The last four digits are serial numbers, 0001-9999.\"");
                txtSSN.setBorder(BorderFactory.createLineBorder(Color.RED));
                return;
            }

            if (checkSSNPattern()) {
                txtSSN.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }

            String address = txtAddress.getText().trim();

            String phone = txtPhone.getText().trim();

            if (!checkPhonePattern()) {
                JOptionPane.showMessageDialog(null, "/* Following are valid phone number examples */             \n"
                        + "              \"1234567890\", \"123-456-7890\", \"(123)4567890\", \"(123)456-7890\",\n"
                        + "              /* Following are invalid phone numbers */ \n"
                        + "              \"(1234567890)\",\"123)4567890\", \"12345678901\", \"(1)234567890\",");
                txtPhone.setBorder(BorderFactory.createLineBorder(Color.RED));

                return;
            }

            if (checkPhonePattern()) {
                txtPhone.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            }

            String policyNumber = txtPolicyNumbers.getText().trim();
            String insurancePolicyName = cmbInsuranceName.getSelectedItem().toString();

            double coverage = Double.parseDouble(txtInsuranceCoverage.getText().trim());

            try {
                Double.parseDouble(txtInsuranceCoverage.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide integer values in coverage textfield");
                return;
            }

            Insurance insurance = new Insurance(insurancePolicyName, insuranceCompanyEnterprise.getOrgName(), coverage);

            InsuranceCustomer insuranceCustomer = new InsuranceCustomer(insurance, policyNumber);

            insuranceCustomer.setCustomerFName(firstName);
            insuranceCustomer.setCustomerLName(lastName);
            insuranceCustomer.setDOB(dateOfBirth);
            insuranceCustomer.setGender(gender);
            insuranceCustomer.setSSN(ssn);
            insuranceCustomer.setPhoneNumber(phone);
            insuranceCustomer.setAddress(address);

            insuranceCustomer.setInsurance(insurance);

            insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomerList().add(insuranceCustomer);

            insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomerList();

            populateTable();
            refreshData();
            JOptionPane.showMessageDialog(null, "Customer is added");

        }

    }//GEN-LAST:event_btnAddCustomerActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAddCustomer;
  private javax.swing.JButton btnBack;
  private javax.swing.JButton btnViewOnMap;
  private javax.swing.JComboBox cmbGender;
  private javax.swing.JComboBox cmbInsuranceName;
  private com.toedter.calendar.JDateChooser dcDOB;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblCustomer;
  private javax.swing.JTextField txtAddress;
  private javax.swing.JTextField txtFirstNames;
  private javax.swing.JTextField txtInsuranceCoverage;
  private javax.swing.JTextField txtLastNames;
  private javax.swing.JTextField txtPhone;
  private javax.swing.JTextField txtPolicyNumbers;
  private javax.swing.JTextField txtSSN;
  // End of variables declaration//GEN-END:variables

  public void populateFields() {
    txtPolicyNumbers.setText(planNumber);
    List<Insurance> policies = insuranceCompanyEnterprise.getInsurancePlanDirectory().getInsurancePlans();

    for (Insurance policy : policies) {
      cmbInsuranceName.addItem(policy);
    }
    
    Insurance selectedPolicy = (Insurance) cmbInsuranceName.getSelectedItem();

    if(selectedPolicy != null) {
      txtInsuranceCoverage.setText(String.valueOf(selectedPolicy.getReimbursement()));
    } else {
      JOptionPane.showMessageDialog(null , "No Existing policy!");
      return;
    }
  }

  public void populateTable() {
    DefaultTableModel dtm = (DefaultTableModel) tblCustomer.getModel();

    dtm.setRowCount(0);
    List<InsuranceCustomer> customers = insuranceCompanyEnterprise.getInsuranceCustomerDirectory().getInsuranceCustomerList();
    for (InsuranceCustomer customer : customers) {
      Object[] row = new Object[4];
      row[0] = customer.getCustomerFName() + " " + customer.getCustomerLName();
      row[1] = customer;
      row[2] = customer.getInsurance().getPlanName();
      row[3] = customer.getInsurance().getReimbursement();

      dtm.addRow(row);
    }
  }

  private boolean checkSSNPattern() {
    Pattern pattern = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");
    Matcher matcher = pattern.matcher(txtSSN.getText());
    boolean checkSSN = false;
    if (matcher.matches()) {
      checkSSN = true;
    } else {
      checkSSN = false;
    }
    return checkSSN;
  }

  private void refreshData() {
    txtPolicyNumbers.setText(UUID.randomUUID().toString().substring(0, 7));
    txtFirstNames.setText("");
    txtLastNames.setText("");
    txtPhone.setText("");
    txtSSN.setText("");
    dcDOB.setDate(null);
    txtAddress.setText("");
  }

  private boolean checkPhonePattern() {
    Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
        Matcher matcher = pattern.matcher(txtPhone.getText());
        boolean isValidPhone = false;
        if (matcher.matches()) {
            isValidPhone = true;
        } else {
            isValidPhone = false;
        }
        return isValidPhone;
  }
}

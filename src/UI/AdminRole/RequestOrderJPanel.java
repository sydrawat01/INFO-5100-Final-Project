/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminRole;
import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Enterprise.CancerCenterEnterprise;
import ChemoCare.Enterprise.PharmacyEnterprise;
import ChemoCare.Map.SMS;

import ChemoCare.Order.ItemList;
import ChemoCare.Order.Order;

import ChemoCare.Org.Org;
import ChemoCare.Account.Account;
import ChemoCare.JobQueue.OrderJob;
import ChemoCare.Map.SendEmail;
import ChemoCare.NetworkSystem.NetworkSystem;
import ChemoCare.Org.HealthOfficialOrg;
import ChemoCare.Org.ManagerOrg;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeelpatel
 */
public class RequestOrderJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Account account;
    private OrderJob orderTreatmentWorkRequest;
    private List<ItemList> items ;
    private Ecosystem ecosystem;
    ArrayList<String> names = new ArrayList<>();
    String pharmaname;
    /**
     * Creates new form RequestOrderJ
     */
    public RequestOrderJPanel(JPanel userProcessContainer, Account account, Enterprise enterprise,Ecosystem ecosystem) {
        initComponents();
              this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.orderTreatmentWorkRequest = new OrderJob();
        this.items = new ArrayList<ItemList>();
        this.ecosystem = ecosystem;
        valueLabel.setText(enterprise.getOrgName());
        requestTestJButton.setEnabled(true);
        priceTextField.setText("0.0");
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

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLabMessage = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        requestTestJButton.setBackground(new java.awt.Color(64, 123, 255));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Place Order");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 123, 255));
        jLabel1.setText("Message:");

        txtLabMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabMessageActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(64, 123, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(64, 123, 255));
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(64, 123, 255));
        enterpriseLabel.setText("EnterPrise :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 123, 255));
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 123, 255));
        jLabel3.setText("Final Order ");

        orderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " " }));
        orderCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderComboActionPerformed(evt);
            }
        });

        menuTable.setBackground(new java.awt.Color(209, 223, 241));
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mienu Item", "Item Price", "Pharmacy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 123, 255));
        jLabel4.setText("Total Price:");

        priceTextField.setEditable(false);

        orderTable.setBackground(new java.awt.Color(209, 223, 241));
        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 123, 255));
        jLabel5.setText("Order Menu");

        addItemButton.setBackground(new java.awt.Color(64, 123, 255));
        addItemButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addItemButton.setForeground(new java.awt.Color(255, 255, 255));
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        removeItemButton.setBackground(new java.awt.Color(64, 123, 255));
        removeItemButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        removeItemButton.setForeground(new java.awt.Color(255, 255, 255));
        removeItemButton.setText("Remove Item");
        removeItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemButtonActionPerformed(evt);
            }
        });

        viewButton.setBackground(new java.awt.Color(64, 123, 255));
        viewButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("Vew All Orders");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/58bab048c5e7001256cd9d85f9d6044c.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(enterpriseLabel)
                                .addGap(10, 10, 10)
                                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)
                                .addComponent(orderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(12, 12, 12)
                                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(txtLabMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(156, 156, 156)
                                            .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 676, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backJButton)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(orderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLabMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String message = txtLabMessage.getText().trim();

        String labType ="" ;//= orderCombo.getSelectedItem().toString();

        int selectedRow = menuTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            //Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 1);
            for(ItemList itm: items)
            {
                labType = labType+" "+itm.getItem();

            }
        }

        if (labType.equals("")) {
            JOptionPane.showMessageDialog(null, "At least one Order is mandatory!");
            return;
        }

        Order order = new Order();

        order.setItem(labType);
        order.setCustomerRole(account);
        order.setDeliveryRole(null);
        order.setAmount(Double.parseDouble(priceTextField.getText()));
        order.setItemList(items);

        CancerCenterEnterprise res = (CancerCenterEnterprise) enterprise;
        res.getOrderDirectory().addOrder(order);
        orderTreatmentWorkRequest.setOrderMsg(message);
        orderTreatmentWorkRequest.setSender(account);
        orderTreatmentWorkRequest.setStatus("Sent to Pharma");
        orderTreatmentWorkRequest.setReceiver(null);
        orderTreatmentWorkRequest.setOrder(order);
        orderTreatmentWorkRequest.setVisitReason(res.getAddress());
        orderTreatmentWorkRequest.setBillAmt(Double.parseDouble(priceTextField.getText()));
        orderTreatmentWorkRequest.setHospitalAdmin(account);
        Org org = null;

        List<NetworkSystem> networks = ecosystem.getNetworkSystems();
        int zip = enterprise.getZipcode();
        //Find managerorganization in same Network
        PharmacyEnterprise matchedphrma = null;

        for (NetworkSystem network : networks) {
            if(network.getZipcode()==zip)
            {
                List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                for (Enterprise enter : enterprises) {
                    if (enter instanceof PharmacyEnterprise) {
                        if(enter.getOrgName().equals(pharmaname))
                        {
                            matchedphrma =  (PharmacyEnterprise) enter;
                        }
                    }
                }
            }
        }
        //PharmaEnterprise pharma = (PharmaEnterprise) enter;
        //pharma.getOrderDirectory().addOrder(order);
        List<Org> organizations = matchedphrma.getOrgDirectory().getOrganizations();
        for (Org organization : organizations) {
            if (organization instanceof ManagerOrg) {
                org = organization;
                break;
            }
        }

        if (org != null) {
            org.getJobQueue().getJobRequestList().add(orderTreatmentWorkRequest);
            account.getJobQueue().getJobRequestList().add(orderTreatmentWorkRequest);

            txtLabMessage.setText("");
            //orderJtext.setText("");
            requestTestJButton.setEnabled(false);
            //send email for order placed
            String sub = "Your Order is placed";
            String odrderDtl = "Order Details\n*************************************************\n";
            try{

                List<ItemList> itm = orderTreatmentWorkRequest.getOrder().getItemList();
                for(ItemList i:itm)
                {
                    odrderDtl=odrderDtl+"Item: "+i.getItem()+" , Quantity: "+i.getQuantity()+", Item Price: $"+i.getTotal()+"\n";
                }
                odrderDtl = odrderDtl+"*************************************************\n";
                odrderDtl=odrderDtl+"\n\nTotal Price: $"+orderTreatmentWorkRequest.getOrder().getAmount();
                SendEmail.send(res.getEmail(),"\nHi "+res.getOrgName()+","+"\n\nYour Order# "+ orderTreatmentWorkRequest.getOrder().getItemID()+
                    " is placed "
                    +"\n\n\n\n"+odrderDtl+"\n\nThanks,\n"+pharmaname+" Team",sub);
                //SendEmail.send("shesh.cool@gmail.com ","Shesh"+","+"\n\nYour Order# "+ orderTreatmentWorkRequest.getOrder().getNumber()+" is placed ",sub);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Email Could not be sent due to technical issues");
                System.out.println(ex.getMessage());
            }
            //Send SMS
            try{
                SMS.SendSMS("+16176524988","Hi "+orderTreatmentWorkRequest.getHospitalAdmin().getEmployee().getEmpName()+","+"\nYour order# : "+orderTreatmentWorkRequest.getOrder().getItemID()+" is placed"+
                    "\n\nThanks,\n"+pharmaname+" Team");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            //Send SMS end
            JOptionPane.showMessageDialog(null, "Order Placed");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void txtLabMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabMessageActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void orderComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderComboActionPerformed
        // TODO add your handling code here:
        /*int selectedRow = menuTable.getSelectedRow();
        Double total = Double.parseDouble(priceTextField.getText());
        Double itemtotal=0.0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            itemtotal = (Double) menuTable.getValueAt(selectedRow, 1)*Double.parseDouble(orderCombo.getSelectedItem().toString());
            priceTextField.setText(String.valueOf(total+itemtotal));

        }*/
    }//GEN-LAST:event_orderComboActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        // TODO add your handling code here:

        String labType ="" ;//= orderCombo.getSelectedItem().toString();
        Double total = Double.parseDouble(priceTextField.getText());
        Double itemtotal=0.0;
        ItemList newitem = new ItemList();
        //ArrayList<String> names = new ArrayList<>();
        int selectedRow = menuTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to add item", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(!(names.isEmpty())&&!(menuTable.getValueAt(selectedRow, 2).toString().equals(names.get(0))))
        {
            JOptionPane.showMessageDialog(null, "Please order from one pharmacy only", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            labType = (String) menuTable.getValueAt(selectedRow, 0);
            itemtotal = (Double) menuTable.getValueAt(selectedRow, 1)*Double.parseDouble(orderCombo.getSelectedItem().toString());
            newitem.setItem(labType);
            newitem.setPrice((Double) menuTable.getValueAt(selectedRow, 1));
            newitem.setTotal(itemtotal);
            newitem.setQuantity(Double.parseDouble(orderCombo.getSelectedItem().toString()));
            items.add(newitem);
            priceTextField.setText(String.valueOf(total+itemtotal));
            names.add(menuTable.getValueAt(selectedRow, 2).toString());
            pharmaname=menuTable.getValueAt(selectedRow, 2).toString();
            populateItemTable();

        }

    }//GEN-LAST:event_addItemButtonActionPerformed

    private void removeItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemButtonActionPerformed
        // TODO add your handling code here:
        Double total = Double.parseDouble(priceTextField.getText());
        Double itemtotal=0.0;
        int selectedRow = orderTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details", "Warning!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{

            itemtotal=(Double)orderTable.getValueAt(selectedRow, 3);
            items.remove(orderTable.getValueAt(selectedRow, 0));
            priceTextField.setText(String.valueOf(total-itemtotal));
            if (items.isEmpty())
            {
                names.clear();
            }
            populateItemTable();
        }
    }//GEN-LAST:event_removeItemButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        ViewAllOrdersJPanel viewallJPanel = new ViewAllOrdersJPanel(userProcessContainer, enterprise, account, ecosystem);
        userProcessContainer.add("viewJPanel", viewallJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTable;
    private javax.swing.JComboBox<String> orderCombo;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField txtLabMessage;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        Org org = null;
        PharmacyEnterprise restaurant = null;
        HashMap menuItem;
        int rowcount=0;
        List<NetworkSystem> networks = ecosystem.getNetworkSystems();
            int zip = enterprise.getZipcode();
            //
            Object[] row = new Object[3];
            for (NetworkSystem network : networks) {
                if(network.getZipcode()==zip)
                    {
                List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                for (Enterprise enter : enterprises) {
                    
                    
                        if (enter instanceof PharmacyEnterprise) {
                            restaurant = (PharmacyEnterprise) enter;
                            menuItem = restaurant.getMenu();
                            model.setRowCount(rowcount);

                            for (Object i: menuItem.keySet()) {
                                //Object[] row = new Object[2];
                                row[0] = i;
                                row[1] = menuItem.get(i);
                                row[2] = restaurant.getOrgName();

                                model.addRow(row);
                                rowcount++;
                            }
                        }
                        restaurant = null;
                    }
                }
            }
        
    }
    private void populateItemTable() {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        
        model.setRowCount(0);

        for (ItemList itm: items) {
            Object[] row = new Object[4];
            row[0] = itm;
            row[1] = itm.getPrice();
            row[2] = itm.getQuantity();
            row[3] = itm.getTotal();

            model.addRow(row);
        }
    }

}

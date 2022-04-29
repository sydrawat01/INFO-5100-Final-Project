/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.AdminRole;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.List;

import ChemoCare.Ecosystem;
import ChemoCare.Enterprise.Enterprise;
import ChemoCare.Enterprise.CancerCenterEnterprise;
import ChemoCare.Order.Order;
import ChemoCare.Order.OrderDirectory;
import ChemoCare.Org.Org;
import ChemoCare.Org.Org.Type; 
import ChemoCare.Org.OrgDirectory;
import ChemoCare.Patient.Patient;
import ChemoCare.Account.Account;
import ChemoCare.JobQueue.GovtFundJob;
import ChemoCare.JobQueue.OrderJob;
import ChemoCare.JobQueue.JobQueue;
import ChemoCare.JobQueue.JobRequest;
//import ChemoCare.JobQueue.;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author harshita
 */
public class ViewAllOrdersJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Account userAccount;
    private Ecosystem ecosystem;
    List<Order> completed = new ArrayList<>();
    List<Order> inProgress = new ArrayList<>();

    /**
     * Creates new form ViewAllOrdersJPanel
     */
    public ViewAllOrdersJPanel(JPanel userProcessContainer,  Enterprise enterprise, Account account, Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
         populateTable();
    }
     public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();
        CancerCenterEnterprise restaurant = (CancerCenterEnterprise) enterprise;
        List<Order> ordDir = restaurant.getOrderDirectory().getOrderList();
        model.setRowCount(0);
        
        for (JobRequest request : userAccount.getJobQueue().getJobRequestList()) {
            if(request instanceof OrderJob){
            Object[] row = new Object[5];
            row[0] = ((OrderJob) request).getOrder();
            row[1] = ((OrderJob) request).getOrder().getItem();
            row[2] = ((OrderJob) request).getOrder().getAmount();
            row[3] = request.getStatus();
            row[4] = request.getReceiver();
            model.addRow(row);
            if(request.getStatus().equals("Accepted"))
            {
              completed.add(((OrderJob) request).getOrder());
            }
            else
            {
               inProgress.add(((OrderJob) request).getOrder()); 
            }
        }
       }

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewOrderDetails = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblHeaderManageOrg = new javax.swing.JLabel();
        btnViewPie = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();

        setBackground(new java.awt.Color(190, 194, 224));

        btnViewOrderDetails.setBackground(new java.awt.Color(250, 218, 209));
        btnViewOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewOrderDetails.setText("View Order Details");
        btnViewOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderDetailsActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(250, 218, 209));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeaderManageOrg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHeaderManageOrg.setForeground(new java.awt.Color(255, 255, 255));
        lblHeaderManageOrg.setText("All Orders");

        btnViewPie.setBackground(new java.awt.Color(250, 218, 209));
        btnViewPie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewPie.setText("View Stats");
        btnViewPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPieActionPerformed(evt);
            }
        });

        tblOrganization.setBackground(new java.awt.Color(231, 194, 183));
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order#", "Order items", "Order Amount", "Status", "Assigned to"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganization);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHeaderManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnViewPie, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewOrderDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblHeaderManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewPie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderDetailsActionPerformed

        
        
             int selectedRow = tblOrganization.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }
        
        Order order = (Order)tblOrganization.getValueAt(selectedRow, 0);
       
        OrderJob request = null;
        ViewOrdersJPanel viewJPanel = new ViewOrdersJPanel(userProcessContainer, request, order,"admin");
        userProcessContainer.add("viewJPanel", viewJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewOrderDetailsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
               userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        
            RequestFundsJPanel dwjp = (RequestFundsJPanel) component;
            dwjp.populateRequestTable();
       
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPieActionPerformed
        // TODO add your handling code here:
        
//        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
//        defaultPieDataset.setValue("Orders still under Progress", inProgress.size());
//        defaultPieDataset.setValue("Order Completed Successfully", completed.size());
//        JFreeChart chart = ChartFactory.createPieChart("Order Status Pie Chart", defaultPieDataset, true, true, true);
//        PiePlot piePlot =(PiePlot) chart.getPlot();
//        ChartFrame frame = new ChartFrame("Order Status Pie Chart", chart);
//        frame.setVisible(true);
//        frame.setSize(500,500);

    }//GEN-LAST:event_btnViewPieActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewOrderDetails;
    private javax.swing.JButton btnViewPie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeaderManageOrg;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}

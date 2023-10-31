/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Anja
 */
public class Agents extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Agents() {
        initComponents();
        GetAllAgents();
    }
    
    /* Connection with db*/
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tbAgentAge = new javax.swing.JTextField();
        tbAgentId = new javax.swing.JTextField();
        tbAgentName = new javax.swing.JTextField();
        tbAgentPass = new javax.swing.JTextField();
        ddlGender = new javax.swing.JComboBox<>();
        btnAddAgent = new javax.swing.JButton();
        btnUpdateAgent = new javax.swing.JButton();
        btnDeleteAgent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgentsTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        tbAgentPhone = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        lblCompany = new javax.swing.JLabel();
        lblMedicines = new javax.swing.JLabel();
        lblSelling = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        lblCompany1 = new javax.swing.JLabel();
        lblCompany2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(970, 610));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGENTS MANAGING");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("ID:-");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("NAME:-");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("AGE:-");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("PASSWORD:-");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("PHONE:-");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("GENDER:-");

        tbAgentAge.setBackground(new java.awt.Color(0, 0, 0));
        tbAgentAge.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tbAgentAge.setForeground(new java.awt.Color(255, 255, 255));

        tbAgentId.setBackground(new java.awt.Color(0, 0, 0));
        tbAgentId.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tbAgentId.setForeground(new java.awt.Color(255, 255, 255));

        tbAgentName.setBackground(new java.awt.Color(0, 0, 0));
        tbAgentName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tbAgentName.setForeground(new java.awt.Color(255, 255, 255));

        tbAgentPass.setBackground(new java.awt.Color(51, 51, 51));
        tbAgentPass.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tbAgentPass.setForeground(new java.awt.Color(255, 255, 255));

        ddlGender.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ddlGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        btnAddAgent.setBackground(new java.awt.Color(0, 0, 0));
        btnAddAgent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddAgent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAgent.setText("ADD");
        btnAddAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddAgentMouseClicked(evt);
            }
        });

        btnUpdateAgent.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateAgent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdateAgent.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateAgent.setText("UPDATE");
        btnUpdateAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateAgentMouseClicked(evt);
            }
        });

        btnDeleteAgent.setBackground(new java.awt.Color(0, 0, 0));
        btnDeleteAgent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDeleteAgent.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAgent.setText("DELETE");
        btnDeleteAgent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAgentMouseClicked(evt);
            }
        });

        AgentsTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AgentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Phone", "Password", "Gender"
            }
        ));
        AgentsTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        AgentsTable.setRowHeight(25);
        AgentsTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        AgentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgentsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgentsTable);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("AGENTS LIST");

        tbAgentPhone.setBackground(new java.awt.Color(0, 0, 0));
        tbAgentPhone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tbAgentPhone.setForeground(new java.awt.Color(255, 255, 255));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tbAgentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAddAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(43, 43, 43)
                                        .addComponent(ddlGender, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tbAgentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tbAgentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnDeleteAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(430, 430, 430))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(348, 348, 348))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbAgentId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tbAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbAgentAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbAgentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbAgentPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ddlGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCompany.setBackground(new java.awt.Color(255, 255, 255));
        lblCompany.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCompany.setForeground(new java.awt.Color(255, 255, 255));
        lblCompany.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompany.setText("COMPANY");
        lblCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompanyMouseClicked(evt);
            }
        });

        lblMedicines.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicines.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMedicines.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicines.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicines.setText("MEDICINES");
        lblMedicines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMedicinesMouseClicked(evt);
            }
        });

        lblSelling.setBackground(new java.awt.Color(255, 255, 255));
        lblSelling.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSelling.setForeground(new java.awt.Color(255, 255, 255));
        lblSelling.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSelling.setText("SELLING");
        lblSelling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSellingMouseClicked(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("  X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        lblCompany1.setBackground(new java.awt.Color(255, 255, 255));
        lblCompany1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCompany1.setForeground(new java.awt.Color(255, 255, 0));
        lblCompany1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompany1.setText("AGENTS");
        lblCompany1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompany1MouseClicked(evt);
            }
        });

        lblCompany2.setBackground(new java.awt.Color(255, 255, 255));
        lblCompany2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCompany2.setForeground(new java.awt.Color(255, 255, 255));
        lblCompany2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCompany2.setText("PharmAssist");
        lblCompany2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCompany2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblCompany2)
                .addGap(95, 95, 95)
                .addComponent(lblSelling)
                .addGap(101, 101, 101)
                .addComponent(lblMedicines)
                .addGap(101, 101, 101)
                .addComponent(lblCompany)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCompany1)
                .addGap(86, 86, 86)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelling, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCompany1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCompany2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void GetAllAgents()
    {
        try {
           conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","Pass@1234");
           st = conn.createStatement();
           rs = st.executeQuery("Select * from user1.agents");
           AgentsTable.setModel(DbUtils.resultSetToTableModel(rs));
           
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
    
    private void lblCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompanyMouseClicked
        new Company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCompanyMouseClicked

    private void lblMedicinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicinesMouseClicked
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMedicinesMouseClicked

    private void lblSellingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSellingMouseClicked
         new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSellingMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

      /* clear fields */
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked

        tbAgentId.setText("");
        tbAgentName.setText("");
        tbAgentAge.setText("");
        tbAgentPhone.setText("");
        tbAgentPass.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    /* update existing agent by click on wanted table row*/
    private void AgentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgentsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)AgentsTable.getModel();
        int myIndex = AgentsTable.getSelectedRow();
        tbAgentId.setText(model.getValueAt(myIndex, 0).toString());
        tbAgentName.setText(model.getValueAt(myIndex, 1).toString());
        tbAgentAge.setText(model.getValueAt(myIndex, 2).toString());
        tbAgentPhone.setText(model.getValueAt(myIndex, 3).toString());
        tbAgentPass.setText(model.getValueAt(myIndex, 4).toString());
    }//GEN-LAST:event_AgentsTableMouseClicked

      /* delete existing agent */
    private void btnDeleteAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAgentMouseClicked

        if (tbAgentId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter ID of The Agent To Be Deleted....");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","Pass@1234");
                String id = tbAgentId.getText();
                String query = "Delete from user1.agents where id = " + id;
                Statement st = conn.createStatement();
                st.executeUpdate(query);

                GetAllAgents();
                JOptionPane.showMessageDialog(this, "Agent Successfully Deleted!");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnDeleteAgentMouseClicked

    /* update existing agent */
    private void btnUpdateAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateAgentMouseClicked

        if (tbAgentId.getText().isEmpty() || tbAgentName.getText().isEmpty() || tbAgentAge.getText().isEmpty() || tbAgentPhone.getText().isEmpty() || tbAgentPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information about Agent");
        }
        else
        {
            try {
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","Pass@1234");
                PreparedStatement ps = conn.prepareStatement("update agents set name=?, age=?, phone=?, password=?, gender=? where id=?");

                ps.setString(1, tbAgentName.getText());
                ps.setInt(2, Integer.valueOf(tbAgentAge.getText()));
                ps.setString(3, tbAgentPhone.getText());
                ps.setString(4, tbAgentPass.getText());
                ps.setString(5, ddlGender.getSelectedItem().toString());
                ps.setInt(6, Integer.valueOf(tbAgentId.getText()));

                ps.executeUpdate();

                GetAllAgents();
                JOptionPane.showMessageDialog(this, "Agent Successfully Updated!");

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnUpdateAgentMouseClicked

     /* insert new agent */
    private void btnAddAgentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAgentMouseClicked

        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmacy","user1","Pass@1234");
            PreparedStatement ps = conn.prepareStatement("insert into agents values(?,?,?,?,?,?)");

            ps.setInt(1, Integer.valueOf(tbAgentId.getText()));
            ps.setString(2, tbAgentName.getText());
            ps.setInt(3, Integer.valueOf(tbAgentAge.getText()));
            ps.setString(4, tbAgentPhone.getText());
            ps.setString(5, tbAgentPass.getText());
            ps.setString(6, ddlGender.getSelectedItem().toString());

            int row =  ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Agent Successfully Added!");
            conn.close();
            GetAllAgents();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnAddAgentMouseClicked

    private void lblCompany1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompany1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCompany1MouseClicked

    private void lblCompany2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCompany2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCompany2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AgentsTable;
    private javax.swing.JButton btnAddAgent;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteAgent;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnUpdateAgent;
    private javax.swing.JComboBox<String> ddlGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCompany1;
    private javax.swing.JLabel lblCompany2;
    private javax.swing.JLabel lblMedicines;
    private javax.swing.JLabel lblSelling;
    private javax.swing.JTextField tbAgentAge;
    private javax.swing.JTextField tbAgentId;
    private javax.swing.JTextField tbAgentName;
    private javax.swing.JTextField tbAgentPass;
    private javax.swing.JTextField tbAgentPhone;
    // End of variables declaration//GEN-END:variables
}

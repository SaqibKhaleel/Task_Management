/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workflowmanagement;

import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hatim
 */
public class DirectorFrame extends javax.swing.JFrame {

    /**
     * Creates new form DirectorFrame2
     */
    UserInfo info;
    DefaultTableModel emp_model;
    DefaultTableModel projects_model;
    DefaultListModel emp_list;
    String emp_name;
    int flag;
    WFMdatabase db;
    
     public DirectorFrame(UserInfo info) {
          initComponents();
        this.info = info;
        db = new WFMdatabase(this);
        emp_model = (DefaultTableModel) employee_table.getModel();
        projects_model = (DefaultTableModel) projects_table.getModel();
        emp_list = new DefaultListModel();
        set_profile();
        set_project_details();
        set_employee_details();
        set_sm_tab();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        profile_info = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        first_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        last_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        designation = new javax.swing.JLabel();
        project_details = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        projects_table = new javax.swing.JTable();
        employee_details = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        employee_table = new javax.swing.JTable();
        appoint_sm = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        current_sm = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        employee_list = new javax.swing.JList();
        appoint = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        add_project = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("First name");

        first_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        first_name.setText("jLabel5");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Last name");

        last_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        last_name.setText("jLabel5");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Age");

        Age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Age.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sex");

        sex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sex.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setText("jLabel5");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Designation");

        designation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        designation.setText("jLabel5");

        javax.swing.GroupLayout profile_infoLayout = new javax.swing.GroupLayout(profile_info);
        profile_info.setLayout(profile_infoLayout);
        profile_infoLayout.setHorizontalGroup(
            profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_infoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(profile_infoLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(last_name))
                        .addGroup(profile_infoLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(87, 87, 87)
                            .addComponent(first_name)))
                    .addGroup(profile_infoLayout.createSequentialGroup()
                        .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profile_infoLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(113, 113, 113))
                                .addGroup(profile_infoLayout.createSequentialGroup()
                                    .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(118, 118, 118)))
                            .addGroup(profile_infoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(81, 81, 81)))
                        .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(designation)
                            .addComponent(sex)
                            .addComponent(Age)
                            .addComponent(email))))
                .addContainerGap(686, Short.MAX_VALUE))
        );
        profile_infoLayout.setVerticalGroup(
            profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profile_infoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(first_name))
                .addGap(28, 28, 28)
                .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(last_name))
                .addGap(34, 34, 34)
                .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Age))
                .addGap(29, 29, 29)
                .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sex))
                .addGap(28, 28, 28)
                .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email))
                .addGap(27, 27, 27)
                .addGroup(profile_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(designation))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", profile_info);

        projects_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Project name", "Project manager"
            }
        ));
        jScrollPane7.setViewportView(projects_table);

        javax.swing.GroupLayout project_detailsLayout = new javax.swing.GroupLayout(project_details);
        project_details.setLayout(project_detailsLayout);
        project_detailsLayout.setHorizontalGroup(
            project_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(project_detailsLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        project_detailsLayout.setVerticalGroup(
            project_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, project_detailsLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        jTabbedPane1.addTab("Project Details", project_details);

        employee_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee name", "Designation"
            }
        ));
        jScrollPane8.setViewportView(employee_table);

        javax.swing.GroupLayout employee_detailsLayout = new javax.swing.GroupLayout(employee_details);
        employee_details.setLayout(employee_detailsLayout);
        employee_detailsLayout.setHorizontalGroup(
            employee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employee_detailsLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        employee_detailsLayout.setVerticalGroup(
            employee_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employee_detailsLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        jTabbedPane1.addTab("Employee details", employee_details);

        jLabel13.setText("Current SM : ");

        current_sm.setText("jLabel12");

        jLabel14.setText("Select from the following list of employees");

        employee_list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(employee_list);

        appoint.setText("Appoint");
        appoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appoint_smLayout = new javax.swing.GroupLayout(appoint_sm);
        appoint_sm.setLayout(appoint_smLayout);
        appoint_smLayout.setHorizontalGroup(
            appoint_smLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoint_smLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(appoint_smLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appoint)
                    .addGroup(appoint_smLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(32, 32, 32)
                        .addComponent(current_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(666, Short.MAX_VALUE))
        );
        appoint_smLayout.setVerticalGroup(
            appoint_smLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appoint_smLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(appoint_smLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(current_sm))
                .addGap(52, 52, 52)
                .addComponent(jLabel14)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(appoint)
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("Appoint SM", appoint_sm);

        Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Title.setText("Welcome Mr Director");

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        add_project.setText("Add project");
        add_project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_projectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout)
                            .addComponent(add_project, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(add_project)
                .addGap(47, 47, 47)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void add_projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_projectActionPerformed
        
        String pname = JOptionPane.showInputDialog(this, "Enter project name", "Insert project",JOptionPane.WARNING_MESSAGE);
        db.insert_project_info(pname, "");
         JOptionPane.showMessageDialog(this,"Project successfully added");
         set_project_details();
        
    }//GEN-LAST:event_add_projectActionPerformed

    private void appointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointActionPerformed
        emp_name = (String) employee_list.getSelectedValue();
        if(flag==0){
            db.appoint_sm(emp_name);
            JOptionPane.showMessageDialog(this, "SM successfully appointed");
        }
        else
        {
            db.replace_sm(emp_name);
            JOptionPane.showMessageDialog(this, "SM successfully replaced");
        }
    }//GEN-LAST:event_appointActionPerformed

    public void set_profile(){
        first_name.setText(info.getFirst_name());
        last_name.setText(info.getLast_name());
        Age.setText(String.valueOf(info.getAge()));
        sex.setText(info.getSex());
        email.setText(info.getEmail());
        designation.setText(info.getDesig());
    }
    
    
    public void set_project_details(){
    ResultSet rs = db.get_project_info();
    try{
    projects_model.setRowCount(0);
    while(!rs.isAfterLast()){
      
        if(rs.getString(2).equals(""))
             projects_model.addRow(new Object[]{rs.getString(1),"Not appointed"});
        else 
             projects_model.addRow(new Object[]{rs.getString(1),rs.getString(2)});
        rs.next();
    }
    }
    catch(Exception e){
        
    }
     }
    public void set_employee_details(){
      try{
            emp_model.setRowCount(0);
             ResultSet rs = db.get_emp_list();
             while(!rs.isAfterLast()){
                 if(rs.getString(3).equals(""))
                       emp_model.addRow(new Object[]{rs.getString(1)+ " "+rs.getString(2), "Not Appointed"});
                 else
                       emp_model.addRow(new Object[]{rs.getString(1)+ " "+rs.getString(2), rs.getString(3)});
                 rs.next();
             }
         }
         catch(Exception e){
             
         }
    }
    
    
     public void set_emp_list(){
         
      
        try{
            emp_list.clear();
             ResultSet rs = db.get_emp_list_no_desig();
             while(!rs.isAfterLast()){
                 emp_list.addElement(rs.getString(1));
                 rs.next();
             }
             employee_list.setModel(emp_list);
         }
         catch(Exception e){
             
         }
     }
    public void set_sm_tab(){
        flag = db.check_sm_exists();
        if(flag==0){
            current_sm.setText("Not appointed");
        }
        else
            current_sm.setText(db.get_sm());
    }
     
        
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel Title;
    private javax.swing.JButton add_project;
    private javax.swing.JButton appoint;
    private javax.swing.JPanel appoint_sm;
    private javax.swing.JLabel current_sm;
    private javax.swing.JLabel designation;
    private javax.swing.JLabel email;
    private javax.swing.JPanel employee_details;
    private javax.swing.JList employee_list;
    private javax.swing.JTable employee_table;
    private javax.swing.JLabel first_name;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel last_name;
    private javax.swing.JButton logout;
    private javax.swing.JPanel profile_info;
    private javax.swing.JPanel project_details;
    private javax.swing.JTable projects_table;
    private javax.swing.JLabel sex;
    // End of variables declaration//GEN-END:variables
}

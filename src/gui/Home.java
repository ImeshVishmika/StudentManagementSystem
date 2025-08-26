package gui;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import model.LoadData;
import panel.Dashboard;
import panel.Students;
import panel.Teachers;
import panel.Units;

public class Home extends javax.swing.JFrame {

    private static Home home;

    private Home() {
        initComponents();
        //new LoadData("imesh");
        loadPanels();
    }

    public static synchronized Home getHome() {
        if (home == null) {
            home = new Home();
        }
        return home;
    }

    public static CardLayout cardLayout;
    private Students students;
    private Teachers teachers;
    private Units units;
    private Dashboard dashboard;
    private static JButton previousbtn;

    public static void activebtn(JButton activebtn) {
        resetPreviousbtn();
        activebtn.setBackground(new Color(15, 50, 95, 255));
        previousbtn = activebtn;
    }

    public static void resetPreviousbtn() {
        if (previousbtn != null) {
            previousbtn.setBackground(new Color(21, 65, 106, 255));
        }
    }

    private void loadPanels() {

        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);

        students = new Students();
        teachers = new Teachers();
        units = new Units();
        dashboard = new Dashboard();

        mainPanel.add(students, "Students");
        mainPanel.add(teachers, "Teachers");
        mainPanel.add(dashboard, "Dashboard");
        mainPanel.add(units, "Units");

        dashboardbtn.doClick();
    }

    public void showPanel(String panelName, JButton btnName) {
        activebtn(btnName);
        cardLayout.show(mainPanel, panelName);
    }

    public JButton getStudetsBtn() {
        return studentbtn;
    }

    public JButton getTeachersBtn() {
        return teachersbtn;
    }

    public JButton getUnitButton() {
        return unitsbtn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dashboardbtn = new javax.swing.JButton();
        unitsbtn = new javax.swing.JButton();
        teachersbtn = new javax.swing.JButton();
        studentbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Managment System");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("List.cellFocusColor"));
        jPanel1.setForeground(new java.awt.Color(0, 50, 232));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("List.cellFocusColor"));
        jPanel2.setForeground(new java.awt.Color(0, 50, 232));
        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        dashboardbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("List.cellFocusColor"));
        dashboardbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        dashboardbtn.setForeground(new java.awt.Color(255, 255, 255));
        dashboardbtn.setText("Dashboard");
        dashboardbtn.setBorder(null);
        dashboardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardbtnActionPerformed(evt);
            }
        });
        jPanel2.add(dashboardbtn);

        unitsbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("List.cellFocusColor"));
        unitsbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        unitsbtn.setForeground(new java.awt.Color(255, 255, 255));
        unitsbtn.setText("Units");
        unitsbtn.setBorder(null);
        unitsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsbtnActionPerformed(evt);
            }
        });
        jPanel2.add(unitsbtn);

        teachersbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("List.cellFocusColor"));
        teachersbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        teachersbtn.setForeground(new java.awt.Color(255, 255, 255));
        teachersbtn.setText("Teachers");
        teachersbtn.setBorder(null);
        teachersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersbtnActionPerformed(evt);
            }
        });
        jPanel2.add(teachersbtn);

        studentbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("List.cellFocusColor"));
        studentbtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        studentbtn.setForeground(new java.awt.Color(255, 255, 255));
        studentbtn.setText("Students");
        studentbtn.setBorder(null);
        studentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentbtnActionPerformed(evt);
            }
        });
        jPanel2.add(studentbtn);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 228, 255));
        jLabel1.setText("Imesh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void studentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentbtnActionPerformed
        showPanel("Students", studentbtn);
    }//GEN-LAST:event_studentbtnActionPerformed

    private void unitsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsbtnActionPerformed
        showPanel("Units", unitsbtn);
    }//GEN-LAST:event_unitsbtnActionPerformed

    private void teachersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersbtnActionPerformed
        showPanel("Teachers", teachersbtn);
    }//GEN-LAST:event_teachersbtnActionPerformed

    private void dashboardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardbtnActionPerformed
        showPanel("Dashboard", dashboardbtn);
    }//GEN-LAST:event_dashboardbtnActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dashboardbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton studentbtn;
    private javax.swing.JButton teachersbtn;
    private javax.swing.JButton unitsbtn;
    // End of variables declaration//GEN-END:variables
}

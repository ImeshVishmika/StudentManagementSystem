package gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.GradeData;
import model.ComboItem;
import model.SubjectData;
import dto.Subject;

public class SubjectRegister extends javax.swing.JFrame {

    private final SubjectData data = new SubjectData();
    private final GradeData grades = new GradeData();
    private String selectedGrade;

    public SubjectRegister() {
        initComponents();
        roundPanels();
        LoadGrades();
    }

    private void LoadGrades() {
        List<ComboItem> g = grades.loadData();
        DefaultComboBoxModel<ComboItem> model = new DefaultComboBoxModel<>();
        for (ComboItem item : g) {
            model.addElement(item);
        }

        gradeList.setModel(model);
    }


    private void roundPanels() {
        emailPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        gradePanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderItems = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        emailPanel = new javax.swing.JPanel();
        subjectName = new javax.swing.JTextField();
        gradePanel = new javax.swing.JPanel();
        gradeList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);

        jPanel5.setLayout(new java.awt.GridLayout(2, 0, 20, 30));

        emailPanel.setBackground(new java.awt.Color(255, 255, 255));
        emailPanel.setForeground(new java.awt.Color(255, 255, 255));

        subjectName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subjectName.setForeground(new java.awt.Color(153, 153, 153));
        subjectName.setText("Subject Name");
        subjectName.setBorder(null);
        subjectName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subjectNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subjectNameMouseExited(evt);
            }
        });
        subjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.add(emailPanel);

        gradePanel.setBackground(new java.awt.Color(255, 255, 255));
        gradePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "Garde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N
        gradePanel.setForeground(new java.awt.Color(255, 255, 255));
        gradePanel.setLayout(new java.awt.GridLayout(1, 0));

        gradeList.setForeground(new java.awt.Color(102, 102, 102));
        gradeList.setBorder(null);
        gradeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradeListMouseEntered(evt);
            }
        });
        gradeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeListActionPerformed(evt);
            }
        });
        gradePanel.add(gradeList);

        jPanel5.add(gradePanel);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Subject Register");

        registerBtn.setBackground(new java.awt.Color(51, 204, 255));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(227, 254, 254));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectNameActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed

        String sname = subjectName.getText();

        String errMsg = "";
        int x = 0;

        if (sname.equals("Email")) {
            errMsg += " Email ";
            x++;
        }

        if (x > 0) {
            String field = "field is ";
            if (x > 1) {
                field = "fields are ";
            }
            JOptionPane.showMessageDialog(this, errMsg + field + "Empty", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            
            Subject subject = new Subject(sname,selectedGrade);

                boolean success = data.addSubject(subject);
                if (success == true) {
                    JOptionPane.showMessageDialog(this, "Registration Successful", "", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new SubjectRegister().setVisible(true);
                }

        }


    }//GEN-LAST:event_registerBtnActionPerformed

    private void subjectNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectNameMouseEntered
        if (subjectName.getText().equals("Subject Name")) {
            subjectName.setForeground(new Color(0, 0, 0));
            subjectName.setText("");
        }
    }//GEN-LAST:event_subjectNameMouseEntered

    private void subjectNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectNameMouseExited
        if (subjectName.getText().trim().isBlank()) {
            subjectName.setForeground(new Color(153, 153, 153));
            subjectName.setText("Subject Name");
        }
    }//GEN-LAST:event_subjectNameMouseExited

    private void gradeListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeListMouseEntered

    }//GEN-LAST:event_gradeListMouseEntered

    private void gradeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeListActionPerformed
        ComboItem s = (ComboItem) gradeList.getSelectedItem();
        selectedGrade = s.getValue();
    }//GEN-LAST:event_gradeListActionPerformed

    private void gradeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeListMouseClicked

    }//GEN-LAST:event_gradeListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel emailPanel;
    private javax.swing.ButtonGroup genderItems;
    private javax.swing.JComboBox<model.ComboItem> gradeList;
    private javax.swing.JPanel gradePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField subjectName;
    // End of variables declaration//GEN-END:variables
}

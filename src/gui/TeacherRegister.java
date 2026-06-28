package gui;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import model.GradeData;
import model.ComboItem;
import model.Teacher;
import dto.Subject;
import model.SubjectData;
import model.TeacherData;

public class TeacherRegister extends javax.swing.JFrame {

    private final TeacherData data = new TeacherData();
    private final GradeData grades = new GradeData();
    private final SubjectData subjects = new SubjectData();
    private List<Subject> sub;
    private String selectedGrade;

    public TeacherRegister() {
        initComponents();
        roundPanels();
        LoadGrades();
        LoadSubjects();
    }

    private void LoadGrades() {
        List<ComboItem> g = grades.loadData();
        DefaultComboBoxModel<ComboItem> model = new DefaultComboBoxModel<>();
        for (ComboItem item : g) {
            model.addElement(item);
        }

        gradeList.setModel(model);
    }

    private void LoadSubjects() {
        sub = subjects.loadSubjects(selectedGrade);
        for (Subject s : sub) {            
            String index=String.valueOf(sub.lastIndexOf(s));
            JCheckBox sub1 = new JCheckBox();
            sub1.setName(index);
            sub1.setForeground(new Color(130, 130, 130));
            sub1.setText(s.getGrade() + "th Grade " + s.getSubjectName());
            subPanel.add(sub1);
        }

    }

    private void roundPanels() {
        firstNamePanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        lastNamePanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        emailPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        nicPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        genderPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        gradePanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
        subPanel.putClientProperty(FlatClientProperties.STYLE, "arc:20");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderItems = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        namePanel = new javax.swing.JPanel();
        firstNamePanel = new javax.swing.JPanel();
        firstName = new javax.swing.JTextField();
        lastNamePanel = new javax.swing.JPanel();
        lastName = new javax.swing.JTextField();
        nicPanel = new javax.swing.JPanel();
        nic = new javax.swing.JTextField();
        emailPanel = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        genderPanel = new javax.swing.JPanel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        gradePanel = new javax.swing.JPanel();
        gradeList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

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

        jPanel5.setLayout(new java.awt.GridLayout(4, 0, 20, 30));

        namePanel.setLayout(new java.awt.GridLayout(0, 2, 5, 0));

        firstNamePanel.setBackground(new java.awt.Color(255, 255, 255));
        firstNamePanel.setForeground(new java.awt.Color(255, 255, 255));
        firstNamePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstName.setForeground(new java.awt.Color(153, 153, 153));
        firstName.setText("FirstName");
        firstName.setBorder(null);
        firstName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstName.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        firstName.setSelectionColor(new java.awt.Color(255, 255, 255));
        firstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                firstNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                firstNameMouseExited(evt);
            }
        });
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstNamePanelLayout = new javax.swing.GroupLayout(firstNamePanel);
        firstNamePanel.setLayout(firstNamePanelLayout);
        firstNamePanelLayout.setHorizontalGroup(
            firstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        firstNamePanelLayout.setVerticalGroup(
            firstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        namePanel.add(firstNamePanel);

        lastNamePanel.setBackground(new java.awt.Color(255, 255, 255));
        lastNamePanel.setForeground(new java.awt.Color(255, 255, 255));

        lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastName.setForeground(new java.awt.Color(153, 153, 153));
        lastName.setText("LastName");
        lastName.setBorder(null);
        lastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lastNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lastNameMouseExited(evt);
            }
        });

        javax.swing.GroupLayout lastNamePanelLayout = new javax.swing.GroupLayout(lastNamePanel);
        lastNamePanel.setLayout(lastNamePanelLayout);
        lastNamePanelLayout.setHorizontalGroup(
            lastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastNamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        lastNamePanelLayout.setVerticalGroup(
            lastNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        namePanel.add(lastNamePanel);

        jPanel5.add(namePanel);

        nicPanel.setBackground(new java.awt.Color(255, 255, 255));
        nicPanel.setForeground(new java.awt.Color(255, 255, 255));

        nic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nic.setForeground(new java.awt.Color(153, 153, 153));
        nic.setText("NIC");
        nic.setBorder(null);
        nic.setName(""); // NOI18N
        nic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nicMouseExited(evt);
            }
        });
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nicPanelLayout = new javax.swing.GroupLayout(nicPanel);
        nicPanel.setLayout(nicPanelLayout);
        nicPanelLayout.setHorizontalGroup(
            nicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        nicPanelLayout.setVerticalGroup(
            nicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nic, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.add(nicPanel);

        emailPanel.setBackground(new java.awt.Color(255, 255, 255));
        emailPanel.setForeground(new java.awt.Color(255, 255, 255));

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("Email");
        email.setBorder(null);
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailMouseExited(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.add(emailPanel);

        jPanel6.setLayout(new java.awt.GridLayout(0, 2, 10, 0));

        genderPanel.setBackground(new java.awt.Color(255, 255, 255));
        genderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "Gender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N
        genderPanel.setForeground(new java.awt.Color(255, 255, 255));
        genderPanel.setLayout(new java.awt.GridLayout(1, 0));

        genderItems.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        male.setForeground(new java.awt.Color(102, 102, 102));
        male.setText("Male");
        genderPanel.add(male);

        genderItems.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        female.setForeground(new java.awt.Color(102, 102, 102));
        female.setText("Female");
        genderPanel.add(female);

        jPanel6.add(genderPanel);

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

        jPanel6.add(gradePanel);

        jPanel5.add(jPanel6);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Teacher Register");

        registerBtn.setBackground(new java.awt.Color(51, 204, 255));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(227, 254, 254));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        subPanel.setBackground(new java.awt.Color(255, 255, 255));
        subPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)), "Subjects", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N
        subPanel.setLayout(new java.awt.GridLayout(0, 1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Select  Subject");
        subPanel.add(jLabel2);

        jScrollPane1.setViewportView(subPanel);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(287, 287, 287))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(registerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed

        String fname = firstName.getText();
        String lname = lastName.getText();
        String mail = email.getText();
        String id = nic.getText();
        String gender = null;
        List<Subject> selectedSubjects = new ArrayList<>();

        String errMsg = "";
        int x = 0;

        for (java.awt.Component c : subPanel.getComponents()) {
            if (c instanceof JCheckBox cbox) {
                if (cbox.isSelected()) {
                    int index=Integer.parseInt(c.getName());
                    selectedSubjects.add(sub.get(index));
                }
            }
        }

        if (selectedSubjects.isEmpty()) {
            errMsg = " Subject ";
            x++;
        }

        if (fname.equals("FirstName")) {
            errMsg += " FirstName ";
            x++;
        }
        if (lname.equals("LastName")) {
            errMsg += " LastName ";
            x++;
        }
        if (mail.equals("Email")) {
            errMsg += " Email ";
            x++;
        }
        if (id.equals("NIC")) {
            errMsg += " NIC ";
            x++;
        }

        if (male.isSelected()) {
            gender = "1";
        } else if (female.isSelected()) {
            gender = "2";
        } else {
            x++;
            errMsg += " Gender ";
        }

        if (x > 0) {
            String field = "field is ";
            if (x > 1) {
                field = "fields are ";
            }
            JOptionPane.showMessageDialog(this, errMsg + field + "Empty", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {

            if (data.verifyData(nic.getText(), email.getText())) {
                Teacher t = new Teacher(id, fname, lname, mail, gender,selectedSubjects);
                boolean success = data.addData(t);
                if (success == true) {
                    JOptionPane.showMessageDialog(this, "Registration Successful", "", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                    new TeacherRegister().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "NIC or Email already registered", "Error Message", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_registerBtnActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed

    }//GEN-LAST:event_firstNameActionPerformed

    private void firstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameMouseClicked

    }//GEN-LAST:event_firstNameMouseClicked

    private void firstNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameMouseEntered
        if (firstName.getText().equals("FirstName")) {
            firstName.setText("");
            firstName.setForeground(new Color(0, 0, 0));
        }

    }//GEN-LAST:event_firstNameMouseEntered

    private void firstNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameMouseExited
        if (firstName.getText().trim().isBlank()) {
            firstName.setForeground(new Color(153, 153, 153));
            firstName.setText("FirstName");
        }
    }//GEN-LAST:event_firstNameMouseExited

    private void nicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicMouseEntered
        if (nic.getText().equals("NIC")) {
            nic.setForeground(new Color(0, 0, 0));
            nic.setText("");
        }
    }//GEN-LAST:event_nicMouseEntered

    private void nicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nicMouseExited
        if (nic.getText().trim().isBlank()) {
            nic.setForeground(new Color(153, 153, 153));
            nic.setText("NIC");
        }

    }//GEN-LAST:event_nicMouseExited

    private void lastNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameMouseEntered
        if (lastName.getText().equals("LastName")) {
            lastName.setForeground(new Color(0, 0, 0));
            lastName.setText("");
        }
    }//GEN-LAST:event_lastNameMouseEntered

    private void lastNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameMouseExited
        if (lastName.getText().trim().isBlank()) {
            lastName.setForeground(new Color(153, 153, 153));
            lastName.setText("LastName");
        }
    }//GEN-LAST:event_lastNameMouseExited

    private void emailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseEntered
        if (email.getText().equals("Email")) {
            email.setForeground(new Color(0, 0, 0));
            email.setText("");
        }
    }//GEN-LAST:event_emailMouseEntered

    private void emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseExited
        if (email.getText().trim().isBlank()) {
            email.setForeground(new Color(153, 153, 153));
            email.setText("Email");
        }
    }//GEN-LAST:event_emailMouseExited

    private void gradeListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeListMouseEntered

    }//GEN-LAST:event_gradeListMouseEntered

    private void gradeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeListActionPerformed
        subPanel.removeAll();
        ComboItem s = (ComboItem) gradeList.getSelectedItem();
        selectedGrade = s.getValue();
        LoadSubjects();
        subPanel.revalidate();
        subPanel.repaint();
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
                new TeacherRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private javax.swing.JPanel firstNamePanel;
    private javax.swing.ButtonGroup genderItems;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JComboBox<model.ComboItem> gradeList;
    private javax.swing.JPanel gradePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JPanel lastNamePanel;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTextField nic;
    private javax.swing.JPanel nicPanel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel subPanel;
    // End of variables declaration//GEN-END:variables
}

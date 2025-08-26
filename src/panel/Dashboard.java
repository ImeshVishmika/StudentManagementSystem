package panel;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import gui.Home;
import model.StudentData;



public class Dashboard extends javax.swing.JPanel {
    
    private final StudentData data=new StudentData();

    public Dashboard() {
        initComponents();
        init();
        SetStudentCount();
    }
    
    private void SetStudentCount(){
        String count=data.studentCount();
        studentCount.setText(count);
    }

    private void init() {
        studentcard.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        studentIcon.setIcon(new FlatSVGIcon("icon/Test.svg", 100, 100));
        teachercard.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        teacherIcon.setIcon(new FlatSVGIcon("icon/teacher.svg", 100, 100));
        unitcard.putClientProperty(FlatClientProperties.STYLE, "arc:10");
        unitIcon.setIcon(new FlatSVGIcon("icon/sub.svg",100,100));               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        studentcard = new javax.swing.JPanel();
        studentCount = new javax.swing.JLabel();
        dsstudentbtn = new javax.swing.JButton();
        studentIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        teachercard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dsteachersbtn = new javax.swing.JButton();
        teacherIcon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        unitcard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        unitIcon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("Dashboard");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        studentcard.setBackground(new java.awt.Color(0, 197, 255));

        studentCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        studentCount.setForeground(new java.awt.Color(255, 255, 255));
        studentCount.setText("5");

        dsstudentbtn.setBackground(new java.awt.Color(0, 173, 255));
        dsstudentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dsstudentbtn.setForeground(new java.awt.Color(170, 255, 255));
        dsstudentbtn.setText("More Info >>");
        dsstudentbtn.setBorder(null);
        dsstudentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsstudentbtnActionPerformed(evt);
            }
        });

        studentIcon.setBackground(new java.awt.Color(0, 197, 255));

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Students");

        javax.swing.GroupLayout studentcardLayout = new javax.swing.GroupLayout(studentcard);
        studentcard.setLayout(studentcardLayout);
        studentcardLayout.setHorizontalGroup(
            studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcardLayout.createSequentialGroup()
                .addGroup(studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(studentCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(studentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(dsstudentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentcardLayout.setVerticalGroup(
            studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentcardLayout.createSequentialGroup()
                .addGroup(studentcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(studentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentcardLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(studentCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsstudentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jPanel1.add(studentcard);

        teachercard.setBackground(new java.awt.Color(0, 217, 89));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("5");

        dsteachersbtn.setBackground(new java.awt.Color(0, 183, 119));
        dsteachersbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dsteachersbtn.setForeground(new java.awt.Color(205, 253, 205));
        dsteachersbtn.setText("More Info >>");
        dsteachersbtn.setBorder(null);
        dsteachersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsteachersbtnActionPerformed(evt);
            }
        });

        teacherIcon.setBackground(new java.awt.Color(0, 217, 89));

        jLabel5.setBackground(new java.awt.Color(0, 255, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(205, 253, 205));
        jLabel5.setText("Teachers");

        javax.swing.GroupLayout teachercardLayout = new javax.swing.GroupLayout(teachercard);
        teachercard.setLayout(teachercardLayout);
        teachercardLayout.setHorizontalGroup(
            teachercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dsteachersbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(teachercardLayout.createSequentialGroup()
                .addGroup(teachercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teachercardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addGroup(teachercardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        teachercardLayout.setVerticalGroup(
            teachercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachercardLayout.createSequentialGroup()
                .addGroup(teachercardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(teachercardLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addComponent(teacherIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dsteachersbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jPanel1.add(teachercard);

        unitcard.setBackground(new java.awt.Color(255, 125, 129));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("5");

        jButton1.setBackground(new java.awt.Color(252, 99, 99));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 204));
        jButton1.setText("More Info >>");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        unitIcon.setBackground(new java.awt.Color(255, 125, 129));

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Units");

        javax.swing.GroupLayout unitcardLayout = new javax.swing.GroupLayout(unitcard);
        unitcard.setLayout(unitcardLayout);
        unitcardLayout.setHorizontalGroup(
            unitcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitcardLayout.createSequentialGroup()
                .addGroup(unitcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(unitcardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(unitcardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(unitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        unitcardLayout.setVerticalGroup(
            unitcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unitcardLayout.createSequentialGroup()
                .addGroup(unitcardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(unitcardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(unitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(unitcardLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jPanel1.add(unitcard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dsstudentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsstudentbtnActionPerformed
          Home h=Home.getHome();
          h.showPanel("Students",h.getStudetsBtn());
    }//GEN-LAST:event_dsstudentbtnActionPerformed

    private void dsteachersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsteachersbtnActionPerformed
          Home h=Home.getHome();
          h.showPanel("Teachers",h.getTeachersBtn());
    }//GEN-LAST:event_dsteachersbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Home h=Home.getHome();
        h.showPanel("Units",h.getUnitButton());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dsstudentbtn;
    private javax.swing.JButton dsteachersbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel studentCount;
    private javax.swing.JLabel studentIcon;
    private javax.swing.JPanel studentcard;
    private javax.swing.JLabel teacherIcon;
    private javax.swing.JPanel teachercard;
    private javax.swing.JLabel unitIcon;
    private javax.swing.JPanel unitcard;
    // End of variables declaration//GEN-END:variables
}

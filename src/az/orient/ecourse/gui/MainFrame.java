/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package az.orient.ecourse.gui;

import az.orient.ecourse.dao.StudentDao;
import az.orient.ecourse.dao.TeacherDao;
import az.orient.ecourse.model.LoginUser;
import az.orient.ecourse.model.Payment;
import az.orient.ecourse.model.Student;
import az.orient.ecourse.model.Teacher;
import az.orient.ecourse.service.LessonService;
import az.orient.ecourse.service.PaymentService;
import az.orient.ecourse.service.StudentService;
import az.orient.ecourse.service.TeacherService;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class MainFrame extends javax.swing.JFrame {

    private String globBtnName = "";
    private StudentService studentService;
    private TeacherService teacherService;
    private LessonService lessonService;
    private PaymentService paymentService;
    private LoginUser loginUser;

    public MainFrame() {
        initComponents();
    }

    public MainFrame(StudentService studentService, TeacherService teacherService, LessonService lessonService, PaymentService paymentService, LoginUser loginUser) {
        initComponents();
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.lessonService = lessonService;
        this.paymentService = paymentService;
        this.loginUser = loginUser;
        showLoginInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        studentDataBtn = new javax.swing.JButton();
        teacherDataBtn = new javax.swing.JButton();
        lessonDataBtn = new javax.swing.JButton();
        paymentDataBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        newBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        keywordTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E-course");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        studentDataBtn.setText("Student Data");
        studentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDataBtnActionPerformed(evt);
            }
        });

        teacherDataBtn.setText("Teacher Data");
        teacherDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDataBtnActionPerformed(evt);
            }
        });

        lessonDataBtn.setText("Lesson Data");

        paymentDataBtn.setText("Payment Data");
        paymentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(lessonDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teacherDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lessonDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Welcome,");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(keywordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keywordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(logoutBtn)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDataBtnActionPerformed
        try {
            showStudentData(studentService.getStudentList());
            globBtnName = "student";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_studentDataBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        Long selectedRow;
        try {
            switch (globBtnName) {
                case "student":
                    if (rowIndex != -1) {
                        selectedRow = (Long) jTable1.getValueAt(rowIndex, 0);
                        Student student = studentService.getStudentById(selectedRow);
                        int isDeleteMsg = JOptionPane.showConfirmDialog(null, "Are you sure to delete " + student.getName() + " " + student.getSurname() + "?",
                                "Delete Student", JOptionPane.YES_NO_OPTION);
                        if (isDeleteMsg == JOptionPane.YES_OPTION) {
                            studentService.deleteStudent(selectedRow);
                            JOptionPane.showMessageDialog(null, "Student has been successfully deleted!");
                            showStudentData(studentService.getStudentList());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please , select table row!");
                    }
                    break;
                case "teacher":

                    break;
                case "payment":

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please , first select menu!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_delBtnActionPerformed

    private void teacherDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDataBtnActionPerformed
        showTeacherData();
        globBtnName = "teacher";
    }//GEN-LAST:event_teacherDataBtnActionPerformed

    private void paymentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentDataBtnActionPerformed
        showPaymentData();
        globBtnName = "payment";
    }//GEN-LAST:event_paymentDataBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        switch (globBtnName) {
            case "student":
                NewStudentFrame newStudentFrame = new NewStudentFrame(studentService, teacherService, lessonService, paymentService);
                newStudentFrame.setVisible(true);
                break;
            case "teacher":
                break;
            case "payment":
                NewStudentFrame newPaymentFrame = new NewStudentFrame(studentService, teacherService, lessonService, paymentService);
                newPaymentFrame.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please , first select menu!");
        }
    }//GEN-LAST:event_newBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        Long selectedRow;
        switch (globBtnName) {
            case "student":
                if (rowIndex != -1) {
                    selectedRow = (Long) jTable1.getValueAt(rowIndex, 0);
                    EditStudentFrame editStudentFrame = new EditStudentFrame(selectedRow, studentService);
                    editStudentFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please , select table row!");
                }
                break;
            case "teacher":

                break;
            case "payment":

                break;
            default:
                JOptionPane.showMessageDialog(null, "Please , first select menu!");
        }


    }//GEN-LAST:event_editBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            String keyword = keywordTxt.getText();
            switch (globBtnName) {
                case "student":
                    List<Student> studentList = studentService.searchStudentData(keyword);
                    showStudentData(studentList);
                    break;
                case "teacher":

                    break;
                case "payment":

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please , first select menu!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        LoginFrame loginFrame = new LoginFrame(studentService, teacherService, lessonService, paymentService);
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField keywordTxt;
    private javax.swing.JButton lessonDataBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton paymentDataBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton studentDataBtn;
    private javax.swing.JButton teacherDataBtn;
    // End of variables declaration//GEN-END:variables

    private void showStudentData(List<Student> studentList) {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("#");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Address");
            model.addColumn("Date of birth");
            model.addColumn("Phone");
            //  List<Student> studentList = studentService.getStudentList();
            for (Student student : studentList) {
                Object[] data = new Object[]{
                    student.getId(), student.getName(), student.getSurname(), student.getAddress(), student.getDob(),
                    student.getPhone()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showTeacherData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("#");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Address");
            model.addColumn("Date of birth");
            model.addColumn("Phone");
            model.addColumn("E-mail");
            model.addColumn("Work Experience");
            List<Teacher> teacherList = teacherService.getTeacherList();
            for (Teacher teacher : teacherList) {
                Object[] data = new Object[]{
                    teacher.getId(), teacher.getName(), teacher.getSurname(), teacher.getAddress(), teacher.getDob(),
                    teacher.getPhone(), teacher.getEmail(), teacher.getWorkExperience()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showPaymentData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("#");
            model.addColumn("Student Fullname");
            model.addColumn("Lesson name");
            model.addColumn("Teacher Fullname");
            model.addColumn("Amount");
            model.addColumn("Payment Date");
            List<Payment> paymentList = paymentService.getPaymentList();
            for (Payment payment : paymentList) {
                Object[] data = new Object[]{
                    payment.getId(), payment.getStudentTeacherLesson().getStudent().getName() + " " + payment.getStudentTeacherLesson().getStudent().getSurname(),
                    payment.getStudentTeacherLesson().getTeacherLesson().getLesson().getName(),
                    payment.getStudentTeacherLesson().getTeacherLesson().getTeacher().getName() + " " + payment.getStudentTeacherLesson().getTeacherLesson().getTeacher().getSurname(),
                    payment.getAmount(), payment.getDataDate()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void showLoginInfo() {
        if (loginUser.getUserRole().getName().equalsIgnoreCase("ROLE_STUDENT")) {
            jLabel2.setText(loginUser.getStudent().getName() + " " + loginUser.getStudent().getSurname());

        } else {
            jLabel2.setText(loginUser.getTeacher().getName() + " " + loginUser.getTeacher().getSurname());

        }
    }

}

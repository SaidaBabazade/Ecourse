/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package az.orient.ecourse.gui;

import az.orient.ecourse.model.Lesson;
import az.orient.ecourse.model.Payment;
import az.orient.ecourse.model.Student;
import az.orient.ecourse.model.StudentTeacherLesson;
import az.orient.ecourse.model.Teacher;
import az.orient.ecourse.service.LessonService;
import az.orient.ecourse.service.PaymentService;
import az.orient.ecourse.service.StudentService;
import az.orient.ecourse.service.TeacherService;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class NewPaymentFrame extends javax.swing.JFrame {

    private StudentService studentService;
    private TeacherService teacherService;
    private LessonService lessonService;
    private PaymentService paymentService;
    private Long globLessonId;
    private Long globTeacherId;

    public NewPaymentFrame() {
        initComponents();
    }

    public NewPaymentFrame(StudentService studentService, TeacherService teacherService, LessonService lessonService, PaymentService paymentService) {
        initComponents();
        this.studentService = studentService;
        this.teacherService = teacherService;
        this.lessonService = lessonService;
        this.paymentService = paymentService;
        showLessonData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lessonBtn = new javax.swing.JLabel();
        teacherBtn = new javax.swing.JLabel();
        studentBtn = new javax.swing.JLabel();
        amountBtn = new javax.swing.JLabel();
        teacherCmb = new javax.swing.JComboBox<>();
        studentCmb = new javax.swing.JComboBox<>();
        lessonCmb = new javax.swing.JComboBox<>();
        amountTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lessonBtn.setText("Lesson");

        teacherBtn.setText("Teacher");

        studentBtn.setText("Student");

        amountBtn.setText("Amount");

        teacherCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Teacher" }));
        teacherCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                teacherCmbItemStateChanged(evt);
            }
        });
        teacherCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherCmbActionPerformed(evt);
            }
        });

        studentCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Student" }));
        studentCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                studentCmbItemStateChanged(evt);
            }
        });

        lessonCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lesson", " " }));
        lessonCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lessonCmbItemStateChanged(evt);
            }
        });
        lessonCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonCmbActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");

        jLabel1.setText("AZN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lessonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lessonCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(teacherBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                            .addComponent(amountBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentCmb, javax.swing.GroupLayout.Alignment.TRAILING, 0, 165, Short.MAX_VALUE)
                            .addComponent(amountTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teacherCmb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(saveBtn)
                .addGap(53, 53, 53)
                .addComponent(clearBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lessonBtn)
                    .addComponent(lessonCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherBtn)
                            .addComponent(teacherCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(studentBtn))
                    .addComponent(studentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountBtn)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lessonCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonCmbActionPerformed

    }//GEN-LAST:event_lessonCmbActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            Payment payment = new Payment();
            Student student = (Student) studentCmb.getSelectedItem();
            System.out.println("studentId: " + student.getId());
            System.out.println("teacherId: " + globTeacherId);
            System.out.println("lessonId: " + globLessonId);
            StudentTeacherLesson studentTeacherLesson = paymentService.getByStudentIdAndTeacherIdAndLessonId(student.getId(), globTeacherId, globLessonId);
            System.out.println("studentTeacherLesson: " + studentTeacherLesson);
            payment.setStudentTeacherLesson(studentTeacherLesson);
            payment.setAmount(Double.valueOf(amountTxt.getText()));
            paymentService.addPayment(payment);
            JOptionPane.showMessageDialog(null, "Payment has been successfully added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Problem! Payment has not been successfully added!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void teacherCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherCmbActionPerformed

    }//GEN-LAST:event_teacherCmbActionPerformed

    private void lessonCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lessonCmbItemStateChanged
        // TODO add your handling code here:
        Lesson lesson = (Lesson) lessonCmb.getSelectedItem();
        globLessonId = lesson.getId();
        getTeacherListByLessonId(globLessonId);
    }//GEN-LAST:event_lessonCmbItemStateChanged

    private void teacherCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_teacherCmbItemStateChanged
        // TODO add your handling code here:
        Teacher teacher = (Teacher) teacherCmb.getSelectedItem();
        globTeacherId = teacher.getId();
        getStudentListByTeacherIdAndLessonId(globTeacherId, globLessonId);
    }//GEN-LAST:event_teacherCmbItemStateChanged

    private void studentCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_studentCmbItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_studentCmbItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountBtn;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lessonBtn;
    private javax.swing.JComboBox<String> lessonCmb;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel studentBtn;
    private javax.swing.JComboBox<String> studentCmb;
    private javax.swing.JLabel teacherBtn;
    private javax.swing.JComboBox<String> teacherCmb;
    // End of variables declaration//GEN-END:variables

    private void showLessonData() {
        try {
            DefaultComboBoxModel lessonCombo = (DefaultComboBoxModel) lessonCmb.getModel();
            List<Lesson> lessonList = lessonService.getLessonList();
            for (Lesson lesson : lessonList) {
                lessonCombo.addElement(lesson);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void getStudentListByTeacherIdAndLessonId(Long teacherId, Long lessonId) {
        try {
            DefaultComboBoxModel studentCombo = new DefaultComboBoxModel();
            studentCmb.setModel(studentCombo);
            List<Student> studentList = studentService.getStudentListByTeacherIdAndLessonId(teacherId, lessonId);
            for (Student student : studentList) {
                studentCombo.addElement(student);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void getTeacherListByLessonId(Long lessonId) {
        try {
            DefaultComboBoxModel teacherCombo = new DefaultComboBoxModel();
            teacherCmb.setModel(teacherCombo);
            List<Teacher> teacherList = teacherService.getTeacherListByLessonId(lessonId);
            for (Teacher teacher : teacherList) {
                teacherCombo.addElement(teacher);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

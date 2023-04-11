/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package az.orient.ecourse.main;

import az.orient.ecourse.dao.LessonDao;
import az.orient.ecourse.dao.PaymentDao;
import az.orient.ecourse.dao.StudentDao;
import az.orient.ecourse.dao.TeacherDao;
import az.orient.ecourse.dao.impl.LessonDaoImpl;
import az.orient.ecourse.dao.impl.PaymentDaoImpl;
import az.orient.ecourse.dao.impl.StudentDaoImpl;
import az.orient.ecourse.dao.impl.TeacherDaoImpl;
import az.orient.ecourse.gui.LoginFrame;
import az.orient.ecourse.gui.MainFrame;
import az.orient.ecourse.service.LessonService;
import az.orient.ecourse.service.PaymentService;
import az.orient.ecourse.service.StudentService;
import az.orient.ecourse.service.TeacherService;
import az.orient.ecourse.service.impl.LessonServiceImpl;
import az.orient.ecourse.service.impl.PaymentServiceImpl;
import az.orient.ecourse.service.impl.StudentServiceImpl;
import az.orient.ecourse.service.impl.TeacherServiceImpl;

/**
 *
 * @author User
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            StudentDao studentDao = new StudentDaoImpl();
            StudentService studentService = new StudentServiceImpl(studentDao);
            TeacherDao teacherDao = new TeacherDaoImpl();
            TeacherService teacherService = new TeacherServiceImpl(teacherDao);
            LessonDao lessonDao = new LessonDaoImpl();
            LessonService lessonService = new LessonServiceImpl(lessonDao);
            PaymentDao paymentDao = new PaymentDaoImpl();
            PaymentService paymentService = new PaymentServiceImpl(paymentDao);
           // MainFrame mainFrame = new MainFrame(studentService,teacherService,lessonService,paymentService);
          //  mainFrame.setVisible(true);
            LoginFrame loginFrame = new LoginFrame(studentService,teacherService,lessonService,paymentService);
            loginFrame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

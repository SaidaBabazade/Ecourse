package az.orient.ecourse.dao.impl;

import az.orient.ecourse.dao.DbHelper;
import az.orient.ecourse.dao.PaymentDao;
import az.orient.ecourse.model.Lesson;
import az.orient.ecourse.model.Payment;
import az.orient.ecourse.model.Student;
import az.orient.ecourse.model.StudentTeacherLesson;
import az.orient.ecourse.model.Teacher;
import az.orient.ecourse.model.TeacherLesson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

public class PaymentDaoImpl implements PaymentDao {
    @Override
    public List<Payment> getPaymentList() throws Exception {
        List<Payment> paymentList = new ArrayList<>();
        String sql = "SELECT * FROM PAYMENT_VIEW";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Payment payment = new Payment();
                payment.setId(rs.getLong("ID"));
                StudentTeacherLesson studentTeacherLesson = new StudentTeacherLesson();
                Student student = new Student();
                student.setId(rs.getLong("STUDENT_ID"));
                student.setName(rs.getString("STUDENT_NAME"));
                student.setSurname(rs.getString("STUDENT_SURNAME"));
                TeacherLesson teacherLesson = new TeacherLesson();
                Teacher teacher = new Teacher();
                teacher.setId(rs.getLong("TEACHER_ID"));
                teacher.setName(rs.getString("TEACHER_NAME"));
                teacher.setSurname(rs.getString("TEACHER_SURNAME"));
                Lesson lesson = new Lesson();
                lesson.setId(rs.getLong("LESSON_ID"));
                lesson.setName(rs.getString("LESSON_NAME"));
                teacherLesson.setTeacher(teacher);
                teacherLesson.setLesson(lesson);
                studentTeacherLesson.setStudent(student);
                studentTeacherLesson.setTeacherLesson(teacherLesson);
                payment.setStudentTeacherLesson(studentTeacherLesson);
                payment.setAmount(rs.getDouble("AMOUNT"));
                payment.setDataDate(rs.getDate("DATA_DATE"));
                paymentList.add(payment);
            }

        }
        return paymentList;
    }

    @Override
    public void addPayment(Payment payment) throws Exception {
        String sql = "INSERT INTO PAYMENT(ID, STUDENT_TEACHER_LESSON_ID, AMOUNT) \n" +
                "VALUES(PAYMENT_SEQ.nextval,?,?)";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setLong(1, payment.getStudentTeacherLesson().getId());
            ps.setDouble(2, payment.getAmount());
            ps.execute();
            c.commit();
        }
    }

    @Override
    public StudentTeacherLesson getByStudentIdAndTeacherIdAndLessonId(Long studentId, Long teacherId, Long lessonId) throws Exception {
        StudentTeacherLesson studentTeacherLesson = new StudentTeacherLesson();
        String sql = "SELECT * FROM STUDENT_TEACHER_LESSON STL\n" +
                "INNER JOIN STUDENT S on S.ID = STL.STUDENT_ID\n" +
                "INNER JOIN TEACHER_LESSON TL on TL.ID = STL.TEACHER_LESSON_ID\n" +
                "INNER JOIN TEACHER T on T.ID = TL.TEACHER_ID\n" +
                "INNER JOIN LESSON L on L.ID = TL.LESSON_ID\n" +
                "WHERE STL.ACTIVE = 1 AND S.ID = ? AND T.ID = ? AND L.ID = ?";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1,studentId);
            ps.setLong(2,teacherId);
            ps.setLong(3,lessonId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
              studentTeacherLesson.setId(rs.getLong("ID"));
            } else
            {
                studentTeacherLesson = null;
            }
            return studentTeacherLesson;
        }
    }
}
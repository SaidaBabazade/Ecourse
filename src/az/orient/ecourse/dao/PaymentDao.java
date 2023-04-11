package az.orient.ecourse.dao;

import az.orient.ecourse.model.Payment;
import az.orient.ecourse.model.StudentTeacherLesson;

import java.sql.SQLException;
import java.util.List;

public interface PaymentDao {

    List<Payment> getPaymentList() throws Exception;
    
    void addPayment(Payment payment) throws Exception;
    
    StudentTeacherLesson getByStudentIdAndTeacherIdAndLessonId(Long studentId, Long teacherId, Long lessonId) throws Exception;



}

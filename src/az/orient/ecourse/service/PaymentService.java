package az.orient.ecourse.service;

import az.orient.ecourse.model.Payment;
import az.orient.ecourse.model.StudentTeacherLesson;

import java.util.List;

public interface PaymentService {

    List<Payment> getPaymentList() throws Exception;

    void addPayment(Payment payment) throws Exception;

   StudentTeacherLesson getByStudentIdAndTeacherIdAndLessonId(Long studentId, Long teacherId, Long lessonId) throws Exception;
}

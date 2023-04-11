package az.orient.ecourse.service.impl;

import az.orient.ecourse.dao.PaymentDao;
import az.orient.ecourse.model.Payment;
import az.orient.ecourse.model.StudentTeacherLesson;
import az.orient.ecourse.service.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    private PaymentDao paymentDao;

    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public List<Payment> getPaymentList() throws Exception {
        return paymentDao.getPaymentList();
    }

    @Override
    public void addPayment(Payment payment) throws Exception {
          paymentDao.addPayment(payment);
    }

    @Override
    public StudentTeacherLesson getByStudentIdAndTeacherIdAndLessonId(Long studentId, Long teacherId, Long lessonId) throws Exception{
        return paymentDao.getByStudentIdAndTeacherIdAndLessonId(studentId, teacherId, lessonId);
    }
}

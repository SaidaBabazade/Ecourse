package az.orient.ecourse.model;

public class Payment extends Course {

    private StudentTeacherLesson studentTeacherLesson;
    private Double amount;

    public StudentTeacherLesson getStudentTeacherLesson() {
        return studentTeacherLesson;
    }

    public void setStudentTeacherLesson(StudentTeacherLesson studentTeacherLesson) {
        this.studentTeacherLesson = studentTeacherLesson;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Payment{" +
                "studentTeacherLesson=" + studentTeacherLesson +
                ", amount=" + amount +
                '}';
    }
}

package az.orient.ecourse.model;

public class StudentTeacherLesson extends Course {

    private Student student;
    private TeacherLesson teacherLesson;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public TeacherLesson getTeacherLesson() {
        return teacherLesson;
    }

    public void setTeacherLesson(TeacherLesson teacherLesson) {
        this.teacherLesson = teacherLesson;
    }


    @Override
    public String toString() {
        return "StudentTeacherLesson{" +
                "student=" + student +
                ", teacherLesson=" + teacherLesson +
                '}';
    }
}

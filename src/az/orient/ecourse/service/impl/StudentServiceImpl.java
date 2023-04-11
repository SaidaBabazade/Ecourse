package az.orient.ecourse.service.impl;

import az.orient.ecourse.dao.StudentDao;
import az.orient.ecourse.model.Student;
import az.orient.ecourse.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getStudentList() throws Exception {
        return studentDao.getStudentList();
    }

    @Override
    public void addStudent(Student student) throws Exception {
       studentDao.addStudent(student);
    }

    @Override
    public Student getStudentById(Long studentId) throws Exception {
       return studentDao.getStudentById(studentId);
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(Long studentId) throws Exception {
       studentDao.deleteStudent(studentId);
    }

    @Override
    public List<Student> getStudentListByTeacherIdAndLessonId(Long teacherId, Long lessonId) throws Exception {
          return studentDao.getStudentListByTeacherIdAndLessonId(teacherId, lessonId);
    }

    @Override
    public List<Student> searchStudentData(String keyword) throws Exception {
         return studentDao.searchStudentData(keyword);
    }
}

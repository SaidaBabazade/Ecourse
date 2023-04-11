package az.orient.ecourse.dao.impl;

import az.orient.ecourse.dao.DbHelper;
import az.orient.ecourse.dao.StudentDao;
import az.orient.ecourse.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getStudentList() throws Exception {
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * from STUDENT\n" +
                "where ACTIVE = 1";
        try(Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getLong("ID"));
                student.setName(rs.getString("NAME"));
                student.setSurname(rs.getString("SURNAME"));
                student.setDob(rs.getDate("DOB"));
                student.setAddress(rs.getString("ADDRESS"));
                student.setPhone(rs.getString("PHONE"));
                studentList.add(student);
            }

        }
        return studentList;
    }

    @Override
    public void addStudent(Student student) throws Exception {
        String sql = "insert all\n" +
"    into student(id,name,surname,address,dob,phone)\n" +
"    values(student_seq.nextval,?,?,?,?,?)\n" +
"    into LOGIN_USER(id, username, password, student_id, user_role_id)\n" +
"    values (LOGIN_USER_SEQ.nextval,?,?,student_seq.currval,1)\n" +
"   select * from DUAL";
        try(Connection c = DbHelper.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,student.getName());
            ps.setString(2,student.getSurname());
            ps.setString(3,student.getAddress());
            ps.setDate(4,new java.sql.Date(student.getDob().getTime()));
            ps.setString(5,student.getPhone());
            ps.setString(6, student.getUsername());
            ps.setString(7, student.getPassword());
            ps.execute();
            c.commit();
        }
    }

    @Override
    public Student getStudentById(Long studentId) throws Exception {
        Student student = new Student();
        String sql = "SELECT * from STUDENT\n" +
                "where ACTIVE = 1 AND ID = ?";
        try(Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1,studentId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                student.setId(rs.getLong("ID"));
                student.setName(rs.getString("NAME"));
                student.setSurname(rs.getString("SURNAME"));
                student.setDob(rs.getDate("DOB"));
                student.setAddress(rs.getString("ADDRESS"));
                student.setPhone(rs.getString("PHONE"));
            } else {
                student = null;
            }
        }
        return student;
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        String sql = "update student set name = ?,surname = ?,address = ?,dob = ?,phone = ? " +
                " where id = ?";
        try(Connection c = DbHelper.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,student.getName());
            ps.setString(2,student.getSurname());
            ps.setString(3,student.getAddress());
            ps.setDate(4,new java.sql.Date(student.getDob().getTime()));
            ps.setString(5,student.getPhone());
            ps.setLong(6,student.getId());
            ps.execute();
            c.commit();
        }
    }

    @Override
    public void deleteStudent(Long studentId) throws Exception {
        String sql = "update student set active = 0 " +
                " where id = ?";
        try(Connection c = DbHelper.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1,studentId);
            ps.execute();
            c.commit();
        }
    }

    @Override
    public List<Student> getStudentListByTeacherIdAndLessonId(Long teacherId, Long lessonId) throws Exception {
          List<Student> studentList = new ArrayList<>();
          String sql = "SELECT S.ID,S.NAME,S.SURNAME FROM STUDENT_TEACHER_LESSON STL\n" +
                  "INNER JOIN STUDENT S on S.ID = STL.STUDENT_ID\n" +
                  "INNER JOIN TEACHER_LESSON TL on TL.ID = STL.TEACHER_LESSON_ID\n" +
                  "INNER JOIN TEACHER T on T.ID = TL.TEACHER_ID\n" +
                  "INNER JOIN LESSON L on L.ID = TL.LESSON_ID\n" +
                  "WHERE STL.ACTIVE = 1 AND T.ID = ? AND L.ID = ?";
        try(Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1,teacherId);
            ps.setLong(2,lessonId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getLong("ID"));
                student.setName(rs.getString("NAME"));
                student.setSurname(rs.getString("SURNAME"));
                studentList.add(student);
            }

        }
          return studentList;

    }

    @Override
    public List<Student> searchStudentData(String keyword) throws Exception {
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * from STUDENT\n" +
                 "where ACTIVE = 1 AND (UPPER(NAME) LIKE UPPER(?) OR UPPER(SURNAME) LIKE UPPER(?) " +
                 " OR UPPER(ADDRESS) LIKE UPPER(?)) ";
        try(Connection c = DbHelper.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,"%"+keyword+"%");
            ps.setString(2,"%"+keyword+"%");
            ps.setString(3,"%"+keyword+"%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getLong("ID"));
                student.setName(rs.getString("NAME"));
                student.setSurname(rs.getString("SURNAME"));
                student.setDob(rs.getDate("DOB"));
                student.setAddress(rs.getString("ADDRESS"));
                student.setPhone(rs.getString("PHONE"));
                studentList.add(student);
            }
        }
         return studentList;
    }
}

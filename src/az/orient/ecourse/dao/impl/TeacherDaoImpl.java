package az.orient.ecourse.dao.impl;

import az.orient.ecourse.dao.DbHelper;
import az.orient.ecourse.dao.TeacherDao;
import az.orient.ecourse.model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    @Override
    public List<Teacher> getTeacherList() throws Exception {
        List<Teacher> teacherList = new ArrayList<>();
        String sql = "SELECT * from TEACHER\n" +
                "where ACTIVE = 1";
        try(Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Teacher teacher = new Teacher();
                teacher.setId(rs.getLong("ID"));
                teacher.setName(rs.getString("NAME"));
                teacher.setSurname(rs.getString("SURNAME"));
                teacher.setDob(rs.getDate("DOB"));
                teacher.setAddress(rs.getString("ADDRESS"));
                teacher.setPhone(rs.getString("PHONE"));
                teacher.setEmail(rs.getString("EMAIL"));
                teacher.setWorkExperience(rs.getInt("WORK_EXPERIENCE"));
                teacherList.add(teacher);
            }

        }
        return teacherList;
    }

    @Override
    public List<Teacher> getTeacherListByLessonId(Long lessonId) throws Exception {
        List<Teacher> teacherList = new ArrayList<>();
        String sql = "SELECT T.ID,T.NAME,T.SURNAME FROM TEACHER_LESSON TL\n" +
                "INNER JOIN LESSON L on TL.LESSON_ID = L.ID\n" +
                "INNER JOIN TEACHER T on TL.TEACHER_ID = T.ID\n" +
                "WHERE TL.ACTIVE = 1 AND TL.LESSON_ID = ? ";
        try(Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1,lessonId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Teacher teacher = new Teacher();
                teacher.setId(rs.getLong("ID"));
                teacher.setName(rs.getString("NAME"));
                teacher.setSurname(rs.getString("SURNAME"));
                teacherList.add(teacher);
            }

        }
        return teacherList;
    }
}

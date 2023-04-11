package az.orient.ecourse.dao.impl;

import az.orient.ecourse.dao.DbHelper;
import az.orient.ecourse.dao.LoginUserDao;
import az.orient.ecourse.model.LoginUser;
import az.orient.ecourse.model.Student;
import az.orient.ecourse.model.Teacher;
import az.orient.ecourse.model.UserRole;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginUserDaoImpl implements LoginUserDao {
    @Override
    public LoginUser login(String username, String password) throws Exception {
        LoginUser loginUser = new LoginUser();
        String sql = "SELECT LU.ID,\n" +
                "       LU.USERNAME,\n" +
                "       S.NAME    STUDENT_NAME,\n" +
                "       S.SURNAME STUDENT_SURNAME,\n" +
                "       T.NAME    TEACHER_NAME,\n" +
                "       T.SURNAME TEACHER_SURNAME,\n" +
                "       UR.ID ROLE_ID,\n" +
                "       UR.NAME ROLE_NAME\n" +
                "FROM LOGIN_USER LU\n" +
                "         INNER JOIN ECOURSE.USER_ROLE UR on UR.ID = LU.USER_ROLE_ID\n" +
                "         LEFT JOIN STUDENT S on S.ID = LU.STUDENT_ID\n" +
                "         LEFT JOIN TEACHER T on T.ID = LU.TEACHER_ID\n" +
                "WHERE LU.ACTIVE = 1 AND LU.USERNAME = ? AND LU.PASSWORD = ?";
        try (Connection c = DbHelper.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,username);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                loginUser.setId(rs.getLong("ID"));
                loginUser.setUsername(rs.getString("USERNAME"));
                UserRole userRole = new UserRole();
                userRole.setId(rs.getLong("ROLE_ID"));
                userRole.setName(rs.getString("ROLE_NAME"));
                loginUser.setUserRole(userRole);
                Student student = new Student();
                student.setName(rs.getString("STUDENT_NAME"));
                student.setSurname(rs.getString("STUDENT_SURNAME"));
                loginUser.setStudent(student);
                Teacher teacher = new Teacher();
                teacher.setName(rs.getString("TEACHER_NAME"));
                teacher.setSurname(rs.getString("TEACHER_SURNAME"));
                loginUser.setTeacher(teacher);
            } else {
                loginUser = null;
            }
         }

        return loginUser;
    }
}

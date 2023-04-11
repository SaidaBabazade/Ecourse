package az.orient.ecourse.dao;

import az.orient.ecourse.model.Teacher;

import java.util.List;

public interface TeacherDao {

    List<Teacher> getTeacherList() throws Exception;

    List<Teacher> getTeacherListByLessonId(Long lessonId) throws Exception;

}

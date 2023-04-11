package az.orient.ecourse.service;

import az.orient.ecourse.model.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getTeacherList() throws Exception;

    List<Teacher> getTeacherListByLessonId(Long lessonId) throws Exception;


}

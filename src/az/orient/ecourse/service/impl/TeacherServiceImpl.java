package az.orient.ecourse.service.impl;

import az.orient.ecourse.dao.TeacherDao;
import az.orient.ecourse.model.Teacher;
import az.orient.ecourse.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao;

    public TeacherServiceImpl(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public List<Teacher> getTeacherList() throws Exception {
        return teacherDao.getTeacherList();
    }

    @Override
    public List<Teacher> getTeacherListByLessonId(Long lessonId) throws Exception {
        return teacherDao.getTeacherListByLessonId(lessonId);
    }
}

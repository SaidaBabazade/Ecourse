/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.orient.ecourse.service.impl;

import az.orient.ecourse.dao.LessonDao;
import az.orient.ecourse.model.Lesson;
import az.orient.ecourse.service.LessonService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class LessonServiceImpl implements LessonService{
    
    private LessonDao lessonDao;

    public LessonServiceImpl(LessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    @Override
    public List<Lesson> getLessonList() throws Exception {        
        return lessonDao.getLessonList();
    }
    
}

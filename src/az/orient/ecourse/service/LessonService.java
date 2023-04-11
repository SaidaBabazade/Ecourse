/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package az.orient.ecourse.service;

import az.orient.ecourse.model.Lesson;
import java.util.List;

/**
 *
 * @author User
 */
public interface LessonService {
    
   List<Lesson> getLessonList() throws Exception;
    
}

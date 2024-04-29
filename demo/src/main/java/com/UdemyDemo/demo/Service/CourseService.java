package com.UdemyDemo.demo.Service;

import com.UdemyDemo.demo.Entity.Course;
import com.UdemyDemo.demo.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired CourseRepository courseRepository;

    public List<Course> gelAll(){
        return courseRepository.findAll();
    }

    public Course getCourse(String courseName){
        return courseRepository.getCourse(courseName);
    }
}

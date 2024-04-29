package com.UdemyDemo.demo.Controller;

import com.UdemyDemo.demo.DTO.CourseDTO;
import com.UdemyDemo.demo.Entity.Course;
import com.UdemyDemo.demo.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursesController {
@Autowired
    CourseService courseService;
    @GetMapping("allCourses")
    public List<CourseDTO> getAll(){
        List<Course> courseList= courseService.gelAll();
        List<CourseDTO> courses=new ArrayList<>();
        for(Course c:courseList){
            CourseDTO courseDTO=CourseDTO.builder()
                    .name(c.getCourseName())
                    .price(c.getPrice())
                    .build();
            courses.add(courseDTO);
        }
        return courses;
    }
    @GetMapping("getCourse")
    public CourseDTO findCourse(@RequestParam String courseName){
        Course course= courseService.getCourse(courseName);
        CourseDTO courseDTO=CourseDTO.builder()
                .name(course.getCourseName())
                .price(course.getPrice())
                .build();
        return courseDTO;
    }

}

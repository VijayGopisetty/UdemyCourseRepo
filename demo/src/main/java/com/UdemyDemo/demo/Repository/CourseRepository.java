package com.UdemyDemo.demo.Repository;

import com.UdemyDemo.demo.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
    @Query(value="select * from course where courseName=:courseName",nativeQuery = true)
    public Course getCourse(String courseName);
    //Course id is a primary key and getting the course by id is not a user friendly.
    //So made custom query to get course by name
}

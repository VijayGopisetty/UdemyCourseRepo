package com.UdemyDemo.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int course_Id;
    String courseName;
    int price;
    double Duration;
    String instructor;
    double course_discount;
}

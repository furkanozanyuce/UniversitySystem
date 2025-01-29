package com.foy.university.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course {
    private Long id;
    private String name;
    private String code;
    private Double gpa;
    private Department department;
    private Set<Instructor> instructors;

    public Course(Long id, String name, String code, Double gpa, Department department) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.gpa = gpa;
        this.department = department;
        department.addCourse(this);
        this.instructors = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

//    public Set<Instructor> getInstructors() {
//        return instructors;
//    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(getId(), course.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

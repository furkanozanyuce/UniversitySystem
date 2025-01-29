package com.foy.university.models;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class Department {
    private Long id;
    private String name;
    private String departmentHead;
    private Faculty faculty;
    private Set<Course> courses;

    public Department(Long id, String name, String departmentHead, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.departmentHead = departmentHead;
        this.faculty = faculty;
        faculty.addDepartment(this);
        this.courses = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (course.getDepartment().equals(this)) {
            courses.add(course);
        }
    }

    public abstract List<Course> lessonToLearn();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Department department = (Department) obj;
        return this.id.equals(department.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

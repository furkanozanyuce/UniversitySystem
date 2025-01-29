package com.foy.university.models;

import java.util.List;

public class SoftwareEngineering extends Department{
    public SoftwareEngineering(Long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }

    @Override
    public List<Course> lessonToLearn() {
        return getCourses().stream().toList();
    }
}

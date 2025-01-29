package com.foy.university.models;

import java.util.List;

public class IndustrialEngineering extends Department {
    public IndustrialEngineering(Long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }

    @Override
    public List<Course> lessonToLearn() {
        //System.out.println("Lessons: Yön-Eğlem Araştırması, İş Analizi Tasarımı, Benzetim Sistemleri");
        return getCourses().stream().toList();
    }
}

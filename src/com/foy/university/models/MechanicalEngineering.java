package com.foy.university.models;

import java.util.List;

public class MechanicalEngineering extends Department {

    public MechanicalEngineering(Long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }

    @Override
    public List<Course> lessonToLearn() {
        //System.out.println("Lessons: Mukavemet, Thermodynamic, Akışkanlar Mekaniği");
        return getCourses().stream().toList();
    }


}

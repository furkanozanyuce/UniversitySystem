package com.foy.university.models;

import java.util.ArrayList;
import java.util.List;

public class ComputerEngineering extends Department {
    private List<String> programmingLanguagesShouldBeTaught;

    public ComputerEngineering(Long id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
        this.programmingLanguagesShouldBeTaught = new ArrayList<>();
    }

    public void addProgramminLanguage(String programmingLanguage) {
        if (programmingLanguage != null){
            programmingLanguagesShouldBeTaught.add(programmingLanguage);
        }
    }

    @Override
    public List<Course> lessonToLearn() {
        //System.out.println("Lessons: Intro to Programming, Data Structures, Algorithms, Operating Systems");
        return getCourses().stream().toList();
    }


}

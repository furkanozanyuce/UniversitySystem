package com.foy.university.models;

public class BscInstructor extends Instructor implements BscProgram{
    public BscInstructor(Long id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary, false, false);
    }

    @Override
    public void presentLesson() {

    }

    @Override
    public void takeExam() {

    }
}

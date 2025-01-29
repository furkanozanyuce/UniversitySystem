package com.foy.university.models;

public class MscInstructor extends Instructor implements MscProgram {
    public MscInstructor(Long id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary, true, false);
    }

    @Override
    public void makeALab() {

    }

    @Override
    public void teachToWriteAcademicPaper() {

    }

    @Override
    public void presentLesson() {

    }

    @Override
    public void takeExam() {

    }
}

package com.foy.university.models;

public class PhdInstructor extends Instructor implements PhdProgram{
    public PhdInstructor(Long id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary, true, true);
    }

    @Override
    public void teachAcademicResearch() {

    }

    @Override
    public void introduceStudentToAcademicStaff() {

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

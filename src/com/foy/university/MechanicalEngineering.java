package com.foy.university;

public class MechanicalEngineering extends Department{

    public MechanicalEngineering(Integer id, String name, String departmentHead, Faculty faculty) {
        super(id, name, departmentHead, faculty);
    }

    @Override
    public void lessonToLearn() {
        System.out.println("Lessons: Mukavemet, Thermodynamic, Akışkanlar Mekaniği");
    }


}

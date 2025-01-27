package com.foy.university;

import java.util.Objects;

public abstract class Department {
    private Integer id;
    private String name;
    private String departmentHead;
    private Faculty faculty;

    public Department(Integer id, String name, String departmentHead, Faculty faculty) {
        this.id = id;
        this.name = name;
        this.departmentHead = departmentHead;
        this.faculty = faculty;
        faculty.addDepartment(this);
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Integer getId() {
        return id;
    }

    public abstract void lessonToLearn();

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

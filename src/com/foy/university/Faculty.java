package com.foy.university;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Faculty {
    private Integer id;
    private String name;
    private LocalDateTime createdDate;
    private String dean;
    private String address;
    private Set<Department> departments;

    public Faculty(Integer id, String name, String address, String dean) {
        this.setId(id);
        this.name = name;
        this.address = address;
        this.dean = dean;
        this.createdDate = LocalDateTime.now();
        this.departments = new HashSet<>();
    }

    public Faculty(Integer id, String name, String address, String dean, LocalDateTime createdDate, Set<Department> departments) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dean = dean;
        this.createdDate = createdDate;
        this.departments = departments;
    }

    public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public void addDepartment(Department department) {
        if (department.getFaculty().equals(this)){
            departments.add(department);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Faculty faculty = (Faculty) obj;
        return this.id.equals(faculty.id);
    }
}






































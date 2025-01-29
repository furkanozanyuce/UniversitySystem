package com.foy.university.models;

import java.time.LocalDateTime;
import java.util.*;

public class Faculty {
    private Long id;
    private String name;
    private LocalDateTime createdDate;
    private String dean;
    private String address;
    //private Set<Department> departments;
    private Map<Long, Department> departments;

    public Faculty(Long id, String name, String address, String dean) {
        this.setId(id);
        this.name = name;
        this.address = address;
        this.dean = dean;
        this.createdDate = LocalDateTime.now();
        this.departments = new HashMap<>();
    }

    public Faculty(Long id, String name, String address, String dean, LocalDateTime createdDate, Map<Long, Department> departments) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dean = dean;
        this.createdDate = createdDate;
        this.departments = departments;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //map getter'ı biraz karmaşık
    public Collection<Department> getDepartments() {
        return departments.values();
    }

    private void setId(Long id) {
        this.id = id;
    }

    public void addDepartment(Department department) {
        if (department.getFaculty().equals(this) && !departments.containsKey(department.getId())){
            departments.put(department.getId(), department);
        }
    }

    public Department getFacultyDepartmentById(Long departmentId) {
        return departments.get(departmentId);
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

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdDate=" + createdDate +
                ", dean='" + dean + '\'' +
                ", address='" + address + '\'' +
                ", departments=" + departments +
                '}';
    }
}






































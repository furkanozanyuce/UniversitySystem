package com.foy.university;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name) {
        this.setName(name);
        this.faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        if(!faculties.contains(faculty)) {
            this.faculties.add(faculty);
        }
    }

    public boolean removeFaculty(Faculty faculty) {
        return faculties.remove(faculty);
    }

    public void removeFaculty(Integer facultyId) {
        Iterator<Faculty> iterator = faculties.iterator();
        while (iterator.hasNext()) {
            Faculty faculty = iterator.next();
            if (faculty.getId().equals(facultyId)) {
                iterator.remove();
            }
        }
    }
}































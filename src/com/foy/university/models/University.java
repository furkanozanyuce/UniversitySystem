package com.foy.university.models;

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

    public List<Faculty> getFaculties() {
        return faculties;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addFaculty(Faculty faculty) {
        if(!faculties.contains(faculty)) {
            this.faculties.add(faculty);
        }
    }
//    public void addFaculty(Faculty faculty) {
//        if (faculty == null) {
//            System.out.println("Faculty cannot be null!");
//            return;
//        }
//
//        // Fakültenin bu üniversiteye ait olup olmadığını kontrol et
//        if (faculty.getUniversity() != null && !faculty.getUniversity().equals(this)) {
//            System.out.println("This faculty belongs to another university!");
//            return;
//        }
//
//        // Fakülte daha önceden eklenmiş mi kontrol et
//        if (!faculties.contains(faculty)) {
//            this.faculties.add(faculty);
//            // Fakültenin bu üniversiteye ait olduğunu belirt
//            faculty.setUniversity(this);
//        }
//    }

    public boolean removeFaculty(Faculty faculty) {
        return faculties.remove(faculty);
    }

    public void removeFaculty(Long facultyId) {
        Iterator<Faculty> iterator = faculties.iterator();
        while (iterator.hasNext()) {
            Faculty faculty = iterator.next();
            if (faculty.getId().equals(facultyId)) {
                iterator.remove();
            }
        }
    }
}































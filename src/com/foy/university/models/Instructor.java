package com.foy.university.models;

import java.util.Objects;
import java.util.Set;

public abstract class Instructor {
    private Long id;
    private String firstName;
    private String lastName;
    private Double salary;
    private boolean hasMsc;
    private boolean hasPhd;
    private Set<Course> courses;

    public Instructor(Long id, String firstName, String lastName, Double salary, boolean hasMsc, boolean hasPhd) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hasMsc = hasMsc;
        this.hasPhd = hasPhd;
    }

    public Long getId() {
        return id;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Instructor that = (Instructor) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}

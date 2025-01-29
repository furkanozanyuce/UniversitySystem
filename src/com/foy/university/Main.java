package com.foy.university;

import com.foy.university.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our university directory system");

        System.out.println("Press 1 to add a faculty");
        System.out.println("Press 2 to add a department");
        System.out.println("Press 3 to add a course");
        System.out.println("Press 4 to add a instructor");

        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();

        switch (choise) {
            case 1:
                System.out.println("Enter a faculty name");
        }

        University atUni = new University("At University");

        Faculty engineering = new Faculty(1L, "Engineering", "Istanbul", "Dr. Ozan");
        Faculty medicine = new Faculty(2L, "Medicine", "Istanbul", "Dr. Furkan");
        Faculty architecture = new Faculty(3L, "Architecture", "Istanbul", "Dr. At");

        atUni.addFaculty(engineering);
        atUni.addFaculty(medicine);
        atUni.addFaculty(architecture);

        Department computerEngineering = new ComputerEngineering(1L, "Computer Engineering", "Dr. Robot", engineering);
        //engineering.addDepartment(computerEnginerring); gerekirdi eğer constructorda yapmasaydık

        Department softwareEngineering = new SoftwareEngineering(2L, "Software Engineering", "Dr. Giant", engineering);




        System.out.println("University: " + atUni.getName());
        for (Faculty faculty: atUni.getFaculties()) {
            System.out.println("-Faculty: " + faculty.getName());
            for (Department department: faculty.getDepartments()) {
                System.out.println("--Department: " + department.getName());
            }
        }


    }
}

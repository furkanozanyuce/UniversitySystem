package com.foy.university.console;

import com.foy.university.models.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static University atUni = new University("At University");

    public static void main(String[] args) {

        System.out.println("Welcome to our university directory system");

        boolean exit = false;
        while (!exit) {
            System.out.println("Press 1 to add a faculty");
            System.out.println("Press 2 to add a department");
            System.out.println("Press 3 to add a course");
            System.out.println("Press 4 to add a instructor");
            System.out.println("Press 0 to exit");


            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    addFacultyMenu();
                    break;
                case 0: exit = true;
                    break;
                default: System.out.println("Invalid choice!");
            }
            //break;
        }


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

    private static void addFacultyMenu() {
        scanner.nextLine();
        System.out.print("Enter Fculty ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter dean: ");
        String dean = scanner.nextLine();
        Faculty faculty = new Faculty(id, name, address, dean);
        atUni.addFaculty(faculty);
        System.out.println("Faculty added successfully!");
        System.out.println(faculty);
    }
}

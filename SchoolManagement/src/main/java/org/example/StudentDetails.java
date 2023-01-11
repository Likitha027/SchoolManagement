package org.example;

public class StudentDetails {
    public static void main(String[] args) {

        Student s = new Student();
        s.setFirstName("Pavan");
        s.setLastName("S");
        s.setGender("Male");
        s.setStudentId(44);
        s.setDepartment("CSE");

        Student s1 = new Student();
        s1.setFirstName("Druva");
        s1.setLastName("s");
        s1.setGender("Male");
        s1.setStudentId(23);
        s1.setDepartment("ISE");
        System.out.println("Student Firstname:" + s.getFirstName());
        System.out.println("Student Lastname:" + s.getLastName());
        System.out.println("Student Gender:" + s.getGender());
        System.out.println("Student ID:" + s.getStudentId());
        System.out.println("Student Department" + s.getDepartment());
        System.out.println(" ");
        System.out.println("Student Firstname:" + s1.getFirstName());
        System.out.println("Student Lastname:" + s1.getLastName());
        System.out.println("Student Gender:" + s1.getGender());
        System.out.println("Student ID:" + s1.getStudentId());
        System.out.println("Student Department" + s1.getDepartment());

    }
}

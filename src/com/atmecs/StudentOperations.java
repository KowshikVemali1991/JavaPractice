package com.atmecs;

public class StudentOperations {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentNo(10);
        s.setFirstName("Koushik");
        s.setLastName("Naidu");
        s.setSection('A');
        s.setFeePaid(true);

        System.out.println(s);
        System.out.println(s.getFirstName());
        Student s2 = new Student(20, "Rajesh", "I", 'A', true );
        System.out.println(s2);



    }
}

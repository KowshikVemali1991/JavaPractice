package com.atmecs;

public class Student {
    private int studentNo;
    private String firstName;
    private String lastName;
    private char section;
    private boolean feePaid;

    public Student() {

    }

    public Student(int studentNo, String firstName, String ln, char section, boolean feePaid) {
        this.studentNo = studentNo;
        this.firstName = firstName;
        lastName = ln;
        this.section = section;
        this.feePaid = feePaid;
    }

    public Student(int studentNo, String firstName) {
        this.studentNo = studentNo;
        this.firstName = firstName;
    }

    public int getStudentNo() {
        return studentNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", section=" + section +
                ", feePaid=" + feePaid +
                '}';
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public boolean isFeePaid() {
        return feePaid;
    }

    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }


}

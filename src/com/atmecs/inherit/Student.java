package com.atmecs.inherit;

public class Student extends StudentAddress {
    private int sno;
    private String sname;
    public Student() {

    }
    public Student(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                '}';
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void aaa(){
        System.out.println("i am in aaa method");
    }
}

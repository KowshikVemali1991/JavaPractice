package com.atmecs;

import java.util.Objects;

public class Employee {
    private int empNo;
    private String empName;

    public Employee() {

    }

    //setter and getter
    public void setEmpNo(int no) {
        empNo = no;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpName(String str) {
        empName = str;
    }

    public Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNo == employee.empNo && Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNo, empName);
    }

    public String getEmpName() {
        return empName;
    }

}

package com.atmecs;

public class EmployeeOperations {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpNo(10);
        e1.setEmpName("Koushik");


        System.out.println(e1.getEmpNo());
        System.out.println(e1.getEmpName());
        System.out.println(e1);
        Employee e2 = new Employee(10, "Koushik");
        System.out.println(e2);


        System.out.println("custom employee objects: "+ e1.equals(e2));


        String s1 = "rajesh";
        String s2= "rajesh";

        System.out.println("string comparision: "+s2.equals(s1));


    }
}

package com.atmecs;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionPractice {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Koushik");
        al.add("Vermali");
        al.add("Ayansh");
        System.out.println(al);

        ArrayList<Employee> emplist = new ArrayList<>();
        Employee e1 = new Employee(1, "Rajesh");
        emplist.add(e1);
        Employee e2 = new Employee(1, "Rajesh");
        emplist.add(e2);
        System.out.println(emplist);

        HashSet<Employee> empset = new HashSet<>();
        empset.add(e1);
        empset.add(e2);
        System.out.println(empset);

        HashSet<String> strset = new HashSet<>();
        strset.add("Koushik");
        strset.add("Koushik");
        System.out.println(strset);
    }
}
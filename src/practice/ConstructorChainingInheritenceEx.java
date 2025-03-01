package practice;

public class ConstructorChainingInheritenceEx {
    public static void main(String[] args) {
        Employee e1 = new Employee(123, "Koushik", 23000);


    }
}

class Person {
    String name;
    int personnumber;
    Person(String name, int personnumber){
        this.name = name;
        this.personnumber = personnumber;
        System.out.println("Person name and number is " +this.name +" "+this.personnumber);
    }
}

class Employee extends Person {
    double salary;
    Employee(int pno, String name, double salary){
        super(name, pno);
        this.salary=salary;
        System.out.println("Employee name is "+super.personnumber +" "+super.name +" having salary "+this.salary);
    }

}